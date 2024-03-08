package binarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        
        int[] array = new int[]{1, 2, 3, 4, 5};
        int elemento = 2;
        int result = binarySearch(array,elemento);

        if (result == -1){

            System.out.println("Elemento no encontrado");
        } else{

            System.out.println("Elemento "+ elemento + " encontrado en índice " + result +".");
        }
    }

    static int binarySearch(int[] array, int elemento){

        int inf = 0;
        int sup = array.length - 1;
        int mid;
        while (inf <= sup) {
            mid = (sup+inf)/2;
            if (array[mid] == elemento){
                return mid;
            }else if (elemento > array[mid]){

                inf = mid + 1;
            }else{

                sup = mid - 1;
            }

        }

        
        return -1;
    }
}
