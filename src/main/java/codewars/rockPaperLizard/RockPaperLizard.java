package codewars.rockPaperLizard;
import java.util.Arrays;

public class RockPaperLizard {
    public static void main(String[] args) {
        System.out.println(rpsls("rock", "lizard"));
    }
    
    static String rpsls(String player1, String player2){
        String[] player1Victories = {"scpa", "paro","roli","lisp","spsc", "scli", "lipa", "pasp","spro","rosc"};
        String[] player2Victories = {"pasc", "ropa","liro","spli","scsp", "lisc", "pali", "sppa","rosp","scro"};
        String newString = player1.substring(0,2)+player2.substring(0,2);
        if (Arrays.asList(player1Victories).contains(newString)){

            return "Player 1 Won!";
        }else if (Arrays.asList(player2Victories).contains(newString)){

            return "Player 2 Won!";
        } else {

            return "Draw!";
        }
    }
}
