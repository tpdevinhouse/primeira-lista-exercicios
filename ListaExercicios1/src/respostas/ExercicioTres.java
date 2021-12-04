package respostas;

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.println("Digite seu nome:");
		String nome = entrada.next();
		
		System.out.println("Seu nome é " + nome + " " + sobrenome);
		entrada.close();

	}

}
