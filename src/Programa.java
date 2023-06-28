import java.util.Random;
import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		int num;
		int numAleatorio = new Random().nextInt(100);
		int tentativas = 0;

//		System.out.println("Digite um numero e tente a sorte: ");
//		num = new Scanner(System.in).nextInt();

		do {
			System.out.println("Digite um numero entre 1 e 100 para tentar a sorte: ");
			num = new Scanner(System.in).nextInt();
			if (num < numAleatorio) {
				System.out.println("O número digitado é menor que o numero sorteado");
			} else if (num > numAleatorio) {
				System.out.println("O número digitado é maior que o numero sorteado");
			}
			tentativas++;
		} while (num != numAleatorio);
		System.out.println("Acertou! O número sorteado é: " + numAleatorio + ". Tentativas: " + tentativas);
	}
}