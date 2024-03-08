package codewars.validatePinCode;

// import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.*;
import org.junit.jupiter.engine.*;
import org.junit.platform.commons.*;

// import org.junit.runners.JUnit4;

public class ValidatePinCodeTest {
    @Test
    public void validPins() {
        assertEquals(true, ValidatePinCode.validatePin("1234"));
        assertEquals(true, ValidatePinCode.validatePin("0000"));
        assertEquals(true, ValidatePinCode.validatePin("1111"));
        assertEquals(true, ValidatePinCode.validatePin("123456"));
        assertEquals(true, ValidatePinCode.validatePin("098765"));
        assertEquals(true, ValidatePinCode.validatePin("000000"));
        assertEquals(true, ValidatePinCode.validatePin("090909"));
    }
    
    @Test
    public void nonDigitCharacters() {
        assertEquals(false, ValidatePinCode.validatePin("a234"));
        assertEquals(false, ValidatePinCode.validatePin(".234"));
    }
    
    @Test
    public void invalidLengths() {
        assertEquals(false, ValidatePinCode.validatePin("1"));
        assertEquals(false, ValidatePinCode.validatePin("12"));
        assertEquals(false, ValidatePinCode.validatePin("123"));
        assertEquals(false, ValidatePinCode.validatePin("12345"));
        assertEquals(false, ValidatePinCode.validatePin("1234567"));
        assertEquals(false, ValidatePinCode.validatePin("-1234"));
        assertEquals(false, ValidatePinCode.validatePin("1.234"));
        assertEquals(false, ValidatePinCode.validatePin("00000000"));
    }
}
