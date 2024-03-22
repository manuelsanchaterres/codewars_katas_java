package codewars.oop.coffeeMachine.domain;

public class CoffeeMachine implements CoffeeMachineInterface{

    private String coffeeMachineName = "";

    @Override
    public String toString() {
        return "CoffeeMachine{" +
                "coffeeMachineName='" + coffeeMachineName + '\'' +
                '}';
    }

    public CoffeeMachine(String coffeeMachineName){

        this.coffeeMachineName = coffeeMachineName;
    }
    @Override
    public Coffee makeCoffee(String coffeeType) {
       return new Coffee(coffeeType);
    }

    public String getCoffeeMachineName(){

        return coffeeMachineName;
    }
}
