package day02.cars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void newCartTest(){
        Car car = new Car("BMW",2.5,Color.BLACK,10_000_000);

        assertEquals("BMW", car.getBrand());
        assertEquals(2.5, car.getEngineSize());
        assertEquals(Color.BLACK, car.getColor());
        assertEquals(10_000_000, car.getPrice());


    }

    @Test
    void decreasePrice(){
        //given
        Car car = new Car("BMW",2.5,Color.BLACK,10_000_000);
        //when
        car.decreasePrice(25);
        //then
        assertEquals(7_500_000,car.getPrice());
    }




}