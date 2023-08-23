/* 12.Tendo como dados de entrada a altura de uma pessoa, construa um
algoritmo que calcule seu peso ideal, usando a seguinte fórmula:
(72.7*altura) - 58 */

import java.text.DecimalFormat;

public class questao12 {
    public static void main(String[] args) {

        double altura = 1.75;
        double pesoIdeal = (72.7 * altura) - 58;

        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("O peso ideal para uma pessoa com " + altura + "m é " + df.format(pesoIdeal) + "kg.");
    }
}
