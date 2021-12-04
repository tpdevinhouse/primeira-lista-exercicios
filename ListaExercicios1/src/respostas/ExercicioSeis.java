package respostas;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ExercicioSeis {

	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat(".#1");

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite sua primeira nota \n");
		double primeiraNota = entrada.nextDouble();

		System.out.println("Digite sua segunda nota \n");
		double segundaNota = entrada.nextDouble();

		System.out.println("Digite sua terceira nota \n");
		double terceiraNota = entrada.nextDouble();

		double media = (primeiraNota + segundaNota + terceiraNota) / 3;

		System.out.println("Sua média final é : " + df.format(media));
		entrada.close();

	}

}
