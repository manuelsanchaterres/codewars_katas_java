package numberAndIpAdress;
import java.util.regex.Pattern;

public class NumberAndIpAdress {

    public static void main(String[] args) {
        System.out.println(numberAndIPaddress("167969729"));
    }

    static String numberAndIPaddress(String input) {
        
        boolean isIp = checkValidIp(input);
        String output = "";
        output = isIp ? convertToDecimal(input): convertToIp(input);

        return output;
    }

    static boolean checkValidIp(String input) {

        boolean isIp = Pattern.matches(
            "^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$", 
            input
        );

        return isIp;
    }

    static String convertToDecimal(String input){

        String[] inputArray = input.split("\\.");
        String stringValue = "";
        String tempStringValue = "";
        long decimalValue = 0;
        int counter = 0;

        for (String string : inputArray) {
            
            tempStringValue = Integer.toBinaryString(Integer.parseInt(string));

            if (tempStringValue.length() < 8) {

                tempStringValue = "0".repeat(8-(tempStringValue.length()))+tempStringValue;
            }

            stringValue += tempStringValue;
        }
        String[] stringValueArray = stringValue.split("");
        for (int i = stringValueArray.length - 1; i >= 0; i--) {
            decimalValue += Integer.parseInt(stringValueArray[counter])*(Math.pow(2,i));
            counter++;
        }


        return String.valueOf(decimalValue);
    }

    static String convertToIp(String input){

        int[] binaryArray = new int[32];
        long inputLong = Long.parseLong(input);
        int counter = 0;
        String finalIp = "";
        int startIndex = 0;
        int endIndex = startIndex+8;
        String subString = "";
        while (inputLong > 0) {
           
            binaryArray[counter] = (int) (inputLong % 2);
            inputLong /= 2;
            counter++;
        }
        String reversedArrayString = "";

        for (int i = binaryArray.length - 1; i >= 0; i--) {
            reversedArrayString += String.valueOf(binaryArray[i]);
        }
        
        for (int j = 0; j <= 3; j++) {

            subString = reversedArrayString.substring(startIndex,endIndex);
            String binaryToDecimal = computeDecimal(subString);
            if (j == 3) {

                finalIp += binaryToDecimal;
            } else {

                finalIp += binaryToDecimal+".";
            }
            
            startIndex += 8;
            endIndex +=8;
        }
        return finalIp;
    }

    static String computeDecimal(String subString) {

        int counter = 0;
        int decimalValue = 0;
        String[] stringValueArray = subString.split("");
        for (int i = stringValueArray.length - 1; i >= 0; i--) {
            decimalValue += Integer.parseInt(stringValueArray[counter])*(Math.pow(2,i));
            counter++;
        }

        return String.valueOf(decimalValue);
    }

   
}
