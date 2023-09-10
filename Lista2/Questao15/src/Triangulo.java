public class Triangulo {

    private final double lado1;
    private final double lado2;
    private final double lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public boolean isTriangulo() {
        return (this.lado1 + this.lado2 > this.lado3) &&
               (this.lado1 + this.lado3 > this.lado2) &&
               (this.lado2 + this.lado3 > this.lado1);
    }

    public boolean isEquilatero() {
        return this.isTriangulo() &&
               (this.lado1 == this.lado2) &&
               (this.lado1 == this.lado3);
    }

    public boolean isIsosceles() {
        return this.isTriangulo() &&
               (this.lado1 == this.lado2) &&
               (this.lado1 != this.lado3) ||
               (this.lado1 == this.lado3) &&
               (this.lado1 != this.lado2) ||
               (this.lado2 == this.lado3) &&
               (this.lado2 != this.lado1);
    }

    public boolean isEscaleno() {
        return this.isTriangulo() &&
               (this.lado1 != this.lado2) &&
               (this.lado1 != this.lado3) &&
               (this.lado2 != this.lado3);
    }

    public String getTipo() {
        if (this.isEquilatero()) {
            return "Triângulo Equilátero (todos os lados iguais)";
        } else if (this.isIsosceles()) {
            return "Triângulo Isósceles (dois lados iguais)";
        } else if (this.isEscaleno()) {
            return "Triângulo Escaleno (todos os lados diferentes)";
        } else {
            return "Não é um triângulo";
        }
    }
}
