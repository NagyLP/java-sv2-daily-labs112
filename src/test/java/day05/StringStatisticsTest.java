package day05;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class StringStatisticsTest {

    StringStatistics stringStatistics = new StringStatistics();

    @Test
    void testCountChars(){
    Map<Character, Integer> expected = new LinkedHashMap<>();
        expected.put('a', 2);
        expected.put('l', 1);
        expected.put('m', 1);
    assertEquals(expected, stringStatistics.countChars("mala"));

    expected = new LinkedHashMap<>();
        expected.put('a', 1);
        expected.put('l', 2);
        expected.put('m', 2);
        expected.put('a', 4);
    assertEquals(expected, stringStatistics.countChars("alma"));
}

}