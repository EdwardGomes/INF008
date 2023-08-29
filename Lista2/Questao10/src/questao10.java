/*10.Faça um Programa que pergunte em que turno você estuda. Peça
para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a
mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor
Inválido!", conforme o caso.*/

import java.util.Scanner;

public class questao10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Em que turno você estuda? Digite M-matutino ou V-Vespertino ou N- Noturno");
        Turnos t1 = new Turnos(scan.next());

        System.out.println(Turnos.turno(t1.getTurno()));

        scan.close();
    }
}
