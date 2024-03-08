package codewars.basicEncryption;

public class basicEncryption {

    public static void main(String[] args) {

        System.out.println(encrypt("ylyjmzazkygdxuuiacwvvvcnytslqcfljp",313));
    }
    public static String encrypt(String text, int rule) {
        
        String encryptedText = "";
        char charTextItem;
        int textASCIIValue = 0;
        int encryptedASCIIValue = 0;
        char encryptedASCIICharacter;
        for (int index = 0; index < text.length(); index++) {
            
            charTextItem = text.charAt(index);
            textASCIIValue = (int) charTextItem;
            encryptedASCIIValue = textASCIIValue + rule;

            if (encryptedASCIIValue > 255){

                encryptedASCIIValue %=256;
            }

            encryptedASCIICharacter = (char) encryptedASCIIValue;
            encryptedText += encryptedASCIICharacter;


            
        }
        
        return encryptedText;
    }
}
