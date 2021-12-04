package respostas;

import java.util.Scanner;

public class ExercicioSete {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int numero;

		System.out.println("Digite um número entre 0 a 10 para calcular o fatorial ");
		numero = entrada.nextInt();
		long fatorial = 1;
		int i = 1;

		if (numero >= 0 && numero <= 10) {

			while (i <= numero) {
				fatorial = fatorial * i;
				i++;
			}

			System.out.println("O fatorial de " + numero + " é " + fatorial);
			entrada.close();

		} else {
			System.out.println("Por favor, digite um número entre 0 e 10 para executar este programa!");
		}

	}

}
