package countSmileyFaces;
import java.util.regex.Pattern;
public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		isDigit("5");
	}

	 public static boolean isDigit(String s) {
		    // your code goes here
		   return Pattern.matches("/^\\d+$/", s);
		   
	}
}
