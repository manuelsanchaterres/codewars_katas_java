package multiples3Or5;

public class Multiples3Or5 {

    public static void main(String[] args) {
        solution(16);
    }

    static int solution(int number){

        int sumMultiples = 0;

        for (int i = 0; i < number; i++) {
            
            if (i%3 == 0 || i%5 == 0){

                sumMultiples += i;
            }
        }

        return sumMultiples;
    }
}
