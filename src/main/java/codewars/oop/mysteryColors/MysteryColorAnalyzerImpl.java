package codewars.oop.mysteryColors;

import java.util.ArrayList;
import java.util.List;

public class MysteryColorAnalyzerImpl implements MysteryColorAnalyzer{

    @Override
    public int numberOfDistinctColors(List<Color> mysteryColors) {
        System.out.println(mysteryColors.toString());
        List<Color> distinctColors = new ArrayList<>();
        for (int i = 0; i < mysteryColors.size(); i++) {

            if (!distinctColors.contains(mysteryColors.get(i))){

                distinctColors.add(mysteryColors.get(i));
            }

        }
        return distinctColors.size();
    }

    @Override
    public int colorOccurrence(List<Color> mysteryColors, Color color) {

        int colorOccurrence = 0;

        for (int i = 0; i < mysteryColors.size(); i++) {

            if (mysteryColors.get(i).equals(color)){

                colorOccurrence++;
            }
        }
        return colorOccurrence;
    }
}
