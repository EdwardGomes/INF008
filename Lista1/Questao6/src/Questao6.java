/* 6. Faça um Programa que peça o raio de um círculo, calcule e mostre
sua área. */
import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o raio do circulo: ");
        double raio = input.nextDouble();

        System.out.println("Area do circulo: " + areaCirculo(raio));
    }

    public static double areaCirculo(double raio) {
        return Math.PI * Math.pow(raio, 2);
    }
}
