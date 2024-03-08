<!-- Convert number to reversed array of digits
Given a random non-negative number, you have to return the digits of this number within an array in reverse order.

Example(Input => Output):
35231 => [1,3,2,5,3]
0 => [0] -->

Función digitize(número):
    Si número es igual a 0:
        Devolver [0]

    temp = número
    longitud = 0

    Mientras temp sea mayor que 0:
        Incrementar longitud en 1
        temp = temp dividido por 10

    Crear una tabla resultado con tamaño igual a longitud

    Para i desde 0 hasta longitud - 1:
        resultado[i] = número módulo 10
        número = número dividido por 10

    Devolver resultado
Fin Función

