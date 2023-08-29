public class Turnos {

    private String turno;

    public Turnos(String turno) {
        this.turno = turno;
    }

    public String getTurno() {
        return this.turno;
    }

    public String toString() {
        return this.turno;
    }

    public static String turno(String turno) {
        return switch (turno) {
            case "M" -> "Bom dia!";
            case "V" -> "Boa tarde!";
            case "N" -> "Boa noite!";
            default -> "Valor inválido!";
        };
    }

}
