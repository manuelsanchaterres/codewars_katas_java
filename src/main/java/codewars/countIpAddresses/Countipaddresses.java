package countIpAddresses;
public class Countipaddresses {

    public static void main(String[] args) {
        System.out.println(ipsBetween("0.0.0.0", "255.255.255.255"));
    }
    public static long ipsBetween(String start, String end) {

        // split start and end by "." separator and calculate difference of arrays
        
        long addressesBetween = 0;
        String[]  binaryStartArray = convertToBinary(start).split("");
        String[]  binaryEndArray = convertToBinary(end).split("");
        long startDecimal = convertToDecimal(binaryStartArray);
        long endDecimal = convertToDecimal(binaryEndArray);
        addressesBetween = endDecimal - startDecimal;
		return addressesBetween;
	}

    static String convertToBinary (String input){

        String[] stringArray = input.split("\\.");
        String binaryString = "";
        int minimumBinaryRepresentationDigits = 8;
        for (int i = 0; i < stringArray.length; i++) {

            stringArray[i] = Integer.toBinaryString(Integer.parseInt(stringArray[i]));

            if (stringArray[i].length() < minimumBinaryRepresentationDigits){

                String extraString = "";

                for (int j = 0; j < (minimumBinaryRepresentationDigits - stringArray[i].length()); j++) {
                    
                    extraString += 0;
                }

                stringArray[i] = extraString + stringArray[i];

            }

            binaryString += stringArray[i];

        }

        return binaryString;
    }

    static long convertToDecimal (String[] arrayBinary){

        long decimalValue = 0;
        int counter = arrayBinary.length - 1;

        for (int index = 0; index < arrayBinary.length; index++) {
            decimalValue += (Integer.parseInt(arrayBinary[index]))*(Math.pow(2,counter));
            counter--;
        }

        return decimalValue;
    }
}
