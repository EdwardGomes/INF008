/* 16.Faça um programa para uma loja de tintas. O programa deverá pedir o
tamanho em metros quadrados da área a ser pintada. Considere que a
cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a
tinta é vendida em latas de 18 litros, que custam R$ 80,00. Informe ao
usuário a quantidades de latas de tinta a serem compradas e o preço
total. */

import java.util.Scanner;
import java.text.DecimalFormat;

public class questao16 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o tamanho em metros quadrados da área a ser pintada: ");
        double area = scan.nextDouble();

        double litroDeTinta = 1.0 / 3.0;
        double litroNecessario = area * litroDeTinta;
        int latas18L = (int) Math.ceil(litroNecessario / 18);
        double precoTotal = latas18L * 80.0;

        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("Você precisará de " + latas18L + " latas de tinta de 18L.");
        System.out.println("O preço total é de R$ " + df.format(precoTotal) + ".");

        scan.close();
    }
}
