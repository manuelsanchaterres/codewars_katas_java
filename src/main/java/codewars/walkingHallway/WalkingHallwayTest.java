package codewars.walkingHallway;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WalkingHallwayTest {
    @Test
    public void testContact() {
        assertEquals(1, WalkingHallway.contact("---><----"));
        assertEquals(1, WalkingHallway.contact("--->-<------->----<-"));
        assertEquals(-1, WalkingHallway.contact("----<----->----"));
        assertEquals(2, WalkingHallway.contact(">-----<-->--<-----")); 
        assertEquals(3, WalkingHallway.contact(">>-----<<")); 
        assertEquals(5, WalkingHallway.contact(">---------------<--------------------------<-------->---------<------->----------<----<---->>----------<------->>>---------------<<------>"));
    }
    public void testContact2() {
        assertEquals(1, WalkingHallway.contact("---><----"));
        assertEquals(1, WalkingHallway.contact("--->-<------->----<-"));
        assertEquals(-1, WalkingHallway.contact("----<----->----"));
        assertEquals(2, WalkingHallway.contact(">-----<-->--<-----")); 
        assertEquals(3, WalkingHallway.contact(">>-----<<")); 
        assertEquals(5, WalkingHallway.contact(">---------------<--------------------------<-------->---------<------->----------<----<---->>----------<------->>>---------------<<------>"));
    } 
}
