/* 11.Faça um Programa que peça 2 números inteiros e um número real.
Calcule e mostre:
a. o produto do dobro do primeiro com metade do segundo .
b. a soma do triplo do primeiro com o terceiro.
c. o terceiro elevado ao cubo. */

import java.util.Scanner;

public class questao11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro número inteiro: ");
        int num1 = scan.nextInt();

        System.out.println("Digite o segundo número inteiro: ");
        int num2 = scan.nextInt();

        System.out.println("Digite o número real: ");
        double num3 = scan.nextDouble();

        System.out.println("O produto do dobro do primeiro com metade do segundo é: " + ((num1 * 2) * (num2 / 2)));

        System.out.println("A soma do triplo do primeiro com o terceiro é: " + ((num1 * 3) + num3));

        System.out.println("O terceiro elevado ao cubo é: " + Math.pow(num3, 3));

        scan.close();
    }
}
