package exercicio.array;

public class ExercicioArray1 {

	public static void main(String[] args) {
		int array[] = new int[9];
		int v;
		
		for(v = 0; v < array.length; v++) {
			array[v] = v;}
		
		for(v = 0; v < array.length; v++) {
			System.out.println("S�o os elementos do array com valor do �ndice: " + array[v]);}
		
		for(v = 0; v < array.length; v++) {
			array[v] = v*3;}
		
		for(v = 0; v < array.length; v++) {
			System.out.println("S�o os elementos do array com a multiplica��o por 3:" + array[v]);}	
}}
