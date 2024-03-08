package mexicanWave;

import java.util.Arrays;

public class MexicanWave {
    public static void main(String[] args) {
        System.out.println(wave("hello"));
    }

    static String[] wave(String str){

        String[] splittedString = str.split("");
        String[] wordsStorage = new String[splittedString.length];
        String[] tempArray = Arrays.copyOf(splittedString, splittedString.length);
        String letter = "";
        boolean match = false;
        for (int i = 0; i < splittedString.length; i++) {
            
            for (int j = 0; j < tempArray.length && !match; j++) {

                if (String.valueOf(str.charAt(j)).equals(splittedString[i])){

                    letter = tempArray[j].toUpperCase();
                    tempArray[j] = letter;
                    wordsStorage[j] = String.join("", tempArray);
                    match = true;
                    
                }

            }
            match = false;
            tempArray = Arrays.copyOf(splittedString, splittedString.length);
        }
        


        return new String[0];
    }
}
