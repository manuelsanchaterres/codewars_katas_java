<!-- In this Kata, you will be given an array of numbers in which two numbers occur once and the rest occur only twice. Your task will be to return the sum of the numbers that occur only once.

For example, repeats([4,5,7,5,4,8]) = 15 because only the numbers 7 and 8 occur once, and their sum is 15. Every other number occurs twice.

More examples in the test cases.

Good luck!

If you like this Kata, please try: -->

Función repeats(int[] array):
	
	ArrayList<Integer[]> arrayNumerosUnicos = new ArrayList<>();
	boolean esUnico = true;
	int sumaNumerosUnicos = 0;
    Para i desde 0 hasta longitud array - 1:
		
		Para j desde 0 hasta longitud array - 1:
	 
	        si i es diferente de j entonces
	
	            si array[i] es igual a array[j] entonces
	            	
	            	esUnico es igual a falso
	            	
	            	devolver esUnico
	            	
    	si esUnico  es igual a true entonces:
    
    		A arrayNumerosUnicos añadimos array[i]
    
     Para i desde 0 hasta longitud arrayNumerosUnicos - 1:
     
     	sumaNumerosUnicos += arrayNumerosUnicos[i];

    Devolver sumaNumerosUnicos;

Fin Función

