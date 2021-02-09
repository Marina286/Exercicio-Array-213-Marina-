package exercicio.array;
import java.util.Scanner;

public class ExercicioArray2 {

	public static void main(String[] main) {
		Scanner sc = new Scanner(System.in);
		int array[] = new int[10];
		int r;
		
		for(r = 16; r >= 0; --r) {
			System.out.println("Digite um número na " + (r + 1) + "º posição.");}
			array[r] = sc.nextInt();
	
		for(r = 0; r < array.length; r++) {
			System.out.println(array[r]);}
} }
