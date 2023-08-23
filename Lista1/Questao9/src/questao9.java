/* 9. Faça um Programa que peça a temperatura em graus Farenheit,
transforme e mostre a temperatura em graus Celsius (C = (5 * (F-32) / 9)). */

import java.util.Scanner;
import java.text.DecimalFormat;

public class questao9 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a temperatura em Farenheit: ");
        double farenheit = scan.nextDouble();

        double celsius = (5 * (farenheit - 32) / 9);

        DecimalFormat formato = new DecimalFormat("0.00");
        String celsiusFormatado = formato.format(celsius);

        System.out.println("A temperatura em Celsius é: " + celsiusFormatado + "°C");
    }
}
