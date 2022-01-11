package day02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MathAlgorithmsTest {

    @Test
    void testBigestDiver() {
        MathAlgorithms mathAlgorithms = new MathAlgorithms();
        assertEquals(10, mathAlgorithms.commonDivisor(10, 20));
        assertEquals(1, mathAlgorithms.commonDivisor(7, 1));
        assertEquals(1, mathAlgorithms.commonDivisor(1, 7));
         }
}