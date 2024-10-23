package delft;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;


class ConvertRomanToNumberTest {


    @Test
    public void testConvertSingleDigits() {
        assertEquals(1, ConvertRomanToNumber.convertStringToNumber("I"));
        assertEquals(5, ConvertRomanToNumber.convertStringToNumber("V"));
        assertEquals(10, ConvertRomanToNumber.convertStringToNumber("X"));
    }

    @Test
    public void testConvertComplexNumerals() {
        assertEquals(4, ConvertRomanToNumber.convertStringToNumber("IV"));
        assertEquals(9, ConvertRomanToNumber.convertStringToNumber("IX"));
        assertEquals(40, ConvertRomanToNumber.convertStringToNumber("XL"));
        assertEquals(90, ConvertRomanToNumber.convertStringToNumber("XC"));
        assertEquals(400, ConvertRomanToNumber.convertStringToNumber("CD"));
        assertEquals(900, ConvertRomanToNumber.convertStringToNumber("CM"));
    }

    @Test
    public void testConvertWithSubtractiveNotation() {
        assertEquals(44, ConvertRomanToNumber.convertStringToNumber("XLIV"));
        assertEquals(99, ConvertRomanToNumber.convertStringToNumber("XCIX"));
        assertEquals(194, ConvertRomanToNumber.convertStringToNumber("CXCIV"));
    }

    @Test
    public void testAddNumerals() {
        assertEquals(2, ConvertRomanToNumber.add("I", "I"));
        assertEquals(20, ConvertRomanToNumber.add("X", "X"));
        assertEquals(60, ConvertRomanToNumber.add("L", "X"));
    }

    @Test
    public void testAddComplexNumerals() {
        assertEquals(11, ConvertRomanToNumber.add("VI", "V"));
        assertEquals(100, ConvertRomanToNumber.add("L", "L"));
        assertEquals(2010, ConvertRomanToNumber.add("M", "MX"));
    }

    @Test
    public void testLargeNumerals() {
        assertEquals(1000, ConvertRomanToNumber.convertStringToNumber("M"));
        assertEquals(1984, ConvertRomanToNumber.convertStringToNumber("MCMLXXXIV"));
        assertEquals(2023, ConvertRomanToNumber.convertStringToNumber("MMXXIII"));
    }

    @Test
    public void testInvalidInputs() {
        assertThrows(IllegalArgumentException.class, () -> ConvertRomanToNumber.convertStringToNumber("IIII"));
        assertThrows(IllegalArgumentException.class, () -> ConvertRomanToNumber.convertStringToNumber("VV"));
        assertThrows(IllegalArgumentException.class, () -> ConvertRomanToNumber.convertStringToNumber("LL"));
        assertThrows(IllegalArgumentException.class, () -> ConvertRomanToNumber.convertStringToNumber("A"));
        assertThrows(IllegalArgumentException.class, () -> ConvertRomanToNumber.convertStringToNumber("Roman"));
    }
}


