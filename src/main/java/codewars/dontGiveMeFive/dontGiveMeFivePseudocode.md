<!-- In this kata you get the start number and the end number of a region and should return the count of all numbers except numbers with a 5 in it. The start and the end number are both inclusive!-->

<!-- https://www.codewars.com/kata/5813d19765d81c592200001a/java -->

Función dontGiveMeFive(start, end):

    tempArray = []
    distanciaNumeros = end - start
    Para i desde 0 hasta distanciNumeros:

        si start % 5 es diferente de 5 entonces

            tempArray[i] = start
        
        start++  

    Devolver longitud tempArray;

Fin Función

