package regexBasics;

import java.util.regex.Pattern;

public class RegexBasics {
    
    public static void main(String[] args) {
        
        isDigit("54121");
    }

    public static boolean isDigit(String s) {
        // your code goes here
        
        return Pattern.matches("\\d+", s);
    }
}
