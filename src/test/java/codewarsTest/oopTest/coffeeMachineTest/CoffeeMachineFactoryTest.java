package codewarsTest.oopTest.coffeeMachineTest;

import codewars.oop.coffeeMachine.domain.CoffeeMachine;
import codewars.oop.coffeeMachine.domain.CoffeeMachineFactory;
import codewars.oop.declareWinner.Fighter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class CoffeeMachineFactoryTest {

    CoffeeMachineFactory coffeeMachineFactory = new CoffeeMachineFactory();
    private static Stream<Arguments> testCoffeeMachineFactoryArgumentsProvider() {
        List<Arguments> listWithArguments = List.of(
                Arguments.of((Object) new CoffeeMachine[] { new CoffeeMachine("moccamaster")}, 1),
                Arguments.of((Object) new CoffeeMachine[] { new CoffeeMachine("moccamaster"), new CoffeeMachine("nespresso")}, 2),
                Arguments.of((Object) new CoffeeMachine[] { new CoffeeMachine("moccamaster"), new CoffeeMachine("nespresso"), new CoffeeMachine("sage")}, 3),
                Arguments.of((Object) new CoffeeMachine[] { new CoffeeMachine("moccamaster"), new CoffeeMachine("nespresso"), new CoffeeMachine("sage"), new CoffeeMachine("seattle")}, 4),
                Arguments.of((Object) new CoffeeMachine[] { new CoffeeMachine("moccamaster"), new CoffeeMachine("nespresso"), new CoffeeMachine("sage"), new CoffeeMachine("seattle"), new CoffeeMachine("breville")}, 5)

        );
        return listWithArguments.stream();
    }
    @ParameterizedTest
    @MethodSource("testCoffeeMachineFactoryArgumentsProvider")
    public void testMakeCoffeeMachine(CoffeeMachine[] coffeeMachineList, int expectedListLength) {

        for (int i = 0; i < coffeeMachineList.length; i++) {
            coffeeMachineFactory.makeCoffeeMachine(coffeeMachineList[i]);
        }

        assertAll(
                () -> assertEquals(expectedListLength, coffeeMachineFactory.size(),"Check expected List Length"),
                () -> assertEquals(expectedListLength , coffeeMachineFactory.getListCoffeeMachines().size(),"Check getListCoffeeMachines method")

        );
        assertEquals(expectedListLength, coffeeMachineFactory.size());
        System.out.println(coffeeMachineFactory);
    }
}
