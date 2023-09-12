public class PessoaJuridica extends ReceitaFederal{

    private String cnpj;
    private double rendaBruta;
    private double imposto;

    public PessoaJuridica(String nome, String cnpj, double rendaBruta) {
        super(nome);
        this.cnpj = cnpj;
        this.rendaBruta = rendaBruta;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public double getRendaBruta() {
        return this.rendaBruta;
    }

    public void setRendaBruta(double rendaBruta) {
        this.rendaBruta = rendaBruta;
    }

    public double getImposto() {
        return this.imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;

    }

    @Override
    public void calcularImposto() {
        this.imposto = this.rendaBruta * 0.1;
    }

    @Override
    public String toString() {
        return super.toString() + "PessoaJuridica{" +
                "cnpj='" + cnpj + '\'' +
                ", rendaBruta=" + rendaBruta +
                ", imposto=" + imposto +
                '}';
    }
}
