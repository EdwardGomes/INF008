public record Turnos(String turno) {

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
