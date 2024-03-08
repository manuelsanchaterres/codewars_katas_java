package emotionalSort;

import java.util.Arrays;
import java.util.HashMap;

public class EmotionalSort {
    public static void main(String[] args) {
        

        sortEmotions(false,new String[]{":)", "T_T", ":)", ":D", ":D"});
    }
    
    static String[] sortEmotions(boolean order,String[] emotions){

       //true 
       String[] descendingOrderEmotions = {":D", ":)", ":|", ":(", "T_T" };
       //false
        String[] ascendingOrderEmotions = {"T_T", ":(", ":|", ":)", ":D" };

        return order ? sortArray(emotions,descendingOrderEmotions):sortArray(emotions,ascendingOrderEmotions);
    }

    static String[] sortArray(String[] emotions, String[] sortedEmotions){ 
        HashMap<String,Integer> sortedArrayMap = new HashMap<>();
        for (int i = 0; i < sortedEmotions.length; i++) {
            
            sortedArrayMap.put(sortedEmotions[i],i);
        }
        return emotions;
    }
}
