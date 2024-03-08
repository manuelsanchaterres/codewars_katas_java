<!-- Emotional Sort ( ︶︿︶)
You'll have a function called "sortEmotions" that will return an array of emotions sorted. It has two parameters, the first parameter called "arr" will expect an array of emotions where an emotion will be one of the following:

:D -> Super Happy
:) -> Happy
:| -> Normal
:( -> Sad
T_T -> Super Sad
Example of the array:[ 'T_T', ':D', ':|', ':)', ':(' ]

And the second parameter is called "order", if this parameter is true then the order of the emotions will be descending (from Super Happy to Super Sad) if it's false then it will be ascending (from Super Sad to Super Happy)

Example if order is true with the above array: [ ':D', ':)', ':|', ':(', 'T_T' ]

Super Happy -> Happy -> Normal -> Sad -> Super Sad
If order is false: [ 'T_T', ':(', ':|', ':)', ':D' ]

Super Sad -> Sad -> Normal -> Happy -> Super Happy
Example:

arr = [':D', ':|', ':)', ':(', ':D']
sortEmotions(arr, true) // [ ':D', ':D', ':)', ':|', ':(' ]
sortEmotions(arr, false) // [ ':(', ':|', ':)', ':D', ':D' ]
More in test cases!-->

<!-- https://www.codewars.com/kata/5a86073fb17101e453000258 -->

Función String[] sortEmotions(boolean order,String[] emotions):

    arrayOrdenado: String[] = {}
    arrayOrdenDescente = [ ':D', ':)', ':|', ':(', 'T_T' ]
    arrayOrdenAscendente = [ 'T_T', ':(', ':|', ':)', ':D' ]
    si el orden es true entonces:
       arrayOrdenado= ordenarArray(emotions,arrayOrdenDescente)
    sino:
        arrayOrdenado= ordenarArray(emotions,arrayOrdenAscendente)
    
Devolver arrayOrdenado;

Fin Función

Funcion ordenarArray: String[](String[] emotions,arrayReferencia){
    temp: String -> almacenar valor temporal de array emotions en bucle
    Para todo item de arrayReferencia:

        para todo item de emotions:

            si item de arrayReferencia = item de emotions entonces:

                extraer indice de item arrayReferencia para capturar el item del mismo indice de emotions y guardarlo en variable temporal "temp"

                asignar el item de emotions coincidente en indice de arrayReferencia correspondiente

                asignar valor de temp a al item de emotions cuyo indice coincide con item de arrayReferencia
            Fin si
        Fin Para
    Fin Para

    Devolver emotions;
}




