package sumArrayUniqueItems;

import java.util.ArrayList;

public class Sumarrayuniqueitems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arrayNumbers = {4,5,7,5,4,8};
		System.out.println(repeats(arrayNumbers));
	}
	
	public static int repeats(int[] arrayNumbers) {
		
		ArrayList<Integer> uniqueNumbersArray = new ArrayList<>();
		boolean numberIsUnique = true;
		int sumUniqueNumbers = 0;
		
		for (int i = 0; i < arrayNumbers.length; i++) {
			
			for (int j = 0; j < arrayNumbers.length; j++) {
				
				if (i != j) {
					
					if (arrayNumbers[i] == arrayNumbers[j]) {
						
						numberIsUnique = false;
						
						break;
					}
					
				} else {
					
					continue;
				}
				
				numberIsUnique = true;
			}
			
			if (numberIsUnique) {
				
				uniqueNumbersArray.add(arrayNumbers[i]);
			}
		}
		
		for (int i = 0; i < uniqueNumbersArray.size(); i++) {
			
			sumUniqueNumbers += uniqueNumbersArray.get(i);
		}
		
		return sumUniqueNumbers;
	}
}
