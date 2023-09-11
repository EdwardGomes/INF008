public class anoBissexto {

    private anoBissexto() {
        throw new IllegalStateException("Utility class");
    }

    public static boolean isBissexto(int ano) {
        if (ano % 400 == 0) {
            return true;
        } else if ((ano % 4 == 0) && (ano % 100 != 0)) {
            return true;
        } else {
            return false;
        }
    }

}
