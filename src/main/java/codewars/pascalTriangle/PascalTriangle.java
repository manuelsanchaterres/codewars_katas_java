package pascalTriangle;
import java.util.HashMap;
public class PascalTriangle {
    public static void main(String[] args) {
        System.out.println(generate(60));
    }

    public static long[] generate(int level) {
        HashMap<Integer,long[]> arrayMap = new HashMap<Integer,long[]>();

        for (int i = 1; i <= level; i++) {
            
            if (i == 1){
                long[] newArray = {1L};
                arrayMap.put(i, newArray);
            }else if (i == 2){
                long[] newArray = {1L,1L};
                arrayMap.put(i, newArray);
            }else{
                long[] previousArray = arrayMap.get(i-1);
                long[] newArray = new long[i];

                for (int j = 0; j < newArray.length; j++) {
                    if (j == 0 || j == newArray.length-1){

                        newArray[j] = 1L;
                    }else {

                        newArray[j] = previousArray[j]+previousArray[j-1];
                    }
                    
                }
                arrayMap.put(i, newArray);
                

            }
        }
        
        long[] array = new long[summation(level)];
        int counter=0;
        for (int i = 1; i <= arrayMap.size(); i++) {
            
            for (int j = 0; j < arrayMap.get(i).length; j++) {
                array[counter]= arrayMap.get(i)[j];
                counter++;
            }
        }
        
        return array;
    }

    static int summation(int level){

        int summation = 0;

        for (int i = 1; i <= level; i++) {
            
            summation += i;
        }

        return summation;
    }
    
}
