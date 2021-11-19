package day05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {

    Store store = new Store();

    @BeforeEach
    void init(){
        store.addProduct(new Product("kenyer",Type.BAKERY,1.2));
        store.addProduct(new Product("alma",Type.FRUIT,1.5));
        store.addProduct(new Product("tej",Type.DIARY,1.2));
        store.addProduct(new Product("tejfol",Type.DIARY,1));
        store.addProduct(new Product("tarja",Type.MEAT,3.5));
    }

    @Test
    void addProductTest(){
        assertEquals(5,store.products.size());
        store.addProduct(new Product("fagyottcucc", Type.FROZZEN,400));
        assertEquals(6,store.products.size());
    }

    @Test
    void numberOfProductByTypeTest(){
        List<ProductWithPiece> result = store.numberOfProductByType();

        assertEquals(4,result.size());
        assertEquals(Type.BAKERY,result.get(0).getType());
        assertEquals(2,result.get(2).getCount());
    }
}