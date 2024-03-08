package codewars.arrayDiff;
import java.util.Arrays;

public class Arraydiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2}));
	}
	
	public static int[] arrayDiff(int[] a, int[] b) {
		
		int[] filteredA = Arrays.stream(a)
                .filter(itemArrayA -> Arrays.stream(b).noneMatch(itemArrayB -> itemArrayB == itemArrayA))
                .toArray();
		
		return filteredA;
		
	}
	
}
