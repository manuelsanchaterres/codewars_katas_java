package transformPrime;

public class Transformprime {
    public static void main(String[] args) {
       System.out.println(minimumNumber(new int[]{5,2}));
    }

    public static int minimumNumber(int[] numbers){

        int sumNumbers=0;
        int minimumNumber = 0;
        boolean isNotPrime = true;
        int numberToCheckPrime;
        int divisorsCounter = 0;
        for (int number : numbers) {
            
            sumNumbers += number;
        }

        while (isNotPrime) {
            
            numberToCheckPrime = sumNumbers + minimumNumber;

            for (int i = 2; i < numberToCheckPrime; i++) {
                
                // numberToCheckPrime is not Prime, so minimumNumber increases by 1
                if (numberToCheckPrime % i == 0){
                    divisorsCounter++;
                    minimumNumber++;
                    break;
                } 
            }

            if (divisorsCounter == 0){

                isNotPrime = false;
            }

            divisorsCounter = 0;
        }
        return minimumNumber;
    }
}
