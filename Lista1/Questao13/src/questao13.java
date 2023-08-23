/* 13.Tendo como dados de entrada a altura e o sexo de uma pessoa,
construa um algoritmo que calcule seu peso ideal, utilizando as
seguintes fórmulas:
. Para homens: (72.7*h) - 58
a. Para mulheres: (62.1*h) - 44.7 (h = altura)
b. Peça o peso da pessoa e informe se ela está dentro, acima ou abaixo do peso. */

import java.util.Scanner;

public class questao13 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite sua altura: ");
        double altura = scan.nextDouble();

        System.out.println("Digite seu sexo: ");
        char sexo = scan.next().charAt(0);

        System.out.println("Digite seu peso: ");
        double peso = scan.nextDouble();

        double pesoIdeal = pesoIdeal(altura, sexo);

        if (peso == pesoIdeal){
            System.out.println("Você está no peso ideal!");
        } else if (peso > pesoIdeal){
            System.out.println("Você está acima do peso ideal!");
        } else {
            System.out.println("Você está abaixo do peso ideal!");
        }

        scan.close();
    }

    public static double pesoIdeal(double altura, char sexo) {

        double pesoIdeal = 0;

        if (sexo == 'm') {
            pesoIdeal = (72.7 * altura) - 58;
        } else if (sexo == 'f') {
            pesoIdeal = (62.1 * altura) - 44.7;
        }
        return pesoIdeal;
    }
}
