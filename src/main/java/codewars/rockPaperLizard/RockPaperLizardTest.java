package codewars.rockPaperLizard;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class RockPaperLizardTest {
      @Test void player1Wins() {
        assertEquals("Player 1 Won!", RockPaperLizard.rpsls("rock", "lizard"));
        assertEquals("Player 1 Won!", RockPaperLizard.rpsls("paper", "rock"));
        assertEquals("Player 1 Won!", RockPaperLizard.rpsls("scissors", "lizard"));
        assertEquals("Player 1 Won!", RockPaperLizard.rpsls("lizard", "paper"));
        assertEquals("Player 1 Won!", RockPaperLizard.rpsls("spock", "rock"));
      }
    
      @Test void player2Wins() {
        assertEquals("Player 2 Won!", RockPaperLizard.rpsls("lizard","scissors"));
        assertEquals("Player 2 Won!", RockPaperLizard.rpsls("spock","lizard"));
        assertEquals("Player 2 Won!", RockPaperLizard.rpsls("paper","lizard"));
        assertEquals("Player 2 Won!", RockPaperLizard.rpsls("scissors","spock"));
        assertEquals("Player 2 Won!", RockPaperLizard.rpsls("rock","spock"));
      }
    
      @Test void draws() {
        assertEquals("Draw!", RockPaperLizard.rpsls("rock", "rock"));
        assertEquals("Draw!", RockPaperLizard.rpsls("spock", "spock"));
      }
}
