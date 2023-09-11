public class ContaPoupanca extends ContaBancaria{

    private double diaRendimento;

    public ContaPoupanca(String nomeCliente, String numConta, double saldo, double diaRendimento) {
        super(nomeCliente, numConta, saldo);
        this.diaRendimento = diaRendimento;
    }

    public double getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(double diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public void calcularNovoSaldo() {
        setSaldo(getSaldo() + (getSaldo() * diaRendimento));
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" + "diaRendimento=" + diaRendimento + '}'
                + super.toString();
    }
}
