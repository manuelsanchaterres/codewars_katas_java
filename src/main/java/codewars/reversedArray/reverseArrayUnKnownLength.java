// https://www.codewars.com/kata/5583090cbe83f4fd8c000051
package reversedArray;
import java.util.Arrays;
import java.util.Scanner;
public class reverseArrayUnKnownLength {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Introduce valor a girar (hasta 10 dígitos por casting posterior a int): ");
        long number = input.nextLong();
        System.out.println(Arrays.toString(digitize(number)));
    }

    // public static int[] digitize(long n) {  

    //     int number = (int) n;
    //     int digitFromNumber = 0;

    //     if (number == 0) {

    //         int[] reversedNumber = {0};
    //         return reversedNumber;

    //     } else {

    //         int[] reversedNumber = {0};

    //         for (int i=0; i < reversedNumber.length; i++) {
                
    //             if (number/ 10 == 0){

    //                 reversedNumber[i] = number%10;
    //                 break;
    //             }

    //             digitFromNumber = number%10;
    //             number /=10;
    //             reversedNumber[i] = digitFromNumber;
    //             reversedNumber = Arrays.copyOf(reversedNumber, i + 2);
    //         }
            
    //         return reversedNumber;

    //     }

    // }
    
    // dealing with manual casting long -> int to pass test array number length >=11.
    
    public static int[] digitize(long n) {  

        long number = n;
        int digitFromNumber = 0;
        int[] reversedNumber = {0};
        if (number == 0) {
            return reversedNumber;
        } else {
            
            for (int i=0; i < reversedNumber.length; i++) {
                
                if (number/ 10 == 0){

                    reversedNumber[i] = (int) (number%10);
                    return reversedNumber;
                }

                digitFromNumber = (int) (number%10);
                number /=10;
                /* assign isolated digit to its correspondent position 
                in reversedNumber array*/ 
                reversedNumber[i] = digitFromNumber;
                /* create new array by copying the previous array value and increase its dimension (original length 
                equals (i + 1), new length (i+1) + 1*/ 
                int[] newReversedNumber = reversedNumber;
                reversedNumber = new int[i+2];
                for (int j = 0; j < newReversedNumber.length; j++){

                    reversedNumber[j] = newReversedNumber[j];

                }
                // reversedNumber = Arrays.copyOf(reversedNumber, i + 2);
            }
            
            return reversedNumber;

        }

    }

}