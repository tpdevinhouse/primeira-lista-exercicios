package respostas;

import java.util.Scanner;

public class ExercicioDez {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		int contador = 0;

		System.out.println("Digite um valor númerico inteiro: ");
		numero = entrada.nextInt();

		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				contador++;
			}
		}

		if (contador == 2) {
			System.out.println("O número digitado " + numero + " é um número primo!");
		} else {
			System.out.println("O número digitado " + numero + " não é um número primo!");
		}
		entrada.close();

	}

}
