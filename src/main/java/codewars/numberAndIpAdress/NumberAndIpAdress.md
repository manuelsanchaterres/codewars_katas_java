<!-- 
Task
An IP address contains four numbers(0-255) and separated by dots. It can be converted to a number by this way:

Given a string s represents a number or an IP address. Your task is to convert it to another representation(number to IP address or IP address to number).

You can assume that all inputs are valid.

Example
Example IP address: 10.0.3.193

Convert each number to a 8-bit binary string (may needs to pad leading zeros to the left side):

10  --*  00001010
0   --*  00000000
3   --*  00000011
193 --*  11000001
Combine these four strings: 00001010 00000000 00000011 11000001 and then convert them to a decimal number: 167773121

Input/Output
[input] string s

A number or IP address in string format.

[output] a string

A converted number or IP address in string format.

Example
For s = "10.0.3.193", the output should be "167773121".

For s = "167969729", the output should be "10.3.3.193".


LINK: https://www.codewars.com/kata/5936371109ca68fe6900000c -->

Función String numberAndIPaddress(String s):
	
    // comprobar si el formato de string "s" es decimal o ip (regex IP) ("^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$")
	boolean isIp = comprobarSiIp(s)
    String output = "";

    si isIp es "true" entonces:
        output = convertirADecimal(s)
    sino:
        output = convertirAIp(s)
    
    Devolver output

Fin Función


Función boolean comprobarSiIp(String input):

    boolean isIp es igual a metodo match de string

    Devolver isIp
Fin Función

Funcion String convertirADecimal(String input):

   creamos array tipo String a partir del separador "." del string ip
   creamos String valorString para concatenar y formar el valor String final
   creamos tipo long para almacenar el resultado de convertir el valor binario a decimal
   creamos int contador para modificar el valor del exponente 2^indice * digito binario

   Para cada elemento de array String:

    convertimos el string en integer y aplicamos el método toBinaryString()

    si longitud de elemento resultante es menor a 8 entonces:
        añadimos a la izquierda tantos 0's como valores restantes hasta 8
    concatenamos

    concatenamos el elemento resultante con "valorString"

    Para cada digito binario:

        multiplicamos digito * (2^(indice de cada dígito))
        suma resultado a variable  long "resultado"


    Devolver resultado
Fin Función

Funcion String convertirAIp(String input):

    creamos variable long igual a convertir string "input" a long
    convertimos variable long a binaryString "variableBinaria"
    creamos String "StringFinal " para completar string hasta 32 digitos
    creamos String "ipFinal" para guardar el valor final de la ip
    si longitud de variableBinaria es menor 32 (numero bits que componen ipv4) entonces:

        concatenamos StringFinal más tantos 0's a la izquierda como número restante hasta 32

    Para indice desde 1 hasta indice igual a 4 :

        obtener substring sobre "StringFinal" en función el índice de cada iteración de "indice"
        si indice es menor a 4 entonces:
            contatenar con un punto "."
        
        concatenar substring a variable String ipFinal

    Devolver ipFinal

Fin Función