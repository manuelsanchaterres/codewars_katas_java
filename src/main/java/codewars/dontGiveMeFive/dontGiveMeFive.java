package dontGiveMeFive;
import java.util.ArrayList;
import java.util.Scanner;
public class dontGiveMeFive {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Introduzca Número Inicial: ");
        int startNumber = input.nextInt();
        System.out.print("Introduzca Número Final: ");
        int endNumber = input.nextInt();

       System.out.println(dontGiveMeFive(startNumber, endNumber));

    }

    public static int dontGiveMeFive(int start, int end){

        int distanciaNumeros = (end -start)+ 1;
        ArrayList<Integer> numbersArray = new ArrayList<Integer>();
        int tempValue;
        for (int index = 0; index < distanciaNumeros; index++) {
            
            /* guardamos start en tempvalue para poder guardar el valor original de start
             * y añadirlo a array numbersArray sino contiene ningún 5.
             */
            tempValue = start;
            while (start % 10 != 5 && start % 10 != -5 && (float) start / 5 != -1 && (float) start / 5 != 1) {
                
                start /=10;
                if (start == 0){
                    numbersArray.add(tempValue);
                    break;
                }
            }
            /*asignamos a start su valor antes de ser modificado dentro del while y sumamos 1 */
            start = tempValue + 1;
        }
        System.out.println(numbersArray);
        System.out.println(numbersArray.size());
        return numbersArray.size();
    };
}
