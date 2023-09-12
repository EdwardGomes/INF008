public class ReceitaFederal {

    private String nome;

    public ReceitaFederal() {
    }

    public ReceitaFederal(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void calcularImposto() {
    }

    @Override
    public String toString() {
        return "ReceitaFederal{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
