<!-- 
1. There are always exactly three reels

2. Each reel has 10 different items.

3. The three reel inputs may be different.

4. The spin array represents the index of where the reels finish.

5. The three spin inputs may be different

6. Three of the same is worth more than two of the same

7. Two of the same plus one "Wild" is double the score.

8. No matching items returns 0. 

LINK: https://www.codewars.com/kata/590adadea658017d90000039/train/java -->

Función fruit(final String[][] reels, final int[] spins):
	
	ArrayList<String> itemsReelCapturados = capturarItemsReel(reels, spins)
	int totalPuntos = 0;
	int indiceTabla = -1;
	int totalCoincidencias = compararItems(itemsReelCapturados);
	String reelItemRepetido = encontrarReelItemRepetido(itemsReelCapturados)
	si totalCoincidencias es igual a 2 entonces:
		filtrar array itemsReelCapturados para obtener el elemento String no repetido
		
		asignar elemento no repetido a variable string
		
		asignar valor de Funcion calcularTotalPuntos(reelItemRepetido, reelItemNoRepetido) a totalPuntos
		
		
	sino si totalCoincidencias es igual a 3 entonces:
		
		asignar valor de Funcion calcularTotalPuntos(reelItemRepetido) a totalPuntos
	Devolver totalPuntos;
	
Fin Función

Función capturarItemsReel(final String[][] reels, final int[] spins):
	
	ArrayList <String> itemsReelCapturados;
	String reelItemCapturado;
	Para i desde 0 a longitud de reels menos 1:
		
		ACCEDEMOS A CADA String ARRAY DE REELS Y DESPUÉS CAPTURAMOS EL VALOR DE LA POSICIÓN I DE SPINS, QUE SERÁ EL INDICE DEL STRING A CAPTURAR EN REELS Y LO ASIGNAMOS A VARIABLE STRING reelItemCapturado
		AÑADIMOS ITEM CAPTURADO A ARRAYLIST itemsReelCapturados
		
	Devolver itemsReelCapturados
	
Fin Función

Función compararItems(ArrayList <String> itemsReelCapturados):
	
	int[] numeroCoincidencias = 1;
	
	Para i desde 1 hasta longitud itemsReelCapturados - 1:
	
		si itemsReelCapturados[i] es igual a itemsReelCapturados[0] entonces:
		
			incrementamos numeroCoincidencias en 1 unidad
			
	Devolver numeroCoincidencias
			
Fin Función

Función encontrarReelItemRepetido(ArrayList <String> itemsReelCapturados):
	
	String reelItemRepetido = "";
	
	Para i desde 1 hasta longitud itemsReelCapturados - 1:
	
		
			si itemsReelCapturados[i] es igual a itemsReelCapturados[0] entonces:
			
				asignar reelItemRepetido a itemsReelCapturados[i]
				
				Devolver itemsReelCapturados[i]
				
				
	Devolver reelItemRepetido
			
Fin Función

Función calcularPuntuacionTotal(String reelItemRepetido, String reelItemNoRepetido):
	
	String[] Reels = {"Wild","Star","Bell","Shell","Seven","Cherry","Bar","King","Queen","Jack"}
	int[][] scores = {
	{100,10,0},
	{90,9,18},
	{80,8,16},
	{70,7,14},
	{60,6,12},
	{50,5,10},
	{40,4,8},
	{30,3,6},
	{20,2,4},
	{10,1,2},
	}
	int indiceDeItemRepetido se asigna el valor de indice de variable String reelItemRepetido dentro de array Reels
	int indiceDeStringArrayScores = 1;
	int totalScore = 0;
	
	// SI EL ITEM NO REPETIDO ES "Wild", LA PUNTUACION CORRESPONDE AL TERCER ELEMENTO DE CADA ARRAY DE SCORES
	si reelItemNoRepetido es igual a "Wild" entonces:
	
		indiceDeStringArrayScores = 2;
		
		totalScore = VALOR INDICE 2 EN FUNCIÓN AL INDICE OBTENIDO SEGÚN EL ITEM STRING DE ARRAY STRING Reels
	
	
	totalScore = VALOR INDICE 1 EN FUNCIÓN AL INDICE OBTENIDO SEGÚN EL ITEM STRING DE ARRAY STRING Reels
	
	
	Devolver totalScore
	
			
Fin Función




