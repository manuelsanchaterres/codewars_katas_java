package squareDigits;

public class SquareDigits {
    public static void main(String[] args) {
        System.out.println(squareDigits(9119));
    }

    static int squareDigits(int n){
        String[] digitsArray = String.valueOf(n).split("");
        String finalString = "";
        for (int i = 0; i < digitsArray.length; i++) {
            finalString+= String.valueOf((int)(Math.pow(Integer.parseInt(digitsArray[i]),2)));
        }

        return Integer.parseInt(finalString);
    }
}
