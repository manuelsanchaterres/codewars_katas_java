package goodsEvils;

import java.util.Arrays;

class GoodEvils {

    public static void main(String[] args) {
        
        System.out.println(battle("0 0 0 0 0 10", "0 1 1 1 1 0 0"));
    }

    public static String battle(String goodAmounts, String evilAmounts) {

        Race[] goodRaces = {

            new Race("Hobbits", 1),
            new Race("Men", 2),
            new Race("Elves", 3),
            new Race("Dwarves", 3),
            new Race("Eagles", 4),
            new Race("Wizards", 10),
        };

        Race[] evilRaces = {

            new Race("Orcs", 1),
            new Race("Men", 2),
            new Race("Wargs", 2),
            new Race("Goblins", 2),
            new Race("Uruk Hai", 3),
            new Race("Trolls", 5),
            new Race("Wizards", 10),
        };

        int goodRacesWorthValue = computeRacesWorth(goodAmounts, goodRaces);
        int evilRacesWorthValue = computeRacesWorth(evilAmounts, evilRaces);
        String winnerForceDecision = decideWinnerForce (goodRacesWorthValue, evilRacesWorthValue);

        return winnerForceDecision;
    }

    static int computeRacesWorth(String forceAmounts, Race[] forceRaces){
        
        String[] forceAmountsArray = forceAmounts.split(" ");
        int totalForceWorthPoints = 0;
        int raceWorthPoints = 0;
       
        for (int i = 0; i < forceAmountsArray.length; i++) {
            raceWorthPoints = forceRaces[i].getRaceWorthPoints();
            totalForceWorthPoints += (Integer.parseInt(forceAmountsArray[i]) * raceWorthPoints);
    
        }

        return totalForceWorthPoints;
    }

    static String decideWinnerForce(int goodRacesWorthValue, int evilRacesWorthValue){

        String winnerForceDecision = "";

        if (goodRacesWorthValue > evilRacesWorthValue){

            winnerForceDecision = "Battle Result: Good triumphs over Evil";

        } else if (evilRacesWorthValue > goodRacesWorthValue){

            winnerForceDecision = "Battle Result: Evil eradicates all trace of Good";
        } else {

            winnerForceDecision = "Battle Result: No victor on this battle field";
        }

        return winnerForceDecision;
    }
}
