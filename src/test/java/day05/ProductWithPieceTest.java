package day05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductWithPieceTest {

    @Test
    void incrementCountTest(){
        ProductWithPiece productWithPiece = new ProductWithPiece(Type.BAKERY);

        assertEquals(Type.BAKERY, productWithPiece.getType());
        productWithPiece.incrementCount();
        assertEquals(2,productWithPiece.getCount());
    }

}