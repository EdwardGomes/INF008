/* 18.Faça um programa que peça o tamanho de um arquivo para download
(em MB) e a velocidade de um link de Internet (em Mbps), calcule e
informe o tempo aproximado de download do arquivo usando este link
(em minutos). */

import java.util.Scanner;
import java.text.DecimalFormat;

public class questao18 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o tamanho do arquivo em MB: ");
        double tamanhoArquivo = scan.nextDouble();

        System.out.println("Digite a velocidade do link de internet em Mbps: ");
        double velocidadeLink = scan.nextDouble();

        double velocidadeEmMB = velocidadeLink / 8;
        double tempoDownload = tamanhoArquivo / velocidadeEmMB;
        double tempoDownloadMinutos = tempoDownload / 60;

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("O tempo aproximado de download do arquivo é de " + df.format(tempoDownloadMinutos) + " minutos.");

        scan.close();
    }
}
