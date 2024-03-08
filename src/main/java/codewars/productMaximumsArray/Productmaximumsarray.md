<!-- 
Given an array/list [] of integers , Find the product of the k maximal numbers.
Notes
Array/list size is at least 3 .

Array/list's numbers Will be mixture of positives , negatives and zeros

Repetition of numbers in the array/list could occur.

Input >> Output Examples
maxProduct ({4, 3, 5}, 2) ==>  return (20)
Explanation:


LINK: https://www.codewars.com/kata/5a63948acadebff56f000018 -->

Función maxProduct(int[] numbers, int sub_size):
	
	int[] sortedNumbers igual a array "numbers" ordenado de menor a mayor

	int[] subStringNumbers es igual a valor inicial (numbers.length -(sub_size-1), numbers.length + 1) de array numbers.


	long maxProduct = 1;

	Para int i igual a 0 a subStringNumbers - 1 :
		maxProduct *= subStringNumbers[i]
	Fin Para
	
	Devolver maxProduct;
	
Fin Función






