package countDivisibleNumbers;
public class CountDivisibleNumbers {
    public static void main(String[] args) {

        System.out.println(divisibleCount(101, Integer.MAX_VALUE, 11));
    }

    static long divisibleCount(long x, long y, long k) {
        long start1 = System.nanoTime();
        long countDivisibleNumbers = 0;
        
        for (long i = x ; i <= y;i++){

            if (i < Integer.MAX_VALUE){

                i = (int) i;
            }
             // Use modulo arithmetic to calculate the remainder (i - ((int)(i/k)))
            if (((i - (k*((int)(i/k))))) == 0){

                countDivisibleNumbers++;
            }
        }
        long end1 = System.nanoTime();
        System.out.println("Elapsed Time in milliseconds: "+ (end1-start1)/Math.pow(10,6));
        return countDivisibleNumbers;
    } 
}
