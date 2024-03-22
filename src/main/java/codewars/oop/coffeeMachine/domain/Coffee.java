package codewars.oop.coffeeMachine.domain;

public class Coffee {

    private String type = "";
    public Coffee (String type){
        this.type = type;
    }
    public final String getType() {
        return type;
    }

}