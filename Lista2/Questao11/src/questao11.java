/* 11.As Organizações Tabajara resolveram dar um aumento de salário aos
seus colaboradores e lhe contraram para desenvolver o programa que
calculará os reajustes.
o Faça um programa que recebe o salário de um colaborador e o
reajuste segundo o seguinte critério, baseado no salário atual:
o salários até R$ 280,00 (incluindo) : aumento de 20%
o salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
o salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
o salários de R$ 1500,00 em diante : aumento de 5% Após o
aumento ser realizado, informe na tela:
 o salário antes do reajuste;
 o percentual de aumento aplicado;
 o valor do aumento;
 o novo salário, após o aumento. */

import java.util.Scanner;

public class questao11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o salário do colaborador: ");
        CalculadoraDeReajusteSalario calculadora = new CalculadoraDeReajusteSalario(scan.nextDouble());

        calculadora.calculaReajuste();

        System.out.println("Salário antes do reajuste: " + calculadora.getSalario());
        System.out.println("Percentual de aumento aplicado: " + calculadora.getPercentualDeAumento());
        System.out.println("Valor do aumento: " + calculadora.getValorDoAumento());
        System.out.println("Novo salário, após o aumento: " + calculadora.getNovoSalario());
    }
}
