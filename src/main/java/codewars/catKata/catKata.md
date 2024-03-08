<!-- In this, the first and simplest of a planned trilogy of cat katas :-), all you have to do is determine whether the distances between any visiting cats are large enough to make for a peaceful afternoon, or whether there is about to be an altercation someone will need to deal with by carrying one of them into the house or squirting them with water or what have you.

As input your function will receive a list of strings representing the yard as a grid, and an integer representing the minimum distance needed to prevent problems (considering the cats' current states of sleepiness). A point with no cat in it will be represented by a "-" dash. Lou, Mustache Cat, and Raoul will be represented by an upper case L, M, and R respectively. At any particular time all three cats may be in the yard, or maybe two, one, or even none.

If the number of cats in the yard is one or none, or if the distances between all cats are at least the minimum distance, your function should return True/true/TRUE (depending on what language you're using), but if there are two or three cats, and the distance between at least two of them is smaller than the minimum distance, your function should return False/false/FALSE.-->

<!-- https://www.codewars.com/kata/5869848f2d52095be20001d1/train/java -->

Funcion main () {

    String[] yard = {"------------", "------------", "-L----------", "------------", "------------", "------------"};
    int minDistance = 10

    imprimir en pantalla peacefulYard(yard, minDistance)
}

Función peacefulYard(String[] yard, int minDistance):

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


Funcion buscarPosicionGatos(String[] yard) HECHO

    ArrayList<int[]> posicionGatos

    Para i desde 0 hasta longitud de yard - 1:

        Para j desde 0 hasta longitud de yard[i] - 1:
            
            String[] nuevoArray = yard[i].split("")

            Si nuevoArray contiene a "L","M","R":
                Integer[] ubicacion = {i,j}
                posicionGatos.add(ubicacion)

            Fin si

        Fin si

    Fin Para

    devolver posicionGatos

Fin Función

Funcion calcularDistancia(Integer[] locationCat1, Integer[] locationCat2)

    // distancia formula  d=√((x2 – x1)² + (y2 – y1)²)

    int x1 = locationCat1[0];
    int x2 = locationCat2[0];
    int y1 = locationCat1[1];
    int y2 = locationCat2[1];
    int distanceLocations;

    distanciaGatos = √((x2 – x1)² + (y2 – y1)²)
    devolver distanciaGatos

Fin Función