package fruitMachine;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
class Fruitmachine {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final String[][] reels = new String[][]{
			{"Star", "Seven", "Wild", "Bell", "Cherry", "Shell", "Queen", "King", "Jack", "Bar"},
			{"Star", "Wild", "Seven", "Shell", "Jack", "Bar", "Cherry", "Bell", "King", "Queen"},
			{"Cherry", "Bar", "Wild", "Queen", "Seven", "Star", "Shell", "Bell", "King", "Jack"}
		};
			
		//capturedReelItems = {"King","Bell","Bell"};
		final int[] spins = new int[]{4, 2, 4};
		
		// totalScore expected 8
		int totalScore = fruit(reels, spins);
	}
	
	// fruit function returns total score based on reels item combination
	
	static int fruit(final String[][] reels, final int[] spins) {
		
		ArrayList <String> capturedReelItems = captureReelItem(reels,spins);
		List<String> capturedReelItemsList = capturedReelItems;
		int totalScore = 0;
		int totalMatches = compareItems(capturedReelItems);
		String repeatedItemReel = findRepeatedReelItem(capturedReelItems);
		
		if (totalMatches == 2 ) {
			
			List<String> filteredList = capturedReelItemsList.stream()
	                .filter(item -> item != repeatedItemReel)
	                .collect(Collectors.toList());
			// we get the non-repeated element of capturedReelItemsList List
			
			String nonRepeatedItemReel = filteredList.get(0);
			
			totalScore = calculateTotalScore(repeatedItemReel, nonRepeatedItemReel);
			
		} else if (totalMatches == 3) {
			
			totalScore = calculateTotalScore(repeatedItemReel);
		}
		return totalScore;
	};
	
	static ArrayList<String> captureReelItem (final String[][] reels, final int[] spins){
		
		ArrayList <String> capturedReelItems = new ArrayList <String>();
		String capturedReelItem;
		
		for (int i = 0; i < spins.length; i++) {
			
			capturedReelItem = reels[i][spins[i]];
			capturedReelItems.add(capturedReelItem);
			
		}
		
		return capturedReelItems;
		
	}
	
	static int compareItems(ArrayList <String> capturedReelItems) {
		
		int numberMatches = 1;
		
		Collections.sort(capturedReelItems);
		
		for (int i = 1; i < capturedReelItems.size(); i++) {
			
			if (capturedReelItems.get(i).equals(capturedReelItems.get(i-1))) {
				
				numberMatches++;
				
			}
			
		}
		
		
		return numberMatches;
	}
	
	static String findRepeatedReelItem(ArrayList <String> capturedReelItems) {
		
		String repeatedItemReel= "";
		
		Collections.sort(capturedReelItems);
		for (int i = 1; i < capturedReelItems.size(); i++) {
			
			if (capturedReelItems.get(i).equals(capturedReelItems.get(i-1))) { 
				repeatedItemReel = capturedReelItems.get(i);
				return repeatedItemReel;
			}
		}
		
		return repeatedItemReel;
	}
	
	
	static int calculateTotalScore (String repeatedItemReel, String nonRepeatedItemReel) {
		String[] reels = {"Wild","Star","Bell","Shell","Seven","Cherry","Bar","King","Queen","Jack"};
		int[][] scores = {
		{100,10,0},
		{90,9,18},
		{80,8,16},
		{70,7,14},
		{60,6,12},
		{50,5,10},
		{40,4,8},
		{30,3,6},
		{20,2,4},
		{10,1,2},
		};
		
		int indexOfRepeatedItem = Arrays.asList(reels).indexOf(repeatedItemReel);
		int indexOfArrayScoresLists = 0;
		int totalScore = 0;
		
		
			
		if (nonRepeatedItemReel.equals("Wild")) {
			
			indexOfArrayScoresLists = 2;
			totalScore = scores[indexOfRepeatedItem][indexOfArrayScoresLists];
		} else {
			indexOfArrayScoresLists = 1;
			totalScore = scores[indexOfRepeatedItem][indexOfArrayScoresLists];
		}
			
		return totalScore;
	}
	
	static int calculateTotalScore (String repeatedItemReel) {
		
		String[] reels = {"Wild","Star","Bell","Shell","Seven","Cherry","Bar","King","Queen","Jack"};
		int[][] scores = {
		{100,10,0},
		{90,9,18},
		{80,8,16},
		{70,7,14},
		{60,6,12},
		{50,5,10},
		{40,4,8},
		{30,3,6},
		{20,2,4},
		{10,1,2},
		};
		
		int indexOfRepeatedItem = Arrays.asList(reels).indexOf(repeatedItemReel);
		int indexOfArrayScoresLists = 0;
		int totalScore = scores[indexOfRepeatedItem][indexOfArrayScoresLists];
		
		return totalScore;
	}
}
