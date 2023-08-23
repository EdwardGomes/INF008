/* 5. Faça um Programa que converta metros para centímetros. */

public class questao5 {
    public static void main(String[] args) {

        int metros;
        int centimetros = converterMetrosParaCentimetros(metros = 40);

        System.out.println(metros + " metros equivale a " + centimetros + " centímetros.");
    }

    public static int converterMetrosParaCentimetros(int metros) {
        return metros * 100;
    }
}
