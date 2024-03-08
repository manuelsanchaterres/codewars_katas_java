package lengthMissingArray;

public class LengthMissingArray {
    public static void main(String[] args) {
        System.out.println(getLengthOfMissingArray(new Object[][] { }));
    }

    static int  getLengthOfMissingArray(Object[][] arrayOfArrays){

        if (arrayOfArrays == null|| arrayOfArrays.length == 0){

            return 0;
        }
       
        int[] arraysDimensions = new int[arrayOfArrays.length];
        int temp = 0;
        int lengthMissingArray = 0;
        for (int i = 0; i < arraysDimensions.length; i++) {

            if (arrayOfArrays[i] == null|| arrayOfArrays[i].length == 0){

                return 0;
            }else {

                arraysDimensions[i]= arrayOfArrays[i].length;
            }
            
        }
        //bubble sort arraysDimensions

        for (int i = 0; i < arraysDimensions.length; i++) {
            for (int j = 1; j < arraysDimensions.length-i; j++) {
                if (arraysDimensions[j-1]>arraysDimensions[j]){
                    temp = arraysDimensions[j-1];
                    arraysDimensions[j-1] = arraysDimensions[j];
                    arraysDimensions[j] = temp;
                }
            }
        }

        for (int i = 1; i < arraysDimensions.length; i++) {
            
            if (arraysDimensions[i]-arraysDimensions[i-1] == 2) {

                lengthMissingArray= arraysDimensions[i-1]+1;
            }
        }
        return lengthMissingArray;
    }
}
