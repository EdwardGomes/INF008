/* 2. Faça um Programa que peça um valor e mostre na tela se o valor é
positivo ou negativo. */

import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = scan.nextInt();

        if (num > 0){
            System.out.println("O número é positivo.");
        } else if (num < 0){
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é zero.");
        }

        scan.close();
    }
}
