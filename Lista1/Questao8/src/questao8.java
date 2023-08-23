/* 8. Faça um Programa que pergunte quanto você ganha por hora e o
número de horas trabalhadas no mês. Calcule e mostre o total do seu
salário no referido mês. */
import java.util.Scanner;

public class questao8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int horas;
        double valorHora, salario;

        System.out.println("Digite o valor da hora trabalhada: ");
        valorHora = scan.nextDouble();

        System.out.println("Digite o número de horas trabalhadas no mês: ");
        horas = scan.nextInt();

        salario = valorHora * horas;
        System.out.println("O salário do mês é: " + salario + "R$");

        scan.close();
    }
}
