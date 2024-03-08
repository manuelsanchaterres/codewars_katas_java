package sortOdd;

import java.util.ArrayList;

class SortOdd {
    public static void main(String[] args) {
        sortArray(new int[]{ 5, 3, 1, 8, 0 });
    }

    static int[] sortArray(int[] array) {
        
        if (array.length == 0){
            return array;
        } else {

            ArrayList<OddNumberInfo> oddNumbersIndexes = new ArrayList<OddNumberInfo>();

            for (int i = 0; i < array.length; i++) {
                
                if (array[i] % 2 != 0){

                    oddNumbersIndexes.add(new OddNumberInfo(i, array[i]));
                }
            }
            int temp = 0;
            for (int j = 0; j < oddNumbersIndexes.size(); j++) {
                
                for (int k = j+1; k < oddNumbersIndexes.size(); k++) {
                    if (oddNumbersIndexes.get(k).getArrayItemValue() < oddNumbersIndexes.get(j).getArrayItemValue()){
                        temp = oddNumbersIndexes.get(k).getArrayItemValue();
                        oddNumbersIndexes.get(k).setArrayItemValue(oddNumbersIndexes.get(j).getArrayItemValue());
                        oddNumbersIndexes.get(j).setArrayItemValue(temp);
                    }
                }
            }

            for (int l = 0; l < oddNumbersIndexes.size(); l++) {
                
                array[oddNumbersIndexes.get(l).getArrayIndex()] = oddNumbersIndexes.get(l).getArrayItemValue();
            }
            
            return array;
        }   

    }
}
