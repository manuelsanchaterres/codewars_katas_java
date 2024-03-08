<!-- Your goal in this kata is to implement a difference function, which subtracts one list from another and returns the result.

It should remove all values from list a, which are present in list b keeping their order.

Kata.arrayDiff(new int[] {1, 2}, new int[] {1}) => new int[] {2}
If a value is present in b, all of its occurrences must be removed from the other:

Kata.arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2}) => new int[] {1, 3} 

LINK: https://www.codewars.com/kata/523f5d21c841566fde000009/java -->

Función arrayDiff(int[] a, int[] b):
	
	// INICIALIZAMOS DOS ARRAY PARA GUARDAR LAS MODIFICACIONES DE ARRAYS INT[] A E INT[] B
	
	int[] newArrayA;
	
	Para i desde 0 hasta longitud array a - 1:
		
		Para j desde 0 hasta longitud array b - 1:
		
			si array a [i] es igual a array b[j] entonces:
			
				newArrayA es igual a filtrar array a para array a item diferente a arraya [i]
				
				
	Devolver newArrayA
	
	
Fin Función

