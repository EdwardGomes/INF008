package questao9;

public class Numeros {
	
	private int valor;
	
	public Numeros(int valor) {
		this.valor = valor;
	}
	
	public int getValor() {
		return this.valor;
	}

	public String toString() {
		return "" + this.valor;
	}

	public static Numeros maior(Numeros n1, Numeros n2, Numeros n3) {
		if (n1.getValor() > n2.getValor() && n1.getValor() > n3.getValor()) {
			return n1;
		} else if (n2.getValor() > n1.getValor() && n2.getValor() > n3.getValor()) {
			return n2;
		} else {
			return n3;
		}
	}

	public static Numeros menor(Numeros n1, Numeros n2, Numeros n3) {
		if (n1.getValor() < n2.getValor() && n1.getValor() < n3.getValor()) {
			return n1;
		} else if (n2.getValor() < n1.getValor() && n2.getValor() < n3.getValor()) {
			return n2;
		} else {
			return n3;
		}
	}

	public static Numeros meio(Numeros n1, Numeros n2, Numeros n3) {
		if (n1.getValor() > n2.getValor() && n1.getValor() < n3.getValor()) {
			return n1;
		} else if (n2.getValor() > n1.getValor() && n2.getValor() < n3.getValor()) {
			return n2;
		} else {
			return n3;
		}
	}

}
