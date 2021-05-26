package trial;

import java.util.Scanner;

public class Primeiro {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Write anything here");
		String nome = teclado.nextLine();
		
		for(int i =0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
		teclado.close();
		
	}
	
}
