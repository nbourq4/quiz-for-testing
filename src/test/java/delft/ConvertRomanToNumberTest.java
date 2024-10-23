package delft;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class ConvertRomanToNumberTest {
    @Test
    public void testConvertStringToNumber() {
        assertEquals(1, ConvertRomanToNumber.convertStringToNumber("I"));
        assertEquals(2, ConvertRomanToNumber.convertStringToNumber("II"));
        assertEquals(4, ConvertRomanToNumber.convertStringToNumber("IV"));
        assertEquals(5, ConvertRomanToNumber.convertStringToNumber("V"));
    }

    @Test
    public void testAdd() {
        assertEquals(2, ConvertRomanToNumber.add("I", "I"));
        assertEquals(6, ConvertRomanToNumber.add("V", "I"));
        assertEquals(20, ConvertRomanToNumber.add("X", "X"));
    }
}
