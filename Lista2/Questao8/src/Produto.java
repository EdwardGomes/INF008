public class Produto {

    private final String nome;
    private final double preco;

    public Produto(String nome, double preco) {// Construtor da classe Produto
        this.nome = nome;
        this.preco = preco;
    }

    public double getPreco() { // Método getPreco para retornar o preço do produto
        return this.preco;
    }

    public String toString() { // Método toString para imprimir o produto
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


