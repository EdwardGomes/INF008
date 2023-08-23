/*3. Faça um Programa que peça dois números e imprima a soma.*/

import java.util.Scanner;

public class questao3 {

    public static void main(String[] args) {

        System.out.println("digite dois números: ");
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int soma = num1 + num2;

        System.out.println("A soma dos números é: " + soma);
    }
}
