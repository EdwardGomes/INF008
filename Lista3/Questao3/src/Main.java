public class Main {
    public static void main(String[] args) {

        Animal[] animais = new Animal[3];

        animais[0] = new Mamifero("Camelo", 150, (short) 4, "Amarelo", "Terra", 2, "Vegetais");
        animais[1] = new Peixe("Tubarão", 300, (short) 0, "Cinzento", "Mar", 1.5, "Barbatanas e cauda");
        animais[2] = new Mamifero("Urso-do-Canadá", 180, (short) 4, "Vermelho", "Terra", 0.5, "Mel");

        System.out.println("Zoo:");

        for (Animal animal : animais) {
            System.out.println("==================================");
            System.out.println(animal);
        }
    }
}
