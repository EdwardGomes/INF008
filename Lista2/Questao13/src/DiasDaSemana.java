public class DiasDaSemana {

    private final int dia;

    public DiasDaSemana(int dia) {
        this.dia = dia;
    }

    public String getDia() {
        return switch (this.dia) {
            case 1 -> "1-Domingo";
            case 2 -> "2-Segunda-feira";
            case 3 -> "3-Terça-feira";
            case 4 -> "4-Quarta-feira";
            case 5 -> "5-Quinta-feira";
            case 6 -> "6-Sexta-feira";
            case 7 -> "7-Sábado";
            default -> "Valor inválido";
        };
    }

}
