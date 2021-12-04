package respostas;

import java.util.Scanner;

public class ExercicioQuatro {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um número decimal: ");
		double numero = entrada.nextDouble();
		
		System.out.println("O número convertido é: " + Math.round(numero));
		entrada.close();


	}

}
