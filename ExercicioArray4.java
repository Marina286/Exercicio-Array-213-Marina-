package exercicio.array;

public class ExercicioArray4 {

	public static void main(String[] args) {
		int array[][] = new int [50][100];
		int l;
		int v;
		
	for(l = 49; l >= 0; --l) {
		for(v = 99; v >= 0; --v) {
			array[l][v] = l + v;}}
	
	for(l = 0; l < array.length; ++l) {
		for(v = 0; v < array.length; ++v) {
			System.out.println("Os elementos do array bidimensional são: " + array[l][v]);}}
}}
