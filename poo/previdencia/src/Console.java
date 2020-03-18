import java.util.Scanner;

public class Console {

	public static void main(final String[] args) {

        final Scanner teclado = new Scanner(System.in);
        RegraINSS regra = new RegraINSS();

        int idade, sexo;

		System.out.print("Sua idade: ");
		idade = teclado.nextInt();

		System.out.print("Seu sexo (0 ou 1): ");
		sexo = teclado.nextInt();


		System.out.println("\nRelatório Análise ******");

		if (regra.aposentado(idade, sexo)) {
			System.out.println("LIBERADO!");
		} else {
			System.out.println("PENDENTE!");
			System.out.println("Falta(m) " + regra.pendencia(idade, sexo) + " anos.");
		}

	}

}