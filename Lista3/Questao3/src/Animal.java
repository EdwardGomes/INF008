public class Animal {

    private String nome;
    private double comprimento;
    private short patas;
    private String cor;
    private String ambiente;
    private double velocidade;

    public Animal() {
        this.nome = "";
        this.comprimento = 0;
        this.patas = 0;
        this.cor = "";
        this.ambiente = "";
        this.velocidade = 0;
    }

    public Animal(String nome, double comprimento, short patas, String cor, String ambiente, double velocidade) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.patas = patas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidade = velocidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public short getPatas() {
        return patas;
    }

    public void setPatas(short patas) {
        this.patas = patas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public String toString() {
        return "Animal: " + this.nome
                + "\nComprimento: " + this.comprimento + " cm"
                + "\nPatas: " + this.patas
                + "\nCor: " + this.cor
                + "\nAmbiente: " + this.ambiente
                + "\nVelocidade: " + this.velocidade + " m/s";
    }
}
