package codewarsTest.oopTest.god;
import codewars.oop.God.God;
import codewars.oop.God.Human;
import codewars.oop.God.Man;
import codewars.oop.God.Woman;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class GodTest {
    @Test
    @DisplayName("Check if makingAdam is instance of Man")
    public void makingAdam(){
        Human[] paradise = God.create();
        assertEquals(true ,paradise[0] instanceof Man,"Adam is a man");
    }

    @Test
    @DisplayName("Check if makingEve is instance of Woman")
    public void makingEve(){
        Human[] paradise = God.create();
        assertEquals(true ,paradise[1] instanceof Woman,"Eve is a woman");
    }

}