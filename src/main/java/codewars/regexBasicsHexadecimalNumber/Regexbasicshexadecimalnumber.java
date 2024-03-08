package regexBasicsHexadecimalNumber;

import java.util.regex.Pattern;

public class Regexbasicshexadecimalnumber {
    
    public static void main(String[] args) {
        
        isHexNumber("0X1e5");
    }

    public static boolean isHexNumber(String s) {
        // your code goes here

        System.out.println(s);
        if (s.equals("")) return false;
        
        return Pattern.matches("(^(0x|0X|[0-9A-Fa-f])[0-9A-Fa-f]+)||[0-9A-Fa-f]", s);
    }
}
