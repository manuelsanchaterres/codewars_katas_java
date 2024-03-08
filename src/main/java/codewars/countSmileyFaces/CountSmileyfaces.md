<!-- DESCRIPTION:
Given an array (arr) as an argument complete the function countSmileys that should return the total number of smiling faces.

Rules for a smiling face:

Each smiley face must contain a valid pair of eyes. Eyes can be marked as : or ;
A smiley face can have a nose but it does not have to. Valid characters for a nose are - or ~
Every smiling face must have a smiling mouth that should be marked with either ) or D
No additional characters are allowed except for those mentioned.

Valid smiley face examples: :) :D ;-D :~)
Invalid smiley faces: ;( :> :} :]

Example
countSmileys([':)', ';(', ';}', ':-D']);       // should return 2;
countSmileys([';D', ':-(', ':-)', ';~)']);     // should return 3;
countSmileys([';]', ':[', ';*', ':$', ';-D']); // should return 1;
Note
In case of an empty array return 0. You will not be tested with invalid input (input will always be an array). Order of the face (eyes, nose, mouth) elements will always be the same. -->

<!-- https://www.codewars.com/kata/583203e6eb35d7980400002a -->

Funcion countSmileys(List<String> arr)

   String validEyes = ":;"
   String validNose = "-~"
   String validMouth = ")D"
   String[] newfaceItemArray;
   int numberValidFaces = 0;
   
   medimos la longitud de arr 
   
   si longitud de arr es 0 entonces:
   		 
   	devolvemos numberValidFaces (será igual a 0)
   
   Para i desde o hasta longitud de arr - 1:
   
   		
   		 	
   		 a newfaceItemArray le asignamos el valor de hacer el split al elemento i de arr
   		 	
   		 si el array validEyes contiene el primer item de newfaceItemArray (eyes) entonces:
   		 
   		 	medimos la longitud de array newfaceItemArray
   		 	
   		 	si longitud es 2 entonces:
   		 	
   		 		el segundo item de newfaceItemArray corresponde a mouth
   		 		
   		 		si el string validMouth contiene el item 2 de newfaceItemArray entonces:
   		 		
   		 			la cara será válida e incrementaremos en 1 el contador numberValidFaces
   			
   			si longitud es 3 entonces:
   			
   				tenemos que verificar elementos 2 y 3 del array newfaceItemArray (ya que el elemento 1 ya fue validado en la primera condición)
   				
   				si array validNose contiene el elemento 2 y validMouth contiene el elemento 3 entonces:
   				
   					la cara será válida e incrementaremos en 1 el contador numberValidFaces
   					
   Fin Para
   
   Devolver núnero de caras válidas numberValidFaces
   
Fin Función
