package exercicio.array;

public class ExercicioArray3 {

	public static void main(String[] main) {
		int array[][] = new int[100][100];
		int m;
		int a;
		
		for(m = 0; m < array.length; ++m) {
			for(a = 0; a < array.length; ++a) {
			array[m][a] = m - a; }}
		
		for(m = 0; m < array.length; ++m) {
			for(a = 0; a < array[m].length; ++a) {
			System.out.println("Os elementos do array bidimensional são: " + array[m][a]);}}
		
		for(m = 0; m < array.length; ++m) {
			for(a = 0; a < array.length; ++a) {
			array[m][a] = array[m][a] * 7; }}
		
		for(m = 0; m < array.length; ++m) {
			for(a = 0; a < array[m].length; ++a) {
			System.out.println("Os índices de cada elemento multiplicados por 7 são: " + array[m][a]);}}
}}
