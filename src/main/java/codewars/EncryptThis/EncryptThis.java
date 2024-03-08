package EncryptThis;

import java.lang.reflect.Array;

public class EncryptThis {
    public static void main(String[] args) {
        encryptThis("Why can we not all be like that wise old bird");
    }

    static String encryptThis(String text) {
        /*precondition to avoid memories to be filled with unnecesary variable
        initializations*/
        if (text.length()== 0){

            return "";
        }
        String[] wordsArray = text.split(" ");
        char charTextItem;
        int textASCIIValue = 0;
        String stringASCIIValue = "";
        char tempChar;
        char[] charArray;
        String wordString = "";
        String finalString = "";

        for (int i = 0; i < wordsArray.length; i++) {
          
            if (wordsArray[i].length()>1){
                //swap char 1 and last char
                wordString = "";
                charArray= wordsArray[i].toCharArray();
                tempChar = charArray[1];
                charArray[1] = charArray[charArray.length-1];
                charArray[charArray.length-1] = tempChar;
                //create string word through each item of charArray
                for (int j = 0; j < charArray.length; j++) {
                    wordString += charArray[j];
                }
                //char 1 ammendments
                charTextItem = wordString.charAt(0);
                textASCIIValue = (int) charTextItem;
                stringASCIIValue = ""+textASCIIValue;
                wordString = stringASCIIValue+(wordString.substring(1,wordString.length()));

       
            
            }else {

                //char 1 ammendments
                charTextItem = wordsArray[i].charAt(0);
                textASCIIValue = (int) charTextItem;
                stringASCIIValue = ""+textASCIIValue;
                wordString = ""+stringASCIIValue;
                
            }

            if (i == wordsArray.length-1){

                finalString += wordString;
            }else {

                finalString += wordString+" ";
            }   
            

        }

        return finalString;
    }
}
