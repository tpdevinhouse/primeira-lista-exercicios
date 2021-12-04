package respostas;

import java.util.Scanner;

public class ExercicioNove {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int tipoPizza;
		int contCalabresa = 0;
		int contMussarela = 0;
		int contPortuguesa = 0;
		boolean prosseguir = true;

		while (prosseguir) {
			System.out.println(
					"Você deseja uma pizza? \n Envie \"1\" para calabresa, \"2\" para mussarela, \"3\" para portuguesa ou \"0\" caso esteja satisfeito");
			tipoPizza = entrada.nextInt();

			if (tipoPizza == 1) {
				contCalabresa++;
			}else if (tipoPizza == 2) {
				contMussarela++;
			}else if (tipoPizza == 3) {
				contPortuguesa++;
			}else {
				break;
			}
		}
		
		System.out.println("\nNossa piazzaria agradece por sua presença, segue abaixo a quantidade de pizza consumida: \n");
		System.out.println("Pizza de Calabresa: " + contCalabresa);
		System.out.println("Pizza de Mussarela: " + contMussarela);
		System.out.println("Pizza Portuguesa: " + contPortuguesa);
		entrada.close();

	}

}
