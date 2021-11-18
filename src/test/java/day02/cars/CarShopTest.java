package day02.cars;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarShopTest {

    CarShop carShop = new CarShop("BestCars", 100);

    @Test
    void createCarshopTest(){
        assertEquals("BestCars",carShop.getName());
        assertEquals(100,carShop.getPriceLimit());
        assertEquals(0,carShop.getCarsForSell().size());

    }

    @Test
    void addCarWithValidPriceTest(){
        boolean result = carShop.addCar(new Car("BMW",2.5,Color.BLACK,99));

        assertTrue(result);
        assertEquals(1,carShop.getCarsForSell().size());
        assertEquals("BMW",carShop.getCarsForSell().get(0).getBrand());
    }

    @Test
    void addCarWithInvalidPriceTest(){
        boolean result = carShop.addCar(new Car("BMW",2.5,Color.BLACK,101));

        assertFalse(result);
        assertEquals(0, carShop.getCarsForSell().size());
    }

    @Test
    void sumPriceCarsTest(){
        carShop.addCar(new Car("BMW",2.5,Color.BLACK,90));
        carShop.addCar(new Car("BMW",2.5,Color.BLACK,80));
        carShop.addCar(new Car("BMW",2.5,Color.BLACK,70));

        assertEquals(240, carShop.sumCarPrice());
    }

    @Test
    void numberOfCarsCheaperThanTest(){

        carShop.addCar(new Car("BMW",2.5,Color.BLACK,90));
        carShop.addCar(new Car("BMW",2.5,Color.BLACK,80));
        carShop.addCar(new Car("BMW",2.5,Color.BLACK,50));
        carShop.addCar(new Car("BMW",2.5,Color.BLACK,40));

        assertEquals(2, carShop.numberOfCarsCheaperThan(60));
    }

}