<!-- 
DESCRIPTION:
Task :
Given a List [] of n integers , find minimum number to be inserted in a list, so that sum of all elements of list should equal the closest prime number .

Notes
List size is at least 2 .

List's numbers will only positives (n > 0) .

Repetition of numbers in the list could occur .

The newer list's sum should equal the closest prime number .

Input >> Output Examples
1- minimumNumber ({3,1,2}) ==> return (1)
Explanation:
Since , the sum of the list's elements equal to (6) , the minimum number to be inserted to transform the sum to prime number is (1) , which will make the sum of the List equal the closest prime number (7) .


LINK: https://www.codewars.com/kata/5a946d9fba1bb5135100007c -->

Función int minimumNumber(int[] numbers):
	
	int[] sortedNumbers igual a array "numbers" ordenado de menor a mayor

	int[] subStringNumbers es igual a valor inicial (numbers.length -(sub_size-1), numbers.length + 1) de array numbers.


	long maxProduct = 1;

	Para int i igual a 0 a subStringNumbers - 1 :
		maxProduct *= subStringNumbers[i]
	Fin Para
	
	Devolver maxProduct;
	
Fin Función






