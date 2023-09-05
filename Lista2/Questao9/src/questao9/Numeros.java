package questao9;

public record Numeros(int valor) {

	public String toString() {
		return "" + this.valor;
	}

	public static Numeros maior(Numeros n1, Numeros n2, Numeros n3) {
		if (n1.valor() > n2.valor() && n1.valor() > n3.valor()) {
			return n1;
		} else if (n2.valor() > n1.valor() && n2.valor() > n3.valor()) {
			return n2;
		} else {
			return n3;
		}
	}

	public static Numeros menor(Numeros n1, Numeros n2, Numeros n3) {
		if (n1.valor() < n2.valor() && n1.valor() < n3.valor()) {
			return n1;
		} else if (n2.valor() < n1.valor() && n2.valor() < n3.valor()) {
			return n2;
		} else {
			return n3;
		}
	}

	public static Numeros meio(Numeros n1, Numeros n2, Numeros n3) {
		if (n1.valor() > n2.valor() && n1.valor() < n3.valor()) {
			return n1;
		} else if (n2.valor() > n1.valor() && n2.valor() < n3.valor()) {
			return n2;
		} else {
			return n3;
		}
	}

}
