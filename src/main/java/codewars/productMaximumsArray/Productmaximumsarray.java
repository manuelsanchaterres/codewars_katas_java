package productMaximumsArray;

import java.util.Arrays;

public class Productmaximumsarray {

    public static void main(String[] args) {
        maxProduct(new int[]{13,12,-27,-302,25,37,133,155,-14}, 5);
    }

    public static long maxProduct(int[] numbers, int sub_size){

        int temp;

        // Arrays.sort(numbers);

        //BUBLE ARRAY SORT METHOD

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                
                if (numbers[i] > numbers[j]){

                    temp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = temp;
                }
            }
        }
        long maxProduct = 1;
        for (int i = numbers.length - 1; i >= numbers.length-sub_size ; i-- ){

            maxProduct *= numbers[i];

        }

        return maxProduct; // Do your magic!
    }
}
