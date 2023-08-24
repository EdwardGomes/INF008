/*4. Faça um Programa que verifique se uma letra digitada é vogal ou
consoante.*/

import java.util.Scanner;

public class questao4 {

    public static void main(String[] args) {

        System.out.println("Digite um caractere:");
        Scanner scan=new Scanner(System.in);
        String c=scan.next();
        c=c.toLowerCase();

        if(Character.isLetter(c.charAt(0))) {
            switch (c.charAt(0)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':{
                    System.out.println("Classificado como vogal");
                    break;
                }
                default:
                    System.out.println("Classificado como consoante");
            }
        }else if(Character.isDigit(c.charAt(0))) {
            System.out.println("Classificado como número");
        }else {
            System.out.println("Classificado como outro");
        }

        scan.close();
    }

}
