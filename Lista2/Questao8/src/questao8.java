/* 8. Faça um programa que pergunte o preço de três produtos e informe
qual produto você deve comprar, sabendo que a decisão é sempre
pelo mais barato. */

import java.util.Scanner;

public class questao8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome e o preço de 3 produtos:");
        Produto p1 = new Produto(scan.next(), scan.nextDouble());
        Produto p2 = new Produto(scan.next(), scan.nextDouble());
        Produto p3 = new Produto(scan.next(), scan.nextDouble());

        System.out.println("O produto mais barato é: " + Produto.maisBarato(p1, p2, p3));

        scan.close();
    }
}
