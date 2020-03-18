import java.util.Scanner;

public class Console {

	public static void main(final String[] args) {

        final Scanner teclado = new Scanner(System.in);

        int idade, sexo;

		System.out.print("Sua idade: ");
		idade = teclado.nextInt();

		System.out.print("Seu sexo (0 ou 1): ");
		sexo = teclado.nextInt();


        int calculo; 

        if (sexo == 1) { 
            calculo = 65 - idade; //masculino
        } else {
            calculo = 60 - idade; //feminino
        }


		System.out.println("\nRelatório Análise ******");

		if (calculo <= 0) {
			System.out.println("LIBERADO!");
		} else {
			System.out.println("PENDENTE!");
			System.out.println("Falta(m) " + calculo + " anos.");
		}

	}

}
