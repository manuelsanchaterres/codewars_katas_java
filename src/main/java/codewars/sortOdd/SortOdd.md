<!-- DESCRIPTION:
Task
You will be given an array of numbers. You have to sort the odd numbers in ascending order while leaving the even numbers at their original positions.

Examples
[7, 1]  =>  [1, 7]
[5, 8, 6, 3, 4]  =>  [3, 8, 6, 5, 4]
[9, 8, 7, 6, 5, 4, 3, 2, 1, 0]  =>  [1, 8, 3, 6, 5, 4, 7, 2, 9, 0]

<!--https://www.codewars.com/kata/578aa45ee9fd15ff4600090d/java -->

Función int[] sortArray(int[] array):

    Hashmap<int,int> oddNumbersIndexes
    Para i desde 0 hasta longitud array:

        si array[i] es impar entonces:

            guardamos el indice del numero impar en oddNumbersIndexes
    
    Fin Para

    Para todo item en oddNumbersIndexes:

        si el el valor de item es mayor a item - 1 entonces:

            se intercambian 
    Fin Para
    
    devolver distanciadosConSeguridad

Fin Función
