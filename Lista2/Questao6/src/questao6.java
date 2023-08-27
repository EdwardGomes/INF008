/* 6. Faça um Programa que leia três números e mostre o maior deles. */

import java.util.Scanner;

public class questao6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite três números: ");
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();

        if (n1 > n2 && n1 > n3) {
            System.out.println("O maior número é: " + n1);
        } else if (n2 > n1 && n2 > n3) {
            System.out.println("O maior número é: " + n2);
        } else if (n3 > n1 && n3 > n2) {
            System.out.println("O maior número é: " + n3);
        } else {
            System.out.println("Os números são iguais.");
        }

        scan.close();
    }
}
