package day02.cars;

import java.util.ArrayList;
import java.util.List;

public class CarShop {

    private String name;
    private int priceLimit;
    private List<Car> cars = new ArrayList<>();

    public CarShop(String name, int priceLimit) {
        this.name = name;
        this.priceLimit = priceLimit;
    }

     public boolean addCar(Car car){
        if (car.getPrice() > priceLimit){
            return false;
        }
        cars.add(car);
        return true;
     }

     public int sumCarPrice(){
        int sum = 0;
        for (Car actual : cars){
            sum += actual.getPrice();
        }
        return sum;
    }

    public int numberOfCarsCheaperThan(int price){
        int count = 0;
        for (Car actual: cars){
            if(actual.getPrice() <= price){
                count++;
            }
        }
        return count;
    }

    public List<Car> carsWithBrand(String brand){
        List<Car> result = new ArrayList<>();
        for (Car actual : cars){
            if(actual.getBrand().equalsIgnoreCase(brand)){
                result.add(actual);
            }
        }
        return result;
    }

    public String getName() {
        return name;
    }

    public int getPriceLimit() {
        return priceLimit;
    }

    public List<Car> getCarsForSell() {
        return cars;
    }
}
