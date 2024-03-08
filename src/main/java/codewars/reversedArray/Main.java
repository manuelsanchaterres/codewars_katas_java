package reversedArray;
import java.util.Arrays;

public class Main {
    // SOLUCIÓN PROFESOR

    // public static int[] digitize(long n) {
    //     // If the number is 0, return an array with a single element 0
    //     if (n == 0) return new int[]{0};

    //     // Count the number of digits in the number
    //     long temp = n;
    //     int length = 0;
    //     while (temp > 0) {
    //         length++;
    //         temp /= 10;
    //     }

    //     // Create an array of the same length as the number of digits
    //     int[] result = new int[length];

    //     // Fill the array with the digits of the number in reverse order
    //     for (int i = 0; i < length; i++) {
    //         result[i] = (int) (n % 10);
    //         n /= 10;
    //     }

    //     return result;
    // }
    
    // MI SOLUCIÓN
    public static int[] digitize(long n) {  

        long number = n;
        int digitFromNumber = 0;
        int[] reservedNumber = {0};
        if (number == 0) {
            return reservedNumber;
        } else {
            
            for (int i=0; i < reservedNumber.length; i++) {
                
                if (number/ 10 == 0){

                    reservedNumber[i] = (int) number%10;
                    break;
                }

                digitFromNumber = (int) number%10;
                number /=10;
                /* assign isolated digit to its correspondent position 
                in reservedNumber array*/ 
                reservedNumber[i] = digitFromNumber;
                /* create new array by copying the previous array value and increase its dimension (original length 
                equals (i + 1), new length (i+1) + 1*/ 
                reservedNumber = Arrays.copyOf(reservedNumber, i + 2);
            }
            
            return reservedNumber;

        }

    }
   

    public static void main(String[] args) {
        // Test the digitize function with a number
        long number = 35231;
        int[] digits = digitize(number);

        // Print the digits
        for (int digit : digits) {
            System.out.println(digit);
        }
    }
}
