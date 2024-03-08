<!-- 
Task
You are a magician. You're going to perform a trick.

You have b black marbles and w white marbles in your magic hat, and an infinite supply of black and white marbles that you can pull out of nowhere.

You ask your audience to repeatedly remove a pair of marbles from your hat and, for each pair removed, you add one marble to the hat according to the following rule, until there is only 1 marble left.

If the marbles of the pair that is removed are of the same color, you add a white marble to the hat. Otherwise, if one is black and one is white, you add a black marble.

Given the initial number of black and white marbles in your hat, your trick is to predict the color of the last marble.

Note: A magician may confuse your eyes, but not your mind ;-)

Input/Output
[input] integer b
Initial number of black marbles in the hat.

1 <= b <= 10^9

[input] integer w
Initial number of white marbles in the hat.

1 <= w <= 10^9

[output] a string
"Black" or "White" if you can safely predict the color of the last marble. If not, return "Unsure".


LINK: https://www.codewars.com/kata/58ad2e9c0e3c08126000003f/ -->

Función String notSoRandom(int b, int w):
	
	HashMap<String,int> magicHat es igual cada entry ({key:"Black",value:b}) y {key:"White",value:w}

    String marble1, marble2;
    mientras el numero de marbles White y Black es mayor a 0:

        marble1 = pickedMurbleFromMagicHat(magicHat)
        magicHat = removeMurbleFromMagicHat(magicHat, marble1)
        marble2 = pickedMurbleFromMagicHat(magicHat)
        magicHat = removeMurbleFromMagicHat(magicHat, marble2)

        si String marble1 es igual a String marble2 entonces:

            añadir 1 bola White a la entrada de hashmap con key "White";
            magicHat será igual a funcion addMurbleToMagicHat(magicHat, "White")

        sino :
            añadir 1 bola Black a la entrada de hashmap con key "Black";
            magicHat será igual a funcion addMurbleToMagicHat(magicHat, "Black")

    Devolver key de la entrada donde su valor es mayor a 0
	
Fin Función


Función String pickedMurbleFromMagicHat(magicHat):

    int randomMurbleIndex es igual a indice aleatorio de longitud hashmap magicHat
    String removedMurble es igual a la clave de la entrada cuyo índice es randomMurbleIndex

    Devolver removedMurble
Fin Función

Funcion HashMap<String,int> removeMurbleFromMagicHat(magicHat, removedMurble):

    HashMap<String,int> nuevoMagicHat es igual a restar 1 al valor de la entrada  con clave removedMurble

    Devolver nuevoMagicHat

Fin Función

Funcion HashMap<String,int> addMurbleToMagicHat(magicHat, addedMurble):

    HashMap<String,Integer> nuevoMagicHat es igual a sumar 1 al valor de la entrada  con clave addedMurble

    Devolver nuevoMagicHat

Fin Función