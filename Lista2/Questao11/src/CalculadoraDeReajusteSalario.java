public class CalculadoraDeReajusteSalario {

    private final double salario;
    private double percentualDeAumento;
    private double valorDoAumento;
    private double novoSalario;

    public CalculadoraDeReajusteSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return this.salario;
    }

    public double getPercentualDeAumento() {
        return this.percentualDeAumento;
    }

    public double getValorDoAumento() {
        return this.valorDoAumento;
    }

    public double getNovoSalario() {
        return this.novoSalario;
    }

    public void calculaReajuste() {
        if (this.salario <= 280) {
            this.percentualDeAumento = 0.2;
        }
        else if (this.salario <= 700) {
            this.percentualDeAumento = 0.15;
        }
        else if (this.salario <= 1500) {
            this.percentualDeAumento = 0.1;
        }
        else {
            this.percentualDeAumento = 0.05;
        }
        this.valorDoAumento = this.salario * this.percentualDeAumento;
        this.novoSalario = this.salario + this.valorDoAumento;
    }

}
