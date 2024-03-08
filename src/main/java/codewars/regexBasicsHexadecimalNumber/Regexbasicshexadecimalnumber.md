<!-- Implement String#hex_number? (in Java StringUtils.isHexNumber(String)), which should return true if given object is a hexadecimal number, false otherwise.

Hexadecimal numbers consist of one or more digits from range 0-9 A-F (in any case), optionally prefixed by 0x.-->

<!-- https://www.codewars.com/kata/567c9f56d83baeed8300000f -->

Función boolean isHexNumber(String s):

    int numeroGatos = longitud de Función buscarPosicionGatos(yard)
    boolean distanciadosConSeguridad = false

    BÚSQUEDA NÚMERO DE GATOS EN EL JARDÍN

    Si numeroGatos es igual a 1 o 0:
        devolver true
    si numeroGatos es igual a 2:

        si calcularDistancia (int[] buscarPosicionGatos(yard)[0], int[] buscarPosicionGatos(yard)[1]) es mayor o igual a minDistance:

            distanciadosConSeguridad = true
    si numeroGatos es igual a 3:

        si calcularDistancia (int[] buscarPosicionGatos(yard)[0], int[] buscarPosicionGatos(yard)[1]) && calcularDistancia (int[] buscarPosicionGatos(yard)[0], int[] buscarPosicionGatos(yard)[2]) && calcularDistancia (int[] buscarPosicionGatos(yard)[1], int[] buscarPosicionGatos(yard)[2])  sean mayores o igual a minDistance:

            distanciadosConSeguridad = true;
    Fin si

    devolver distanciadosConSeguridad

Fin Función
