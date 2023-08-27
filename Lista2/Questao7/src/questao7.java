/* 7. Faça um Programa que leia três números e mostre o maior e o menor
deles. */

import java.util.Scanner;

public class questao7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int maior, menor;
        System.out.println("Digite três números: ");
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();

        maior = maior(n1, n2, n3);
        menor = menor(n1, n2, n3);

        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
    }

    public static int maior(int n1, int n2, int n3) {
        int maior = n1;
        if (n2 > maior) {
            maior = n2;
        }
        if (n3 > maior) {
            maior = n3;
        }
        return maior;
    }

    public static int menor(int n1, int n2, int n3) {
        int menor = n1;
        if (n2 < menor) {
            menor = n2;
        }
        if (n3 < menor) {
            menor = n3;
        }
        return menor;
    }

}
