package day04.hangman;

import java.util.Scanner;

public class HangmanMain {
    private String wordToFind = "alma";
    private String wordFound = "____";
    private int chances = 8;

    public static void main(String[] args) {
        new HangmanMain().run();
    }

    private void run() {
        Scanner scnr = new Scanner(System.in);
        while (!wordFound.equals(wordToFind) && chances > 0){
            System.out.println("Itt tartunk : " + wordFound);
            System.out.println("Hatralevo tippek szama: "+ chances);
            System.out.println("Kovetkezo tipped? :");
            String scannedGuess = scnr.nextLine();
            if (!wordFound.contains(scannedGuess)){
                System.out.println("Rossz valasz");
                chances--;
            }else{
                wordFound = updateWordFound(wordToFind,wordFound,scannedGuess);
            }
        }

        if(wordToFind.equals(wordFound)){
            System.out.println("Nyertel!");
        } else {
            System.out.println("Nem nyert.");
        }


    }

    private String updateWordFound(String wordToFind, String status, String guess) {
        char[] chars = status.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (wordToFind.charAt(i) == guess.charAt(0)) {
                chars[i] = guess.charAt(0);
            }
        }
        return new String(chars);
    }

}