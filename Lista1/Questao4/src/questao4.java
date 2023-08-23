/* 4. Faça um Programa que peça as 4 notas bimestrais e mostre a média. */

import java.util.Scanner;
import java.util.Locale;

public class questao4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        double nota1, nota2, nota3, nota4, media;

        System.out.print("Digite a primeira nota: ");
        nota1 = scan.nextDouble();
        System.out.print("Digite a segunda nota: ");
        nota2 = scan.nextDouble();
        System.out.print("Digite a terceira nota: ");
        nota3 = scan.nextDouble();
        System.out.print("Digite a quarta nota: ");
        nota4 = scan.nextDouble();

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A média das notas é: " + media);

        scan.close();
    }
}
