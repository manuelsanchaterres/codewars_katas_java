package codewarsTest.oopTest.declareWinnerTest;

import codewars.oop.declareWinner.Fighter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FighterTest {

    private static Stream<Arguments> testFighterArgumentsProvider() {
        List<Arguments> listWithArguments = List.of(
                Arguments.of(15, 2 ,13,"pepito"),
                Arguments.of(15, 0 ,15, "jaimito"),
                Arguments.of(4, 2 ,2, "pablito"),
                Arguments.of(1, 2 ,-1, "pedrito"),
                Arguments.of(1, 0 ,1, "juanita")

        );
        return listWithArguments.stream();
    }
    @ParameterizedTest
    @DisplayName("Comprobar Método receiveDamage, receiveDamage, getHealth y getName")
    @MethodSource("testFighterArgumentsProvider")
    public void testReceiveDamage(int fighterHealth, int enemyDamagePerAttack, int expectedNewHealth, String fighterName) {
        Fighter fighter = new Fighter(fighterName,fighterHealth,4);
        fighter.receiveDamage(enemyDamagePerAttack);

        assertAll(
                () -> assertEquals(expectedNewHealth, fighter.getHealth()),
                () -> assertEquals(fighterName, fighter.getName())
        );


    }
}
