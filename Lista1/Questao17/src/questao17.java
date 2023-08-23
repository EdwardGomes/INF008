/* 17.Faça um Programa para uma loja de tintas. O programa deverá pedir o
tamanho em metros quadrados da área a ser pintada. Considere que a
cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a
tinta é vendida em latas de 18 litros, que custam R$ 80,00 ou em
galões de 3,6 litros, que custam R$ 25,00.
o Informe ao usuário as quantidades de tinta a serem compradas
e os respectivos preços em 3 situações:
o comprar apenas latas de 18 litros;
o comprar apenas galões de 3,6 litros;
o misturar latas e galões, de forma que o preço seja o
menor. Acrescente 10% de folga e sempre arredonde os
valores para cima, isto é, considere latas cheias. */

import java.text.DecimalFormat;
import java.util.Scanner;

public class questao17 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o tamanho em metros quadrados da área a ser pintada: ");
        double area = scan.nextDouble();

        double litroPorMetroQuadrado = 1.0 / 6.0;
        double litroNecessario = area * litroPorMetroQuadrado * 1.1; // 10% de folga

        int latas18L = (int) Math.ceil(litroNecessario / 18);
        int galoes3_6L = (int) Math.ceil(litroNecessario / 3.6);

        double precoTotalLatas18L = latas18L * 80.0;
        double precoTotalGaloes3_6L = galoes3_6L * 25.0;

        // Misturar latas e galões, de forma que o preço seja o menor
        int latasMisturadas = (int) (litroNecessario / 18);
        int galoesMisturados = (int) Math.ceil((litroNecessario - latasMisturadas * 18) / 3.6);

        double precoTotalMisturado = (latasMisturadas * 80.0) + (galoesMisturados * 25.0);

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Comprar apenas latas de 18 litros: " + latas18L);
        System.out.println("Preço total: R$ " + df.format(precoTotalLatas18L));

        System.out.println("Comprar apenas galões de 3,6 litros: " + galoes3_6L);
        System.out.println("Preço total: R$ " + df.format(precoTotalGaloes3_6L));

        System.out.println("Quantidade de latas de 18L: " + latasMisturadas);
        System.out.println("Quantidade de galões de 3,6L: " + galoesMisturados);
        System.out.println("Preço total: R$ " + df.format(precoTotalMisturado));

        scan.close();
    }
}
