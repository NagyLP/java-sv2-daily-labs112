package day02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MathAlgorithmsTest {

    @Test
    void testBigestDiver() {
        MathAlgorithms mathAlgorithms = new MathAlgorithms();
        assertEquals(10, mathAlgorithms.commonDivisor(10, 20));
        assertEquals(1, mathAlgorithms.commonDivisor(7, 1));
        assertEquals(1, mathAlgorithms.commonDivisor(1, 7));

        Exception ex = assertThrows(ArithmeticException.class, () -> mathAlgorithms.commonDivisor(7, 0));
        assertEquals(String.format("-= Divisor is 0 =- %n Error data: 0%n"),ex.getMessage());
    }
}