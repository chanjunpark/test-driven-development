package abstractclass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    
    @Test
    void create() {
        Car car = new Sedan();
        assertEquals("SEDAN", car.WHAT_IS_THIS);
        
    }
}