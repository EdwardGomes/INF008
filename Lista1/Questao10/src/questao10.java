/* 10.Faça um Programa que peça a temperatura em graus Celsius,
transforme e mostre em graus Farenheit. */

import java.util.Scanner;
import java.text.DecimalFormat;

public class questao10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a temperatura em graus Celsius: ");
        double celsius = scan.nextDouble();

        double farenheit = (celsius * 1.8) + 32;

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("A temperatura em graus Farenheit é: " + df.format(farenheit) + "°F");

        scan.close();
    }
}
