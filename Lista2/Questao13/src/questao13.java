/* 13.Faça um Programa que leia um número e exiba o dia correspondente
da semana. (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve
aparecer valor inválido. */

import java.util.Scanner;

public class questao13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Digite um número de 1 a 7: ");
        DiasDaSemana dia = new DiasDaSemana(scan.nextInt());

        System.out.println("O dia da semana é: " + dia.getDia());

        scan.close();
    }
}
