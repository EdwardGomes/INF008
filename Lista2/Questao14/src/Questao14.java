/*14.Faça um programa que lê as duas notas parciais obtidas por um aluno
numa disciplina ao longo de um semestre, e calcule a sua média. A
atribuição de conceitos obedece à tabela abaixo:
o Média de Aproveitamento Conceito
o Entre 9.0 e 10.0 A
o Entre 7.5 e 9.0 B
o Entre 6.0 e 7.5 C
o Entre 4.0 e 6.0 D
o Entre 4.0 e zero E
O algoritmo deve mostrar na tela as notas, a média, o conceito
correspondente e a mensagem “APROVADO” se o conceito for
A, B ou C ou “REPROVADO” se o conceito for D ou E.*/

import java.util.Scanner;

public class Questao14 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite as duas notas parciais: ");
        Notas notas = new Notas(scan.nextDouble(), scan.nextDouble());
        scan.close();

        notas.setConceito();
        notas.setNota1();
        notas.setNota2();
        notas.setMedia();

        System.out.println("Conceito: " + notas.getConceito());

    }
}
