package codewarsTest.oopTest.ship;
import codewars.oop.Ship.Ship;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

// TODO: Replace examples and use TDD development by writing your own tests

class ShipTest {

    @Test
    void emptyShipShouldNotWorthToAboard() {
        Ship ship = new Ship(0 , 0);
        assertEquals(false, ship.isWorthIt(), "<draft: 0, crew: 0>");
    }

    @Test
    void shipWithLotOfBootyWorthToAboard() {
        Ship ship = new Ship(40 , 5);
        assertEquals(true, ship.isWorthIt(), "<draft: 40, crew: 5>");
    }

    private static Stream<Arguments> testWorthToAboardArgumentsProvider() {
        List<Arguments> listWithArguments = List.of(
                Arguments.of(45, 20, false),
                Arguments.of(23, 2, false),
                Arguments.of(14, 5, false),
                Arguments.of(25, 4,false),
                Arguments.of(20, 0, false)

        );
        return listWithArguments.stream();
    }

    @ParameterizedTest
    @DisplayName("Test different Draft And Crew Use Cases")
    @MethodSource("testWorthToAboardArgumentsProvider")
    public void testApagarAparatos(int draft, int crew, boolean isWorthToAboard) {

        assertEquals(isWorthToAboard, new Ship(draft,crew).isWorthIt());

    }
}