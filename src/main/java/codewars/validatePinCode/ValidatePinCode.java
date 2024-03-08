package codewars.validatePinCode;

import java.util.regex.Pattern;

public class ValidatePinCode {
    public static void main(String[] args) {
        validatePin("1234");
    }

    public static boolean validatePin(String pin) {
        String regexPINDigits = "^[0-9]{4}$|^[0-9]{6}$";
        //String regexPINDigits = "/^[0-9]({4}||{6})$/";
        boolean stringMatch = Pattern.matches(regexPINDigits, pin);
        System.out.println(stringMatch);
        return stringMatch;
    }
}
