public class Main {
    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria("João", "123456", 1000);
        ContaBancaria conta2 = new ContaBancaria("Maria", "654321", 2000);

        conta1.depositar(500);
        conta2.sacar(500);

        System.out.println("Dados do cliente conta1: " + conta1);
        System.out.println("Dados do cliente conta2: " + conta2);

        ContaPoupanca conta3 = new ContaPoupanca("José", "123498", 1000, 0.1);
        ContaPoupanca conta4 = new ContaPoupanca("Ana", "6543354", 2000, 0.1);

        conta3.depositar(500);
        conta3.calcularNovoSaldo();

        conta4.calcularNovoSaldo();
        conta4.sacar(500);

        System.out.println("Dados do cliente conta3: " + conta3);
        System.out.println("Dados do cliente conta4: " + conta4);

        ContaEspecial conta5 = new ContaEspecial("Pedro", "128756", 490, 500);

        conta5.sacar(200);

        System.out.println("Dados do cliente conta5: " + conta5);

    }
}
