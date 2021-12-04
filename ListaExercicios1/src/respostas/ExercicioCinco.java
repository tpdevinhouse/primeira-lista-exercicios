package respostas;

import java.util.Scanner;

public class ExercicioCinco {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite uma palavra :");
		String palavra = entrada.nextLine();
		
		System.out.println("A palavra que você escreveu tem " + palavra.length() + " caracteres");
		entrada.close();

	}

}
