package codewars.oop.coffeeMachine.domain;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CoffeeMachine implements CoffeeMachineInterface{

    private String coffeeMachineName = "";
    private Map<String, Integer> numberOfCoffeeTypesMade = new HashMap<String, Integer>();
    private int numberOfCoffeeMade = 0;

    @Override
    public String toString() {
        return "CoffeeMachine{" +
                "coffeeMachineName='" + coffeeMachineName + '\'' +
                ", numberOfCoffeeTypesMade=" + numberOfCoffeeTypesMade +
                ", numberOfCoffeeMade=" + numberOfCoffeeMade +
                '}';
    }

    public CoffeeMachine(String coffeeMachineName){

        this.coffeeMachineName = coffeeMachineName;
    }
    @Override
    public Coffee makeCoffee(String coffeeType) {

        addCoffeeToTypeList(coffeeType);
        return new Coffee(coffeeType);
    }

    public String getCoffeeMachineName(){

        return coffeeMachineName;
    }
    public void addCoffeeToTypeList (String coffeeType){

        int coffeeTypeValue = numberOfCoffeeTypesMade.get(coffeeType) == null ? 0: numberOfCoffeeTypesMade.get(coffeeType);
        coffeeTypeValue++;

        numberOfCoffeeTypesMade.put(coffeeType, coffeeTypeValue);
    }
    public Map<String, Integer> numberOfCoffeeTypesMade() {

        return numberOfCoffeeTypesMade;
    }

    public int numberOfCoffeeMade() {

        int numberOfCoffeeMade = 0;
        Collection<Integer> coffeeTypeValues= numberOfCoffeeTypesMade.values();

        for (Integer coffeeTypeValue: coffeeTypeValues){

            numberOfCoffeeMade += coffeeTypeValue;
        }
        this.numberOfCoffeeMade = numberOfCoffeeMade;
        return numberOfCoffeeMade;
    }
}
