public class ContaEspecial extends ContaBancaria{

    private double limite;

    public ContaEspecial() {
        super();
        this.limite = 0;
    }

    public ContaEspecial(String nomeCliente, String numConta, double saldo, double limite) {
        super(nomeCliente, numConta, saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= (getSaldo() + limite)) {
            setSaldo(getSaldo() - valor);
        }
    }

    @Override
    public String toString() {
        return "ContaEspecial{" + "limite=" + limite + '}'
                + super.toString();
    }
}
