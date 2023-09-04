public class Notas {

    private double nota1;
    private double nota2;
    private double media;
    private String conceito;

    public Notas(double nota1, double nota2) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.media = (nota1 + nota2) / 2;
        this.conceito = "";
    }

    public void setNota1() {
        if (nota1 >= 0 && nota1 <= 10) {
            System.out.println("Nota 1: " + nota1);
        }
        else {
            System.out.println("Nota inválida!");
        }
    }

    public void setNota2() {
        if (nota2 >= 0 && nota2 <= 10) {
            System.out.println("Nota 2: " + nota2);
        } else {
            System.out.println("Nota inválida!");
        }
    }

    public void setMedia() {
        if (nota1 >= 0 && nota1 <= 10 && nota2 >= 0 && nota2 <= 10) {
            this.media = (nota1 + nota2) / 2;
            System.out.println("Média: " + media);
        } else {
            System.out.println("Média inválida!");
        }
    }

    public String getConceito() {
        return this.conceito;
    }

    public void setConceito() {
        if (this.media >= 9 && this.media <= 10) {
            this.conceito = "A - Aprovado!";
        } else if (this.media >= 7.5 && this.media < 9) {
            this.conceito = "B - Aprovado!";
        } else if (this.media >= 6 && this.media < 7.5) {
            this.conceito = "C - Aprovado!";
        } else if (this.media >= 4 && this.media < 6) {
            this.conceito = "D - Reprovado!";
        } else if (this.media >= 0 && this.media < 4) {
            this.conceito = "E - Reprovado!";
        } else {
            this.conceito = "Média inválida!";
        }
    }
}
