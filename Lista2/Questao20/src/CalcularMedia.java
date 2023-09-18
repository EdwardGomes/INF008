public class CalcularMedia {
    private final double nota1;
    private final double nota2;
    private final double nota3;
    private double media;

    public CalcularMedia(double nota1, double nota2, double nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double getMedia() {
        return media;
    }

    public void calcularMedia() {
        media = (nota1 + nota2 + nota3) / 3;
    }

    @Override
    public String toString() {
        if (media == 10) {
            return "Aprovado com Distinção";
        } else if (media >= 7) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

}
