public class Funcionario {

    private final double valorHora;
    private final int horasTrabalhadas;
    private double salarioBruto;
    private double descontoIR;
    private double descontoINSS;
    private double descontoSindicato;
    private double descontoFGTS;
    private double salarioLiquido;
    private double totalDescontos;

    public Funcionario(double valorHora, int horasTrabalhadas){
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public void calcularFolhaDePagamento(){
        this.salarioBruto = this.valorHora * this.horasTrabalhadas;

        if (this.salarioBruto <= 900){
            this.descontoIR = 0;
        } else if (this.salarioBruto <= 1500){
            this.descontoIR = this.salarioBruto * 0.05;
        } else if (this.salarioBruto <= 2500){
            this.descontoIR = this.salarioBruto * 0.1;
        } else {
            this.descontoIR = this.salarioBruto * 0.2;
        }

        this.descontoINSS = this.salarioBruto * 0.1;
        this.descontoSindicato = this.salarioBruto * 0.03;
        this.descontoFGTS = this.salarioBruto * 0.11;
        this.totalDescontos = this.descontoIR + this.descontoINSS + this.descontoSindicato;
        this.salarioLiquido = this.salarioBruto - this.totalDescontos;
    }

    @Override
    public String toString() {
        return "Salário Bruto: R$ " + this.salarioBruto + "\n" +
                "(-) IR: R$ " + this.descontoIR + "\n" +
                "(-) INSS: R$ " + this.descontoINSS + "\n" +
                "(-) Sindicato: R$ " + this.descontoSindicato + "\n" +
                "FGTS: R$ " + this.descontoFGTS + "\n" +
                "Total de descontos: R$ " + this.totalDescontos + "\n" +
                "Salário Líquido: R$ " + this.salarioLiquido + "\n";
    }
}
