import java.util.Scanner;

public class CalculoNumeros {
	public static void main(String[] args) {
		int soma = 0, numero;
		int cont;
		float media;
		Scanner NumScanner = new Scanner(System.in);
		Scanner charScanner = new Scanner(System.in);

		System.out.println("\nInsira a quantidade de numeros que deseja calcular: ");

		cont = NumScanner.nextInt();

		System.out.println("\nDigite os " + cont + " número(s): (Numeros separados por espaços)");

		for(int x=1; x<=cont; x++){
			numero = NumScanner.nextInt();
			soma = soma + numero;
		}

		media = soma / cont;
		System.out.println("A média dos " + cont + " número(s) que você inseriu é: " + media);
	}
}