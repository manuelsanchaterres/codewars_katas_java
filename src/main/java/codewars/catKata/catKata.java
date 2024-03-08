package catKata;
import java.util.ArrayList;

public class catKata {
    
    public static void main(String[] args) {
        
        // String[] yard = {"------------", "------------", "-L----------", "------------", "------------", "------------"};
        // String[] yard = {"------------", "---M--------", "------------", "------------", "-------R----", "------------"};
        String[] yard = {"-----------L", "--R---------", "------------", "------------", "------------", "--M---------"};
        // String[] yard = {"-----------L", "--R---------", "------M-----", "------------", "------------", "--M---------"};
        // String[] yard = {"------------", "------------", "------------", "------------", "------------", "------------"};
        int minDistance = 10;

        System.out.println(peacefulYard(yard, minDistance) == true ? "Cats are Safely Distanced on Yard": "Cats are NOT Safely Distanced on Yard");
        // System.out.println(peacefulYard(yard, minDistance));
    }

    public static boolean peacefulYard(String[] yard, int minDistance) {

        int numberCats = findCatsCoordinates(yard).size();
        ArrayList<Integer[]> catLocations = findCatsCoordinates(yard);
        boolean safelyDistanced = false;
        
        switch (numberCats) {
            case 0,1:
                safelyDistanced = true;
            break;
            case 2:

                if (calculateDistance(catLocations.get(0), catLocations.get(1)) >= minDistance){
                    safelyDistanced = true;
                } else {

                    safelyDistanced = false;
                }
            break;            
            case 3:

                if ((calculateDistance(catLocations.get(0), catLocations.get(1)) >= minDistance) 
                && (calculateDistance(catLocations.get(0), catLocations.get(2)) >= minDistance)
                && (calculateDistance(catLocations.get(1), catLocations.get(2)) >= minDistance)
                ){
                    safelyDistanced = true;
                } else {

                    safelyDistanced = false;
                }

            break;                  
            default:

                safelyDistanced = false;

            break;
        }
        return safelyDistanced;
    }

    public static ArrayList<Integer[]> findCatsCoordinates(String[] yard) {
        
        ArrayList<Integer[]> catsLocation = new ArrayList<>();

        for (int i = 0; i < yard.length; i++) {

            String[] newCharArray = yard[i].split("");

            for (int j = 0; j < newCharArray.length; j++) {
                
                if (newCharArray[j].matches(".*[LMR].*")){

                    Integer[] location = {i,j};
                    catsLocation.add(location);
                }
            }

        }

        return catsLocation;
    }

    public static int calculateDistance(Integer[] locationCat1, Integer[] locationCat2) {
        
        // distance formula  d=√((x2 – x1)² + (y2 – y1)²)

        int x1 = locationCat1[0];
        int x2 = locationCat2[0];
        int y1 = locationCat1[1];
        int y2 = locationCat2[1];
        int distanceLocations;

        distanceLocations = (int) (Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2)));
        return distanceLocations;
    }
}
