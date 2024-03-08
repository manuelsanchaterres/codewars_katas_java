package Pokerhandflush;
import java.util.Arrays;
import java.util.List;

public class Pokerhandflush {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	String[] cards = {"QD", "4D", "10D", "KD", "5D"};
		String[] cardValues = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};		
		if (checkValueCardIsValid(cardValues, cards) && checkValueSuitIsValid(cardValues, cards)) {

			if (CheckIfFlush(cards)){
				System.out.println("Todas son del mismo palo");
			} else{
				System.out.println("No son Todas son del mismo palo");
			}
    	} else {
    		
    		System.out.println("Valores o palo no cumplen con los requisitos");
    	}
	}
	
    public static boolean CheckIfFlush(String[] cards) {
		
		String cardSuit = "";
		String currentCardSuit;
		boolean allCardSameSuit = true;
		for (int i = 0; i < cards.length; i++) {

			currentCardSuit = cards[i].split("")[1];
			if (cards[i].split("")[0].equals("1") && cards[i].split("")[1].equals("0")) {
				currentCardSuit = cards[i].split("")[2];		
			}
			
			if (i > 0 && (!currentCardSuit.equals(cardSuit))) {

				allCardSameSuit = false;
				return allCardSameSuit;
			}
			
			cardSuit = currentCardSuit;
		}

		return allCardSameSuit;
		
    }
    public static boolean checkValueCardIsValid(String[] cardValues, String[] pokerCards) {
    	
    	// convert cardValues Array to List type to use contains method
    	 List cardValuesList = Arrays.asList(cardValues);
    	 boolean isValueValid = false;
    	for (int i = 0; i < pokerCards.length; i++) {
    		
    		String cardValue = pokerCards[i].split("")[0];
    		System.out.println(pokerCards[i]);
    		if (!cardValuesList.contains(cardValue)) {
    			
    			if (cardValue.equals("1") && pokerCards[i].split("")[1].equals("0")) {
        			isValueValid = true;
        			return isValueValid;    				
    			}
    			isValueValid = false;
    			
    			return isValueValid;
    		}
    		
    		isValueValid = true;
		}
    	
    	return isValueValid;
    }
    
    public static boolean checkValueSuitIsValid(String[] cardValues, String[] pokerCards) {
    	
    	// convert cardValues Array to List type to use contains method
		String[] cardSuits = {"H", "S", "D", "C"};
		List cardSuitsList = Arrays.asList(cardSuits);
		boolean isSuitValid = false;
    	for (int i = 0; i < pokerCards.length; i++) {
    		
    		String cardSuit = pokerCards[i].split("")[1];
    		
    		if (cardSuit.equals("0")) {
    			
    			cardSuit = pokerCards[i].split("")[2];
    		}
    		if (!cardSuitsList.contains(cardSuit)) {
    			
    			isSuitValid = false;
    			
    			return isSuitValid;
    		}
    		
    		isSuitValid = true;
		}
    	
    	return isSuitValid;
    }    


}
