public class Produto {

    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double getPreco() {
        return this.preco;
    }


    public String toString() {
        return this.nome + " - R$ " + this.preco;
    }

    public static Produto maisBarato(Produto p1, Produto p2, Produto p3) {
        if (p1.getPreco() < p2.getPreco() && p1.getPreco() < p3.getPreco()) {
            return p1;
        } else if (p2.getPreco() < p1.getPreco() && p2.getPreco() < p3.getPreco()) {
            return p2;
        } else {
            return p3;
        }
    }
}


