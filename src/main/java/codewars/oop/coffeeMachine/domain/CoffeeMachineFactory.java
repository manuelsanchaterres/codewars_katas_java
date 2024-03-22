package codewars.oop.coffeeMachine.domain;

import codewars.oop.coffeeMachine.domain.CoffeeMachineInterface;

import java.util.ArrayList;

public class CoffeeMachineFactory {

    ArrayList<CoffeeMachine> listCoffeeMachines = new ArrayList<CoffeeMachine>();

    @Override
    public String toString() {
        return "CoffeeMachineFactory{" +
                "listCoffeeMachines=" + listCoffeeMachines +
                '}';
    }

    public CoffeeMachineFactory(){


    }
    public CoffeeMachine buyCoffeeMachine() {

        int randomIndex = (int) Math.floor(Math.random()*(listCoffeeMachines.size()+1));

        return listCoffeeMachines.get(randomIndex);
    }

    public void makeCoffeeMachine(CoffeeMachine coffeeMachine)
    {
        listCoffeeMachines.add(coffeeMachine);

    }

    public int size(){

        return listCoffeeMachines.size();
    }

    public ArrayList<CoffeeMachine> getListCoffeeMachines(){

        return listCoffeeMachines;
    }


}
