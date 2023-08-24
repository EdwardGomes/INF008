/* 5. Faça um programa para a leitura de duas notas parciais de um aluno.
O programa deve calcular a média alcançada por aluno e apresentar:
o A mensagem "Aprovado", se a média alcançada for maior ou
igual a sete;
o A mensagem "Reprovado", se a média for menor do que sete;
o A mensagem "Aprovado com Distinção", se a média for igual a
dez. */

import java.util.Scanner;

public class questao5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a primeira nota parcial: ");
        double nota1 = scan.nextDouble();


        System.out.println("Digite a segunda nota parcial: ");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2) /2;

        if(media >= 7 && media <= 9) {
            System.out.println("Aprovado com média: " + media);
        }
        else if(media < 7 && media >= 0) {
            System.out.println("Reprovado com média: " + media);
        }
        else {
            System.out.println("Aprovado com Distinção com média: " + media);
        }

        scan.close();
    }
}