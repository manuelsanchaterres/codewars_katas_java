package codewarsTest.oopTest.dingleMouseTest;
import codewars.oop.dingleMouse.Dinglemouse;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
class DingleMouseTest {

    @Test
    void test() {
        assertEquals(123, Dinglemouse.INST.plus100(23));
        // Err... was that right?
    }

}
