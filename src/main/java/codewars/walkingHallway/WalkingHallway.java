package codewars.walkingHallway;

import java.util.ArrayList;

public class WalkingHallway {

    public static void main(String[] args) {
        System.out.println(contact(">---------------<--------------------------<-------->---------<------->----------<----<---->>----------<------->>>---------------<<------>"));
    }
    static int contact(String hallway) {

        ArrayList<String> subStringsHallwayArray = new ArrayList<String>();
        String tempStringHallway = hallway;
        String subString = "";
        int indexRightArrow = 0;
        int indexLeftArrow = 0;
        String arrayListString = "";

        if (!tempStringHallway.contains(">") || !tempStringHallway.contains("<")){
            return -1;

        } else {

            while (tempStringHallway.contains(">") && tempStringHallway.contains("<")) {
                // from '>' we create a substring and check for index of '<', if -1 means not found
                indexRightArrow = tempStringHallway.indexOf('>');
                indexLeftArrow = tempStringHallway.indexOf('<');
    
                if (indexRightArrow > indexLeftArrow){
                    /*if left arrow not found and subStringsHallwayArray length equals 0 
                     * means to possible match between will be found.
                    */
                    if (tempStringHallway.substring(indexRightArrow).indexOf('<') == -1 && subStringsHallwayArray.size() == 0) {
    
                        return -1;
                    }else {
    
                        tempStringHallway = tempStringHallway.substring(indexRightArrow);
                        indexRightArrow = 0;
                        indexLeftArrow = tempStringHallway.indexOf('<');
                        subString = tempStringHallway.substring(indexRightArrow,indexLeftArrow+1);
                        //subString = tempStringHallway.substring(indexRightArrow, indexLeftArrow+1);
                        subStringsHallwayArray.add(subString);
                        tempStringHallway = tempStringHallway.substring(tempStringHallway.indexOf('<')+1);
                    }
    
    
                }else {
    
                    subString = tempStringHallway.substring(indexRightArrow, indexLeftArrow+1);
                    subStringsHallwayArray.add(subString);
                    tempStringHallway = tempStringHallway.substring(indexLeftArrow+1);
    
                }
            }
            // removing extra left of right arrow to keep pattern (">-----<")
            for (int i = 0; i < subStringsHallwayArray.size(); i++) {
                if (subStringsHallwayArray.get(i) != ""){
    
                    arrayListString = (subStringsHallwayArray.get(i)).substring(subStringsHallwayArray.get(i).lastIndexOf((subStringsHallwayArray.get(i)).charAt(0)));
                    subStringsHallwayArray.remove(i);
                    subStringsHallwayArray.add(i,arrayListString);
                }else{
    
                    subStringsHallwayArray.remove(i);
                }
            }
            // hunting the shortest available path
            int shortestPath = (subStringsHallwayArray.get(0).length())-2;
            for (int i = 1; i < subStringsHallwayArray.size(); i++) {
                if ((subStringsHallwayArray.get(i).length())-2 < shortestPath){
    
                    shortestPath = (subStringsHallwayArray.get(i).length())-2;
                }
            }
            /* if number of steps if equal 0 or 1 then shortesPath will be 1 step, 
            * else number steps divided 2 (2 steps at each time) + 1
            */ 
            if (shortestPath == 0 || shortestPath == 1){
    
                shortestPath = 1;
            }else {
    
                shortestPath = (int) ((shortestPath/2)+1);
                
            }
        
            return shortestPath;
        }
        
    }


}
