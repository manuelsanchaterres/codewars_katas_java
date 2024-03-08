package convertHexToRGB;

import java.util.HashMap;

public class convertHexToRGB {
    public static void main(String[] args) {
        System.out.println(hexStringToRGB("#beaded"));
    }

    public static HashMap<String, Integer> hexStringToRGB(String hex) {
        long start1 = System.nanoTime();
        // hash table to store correlation between hexadecimal and their correspondent decimal value
        HashMap<String,Integer> hexDecimalValuesTable = new HashMap<String,Integer>();
        hexDecimalValuesTable = fillHashHexadecimalsTable(hexDecimalValuesTable);
        String noHashTagHex = hex.replace("#", "");
        String[] binaryConvertedValues = new String[noHashTagHex.length()];

        // hash table to store final formatted RGB values.
        HashMap<String,Integer> finalRGBHashMap = new HashMap<String,Integer>();

        // converting decimal values from hash table hexDecimalValuesTable to binary String.
        for (int i = 0; i < binaryConvertedValues.length; i++) {
            String hashtableKey = String.valueOf(noHashTagHex.charAt(i)).toUpperCase();
            binaryConvertedValues[i] = convertToBinary(hexDecimalValuesTable.get(hashtableKey));
        }
        // fill final formatted RGB values.
        finalRGBHashMap.put("r", convertToDecimal(binaryConvertedValues[0],binaryConvertedValues[1]));
        finalRGBHashMap.put("g", convertToDecimal(binaryConvertedValues[2],binaryConvertedValues[3]));
        finalRGBHashMap.put("b", convertToDecimal(binaryConvertedValues[4],binaryConvertedValues[5]));
        // hex -> {r, g, b}
        long end1 = System.nanoTime();
        System.out.println("Elapsed Time in milliseconds: "+ (end1-start1)/Math.pow(10,6));
        return finalRGBHashMap;
    }

    static HashMap<String,Integer> fillHashHexadecimalsTable (HashMap<String,Integer> hexDecimalValuesTable){

        hexDecimalValuesTable.put("0", 0);
        hexDecimalValuesTable.put("1", 1);
        hexDecimalValuesTable.put("2", 2);
        hexDecimalValuesTable.put("3", 3);
        hexDecimalValuesTable.put("4", 4);
        hexDecimalValuesTable.put("5", 5);
        hexDecimalValuesTable.put("6", 6);
        hexDecimalValuesTable.put("7", 7);
        hexDecimalValuesTable.put("8", 8);
        hexDecimalValuesTable.put("9", 9);
        hexDecimalValuesTable.put("A", 10); 
        hexDecimalValuesTable.put("B", 11);
        hexDecimalValuesTable.put("C", 12);
        hexDecimalValuesTable.put("D", 13);
        hexDecimalValuesTable.put("E", 14);
        hexDecimalValuesTable.put("F", 15);
        return hexDecimalValuesTable;
    }

    static String convertToBinary (int decimalValue){

        String binaryValue = "";
        while (decimalValue > 0){

            binaryValue += decimalValue % 2;
            decimalValue /= 2;
        }

        // order binary value to long
        long decimalOrderedValue = 0;
        for (int i = binaryValue.length()-1; i>=0; i--) {
            char charValue =binaryValue.charAt(i);
            String stringValue = String.valueOf(charValue);
            int integerValue = Integer.parseInt(stringValue);
            int powNumber = (int) Math.pow(10, i);
            decimalOrderedValue += integerValue*powNumber;

        }
        
        binaryValue = String.valueOf(decimalOrderedValue);

        // condition to add left 0's to binary String if length is less than 4.
        if (binaryValue.length() < 4){

            String tempString = "";

            for (int i = 0; i < 4-(binaryValue.length()); i++) {
                tempString+="0";
            }

            binaryValue = tempString+binaryValue;
        }

        return binaryValue;
    }

    static int convertToDecimal (String binaryString1,String binaryString2){

        String fullString = binaryString1 + binaryString2;
        int decimalValue = 0;

        for (int i = 0, counter = fullString.length()-1; i < fullString.length(); i++) {
            
            decimalValue += Integer.parseInt(String.valueOf(fullString.charAt(i)))*Math.pow(2, counter);
            counter--;
        }

        return decimalValue;
    }
}
