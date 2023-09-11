/*18.Faça um Programa que peça uma data no formato dd/mm/aaaa e
determine se a mesma é uma data válida.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma data no formato dd/mm/aaaa: ");
        String data = scan.nextLine();
        String[] dataSplit = data.split("/");
        int dia = Integer.parseInt(dataSplit[0]);
        int mes = Integer.parseInt(dataSplit[1]);
        int ano = Integer.parseInt(dataSplit[2]);

        Data dataObj = new Data(dia, mes, ano);
        System.out.println(dataObj.getData());
    }
}
