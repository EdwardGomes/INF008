public class PessoaFisica extends ReceitaFederal{

    private String cpf;
    private double rendaBruta;
    private double imposto;

    public PessoaFisica(String nome, String cpf, double rendaBruta) {
        super(nome);
        this.cpf = cpf;
        this.rendaBruta = rendaBruta;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getRendaBruta() {
        return rendaBruta;
    }

    public void setRendaBruta(double rendaBruta) {
        this.rendaBruta = rendaBruta;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    @Override
    public void calcularImposto(){
        if (rendaBruta <= 1400){
            this.imposto = 0;
        } else if (rendaBruta <= 2100){
            this.imposto = rendaBruta * 0.1;
        } else if (rendaBruta <= 2800){
            this.imposto = rendaBruta * 0.15;
        } else if (rendaBruta <= 3600){
            this.imposto = rendaBruta * 0.25;
        } else {
            this.imposto = rendaBruta * 0.3;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "PessoaFisica{" +
                "cpf='" + cpf + '\'' +
                ", rendaBruta=" + rendaBruta +
                ", imposto=" + imposto +
                '}';
    }
}
