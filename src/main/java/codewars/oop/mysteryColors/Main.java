package codewars.oop.mysteryColors;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        MysteryColorAnalyzerImpl colorImplementation = new MysteryColorAnalyzerImpl();
        List<Color> colorsList = new ArrayList<>();
        colorsList.add(Color.GREEN);
        colorsList.add(Color.BLUE);
        colorsList.add(Color.RED);
        colorsList.add(Color.GREEN);
        colorsList.add(Color.RED);
        System.out.println(colorImplementation.numberOfDistinctColors(colorsList));
        System.out.println(colorImplementation.colorOccurrence(colorsList, Color.RED));
    }
}
