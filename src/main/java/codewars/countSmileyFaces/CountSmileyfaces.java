package codewars.countSmileyFaces;
import java.util.ArrayList;
import java.util.List;

public class CountSmileyfaces {
    
    public static void main(String[] args) {
    	
    	List<String> a =  new ArrayList<String>();
        a.add(":)"); a.add(":D"); a.add("X-}"); a.add("xo)"); a.add(":X"); a.add(":-3"); a.add(":3");
        
      countSmileys(a);
    }
    
    public static int countSmileys(List<String> arr) {
    	
	   String validEyes = ":;";
	   String validNose = "-~";
	   String validMouth = ")D";
	   String[] newfaceItemArray;
	   int numberValidFaces = 0;
	   
	   // first of all we validate if array contains any item
	   
	   if (arr.size() == 0) {
		   
		   return numberValidFaces;
	   }
	   
	   /* if arr contains any item we proceed by iterating over this array */
	   
	   for (String faceInArr : arr) {
		   
		   newfaceItemArray = faceInArr.split("");
		   /* first element of newfaceItemArray newfaceItemArray[0] correspons to face eye */
		   if (validEyes.contains(newfaceItemArray[0])) {
			   
			   if (newfaceItemArray.length == 2) {
				   
				   /* second item newfaceItemArray[1] correspons to face mouth */
				   
				   if (validMouth.contains(newfaceItemArray[1])) {
					   
					   /* if true face will be valid and numberValidFaces counter will increase in 1 one */
					   numberValidFaces++;
				   }
			   } else if (newfaceItemArray.length == 3) {
				   
				   /* we need to confirm that validNose array contains element 2 of newfaceItemArray and that validMouth array contains element 3 of newfaceItemArray */
				   
				   if (validNose.contains(newfaceItemArray[1]) && validMouth.contains(newfaceItemArray[2])) {
					   
					   /* if true face will be valid and numberValidFaces counter will increase in 1 one */
					   numberValidFaces++;
				   }
			   }
		   }
	   }
	   
       return numberValidFaces;
    }
   
}
