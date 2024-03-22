package codewars.oop.declareWinner;

public class DeclareWinner {

    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {

        Fighter[] battle = {fighter1,fighter2};
        int firstAttackerIndex;

        for (int i = 0; i < battle.length; i++) {

            if ((battle[i].getName()).equals(firstAttacker)){

                firstAttackerIndex = i;
            }

        }

        return "";
    }

//    public int firstAttacker(){
//
//
//    }
}
