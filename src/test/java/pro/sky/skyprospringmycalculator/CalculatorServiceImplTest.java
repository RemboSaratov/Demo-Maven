package pro.sky.skyprospringmycalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplTest {

    CalculatorServiceImpl service = new CalculatorServiceImpl();

    @Test
    void plus() {
        assertEquals(3, service.plus(1,2));
        assertEquals(1, service.plus(-1,2));
        assertEquals(-1, service.plus(1,-2));
        assertEquals(1, service.plus(1,0));
        assertEquals(2, service.plus(0,2));
        assertEquals(-3, service.plus(-1,-2));
    }

    @Test
    void minus() {
        assertEquals(-1, service.minus(1,2));
        assertEquals(-3, service.minus(-1,2));
        assertEquals(3, service.minus(1,-2));
        assertEquals(1, service.minus(1,0));
        assertEquals(-2, service.minus(0,2));
        assertEquals(1, service.minus(-1,-2));
    }

    @Test
    void multiply() {
        assertEquals(2, service.multiply(1,2));
        assertEquals(-2, service.multiply(-1,2));
        assertEquals(-2, service.multiply(1,-2));
        assertEquals(0, service.multiply(1,0));
        assertEquals(0, service.multiply(0,2));
        assertEquals(2, service.multiply(-1,-2));
    }

    @Test
    void divide() {
        assertEquals(0.5, service.divide(1,2));
        assertEquals(-0.5, service.divide(-1,2));
        assertEquals(-0.5, service.divide(1,-2));
        assertThrows(IllegalArgumentException.class, () -> service.divide(1,0));
        assertEquals(0, service.divide(0,2));
        assertEquals(0.5, service.divide(-1,-2));
    }
}