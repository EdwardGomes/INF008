package questao9;

/* 9. Faça um Programa que leia três números e mostre-os em ordem 
decrescente. */

import java.util.Scanner;

public class Questao9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite três números: ");
		Numeros n1 = new Numeros(scan.nextInt());
		Numeros n2 = new Numeros(scan.nextInt());
		Numeros n3 = new Numeros(scan.nextInt());

		System.out.println("O maior número é: " + Numeros.maior(n1, n2, n3));
		System.out.println("O número do meio é: " + Numeros.meio(n1, n2, n3));
		System.out.println("O menor número é: " + Numeros.menor(n1, n2, n3));

		scan.close();
	}

}
