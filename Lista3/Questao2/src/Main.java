public class Main {
    public static void main(String[] args) {

        ReceitaFederal[] receitaFederal = new ReceitaFederal[6];

        receitaFederal[0] = new PessoaFisica("João", "123456789-00", 1000);
        receitaFederal[1] = new PessoaFisica("Maria", "987654321-00", 2000);
        receitaFederal[2] = new PessoaFisica("José", "126566789-00", 3000);

        receitaFederal[3] = new PessoaJuridica("Augusto", "12878789-00", 10000);
        receitaFederal[4] = new PessoaJuridica("Ana", "12987819-00", 20000);
        receitaFederal[5] = new PessoaJuridica("Carlos", "123456789-00", 30000);

        for (ReceitaFederal receita : receitaFederal) {
            receita.calcularImposto();
            System.out.println(receita);
        }

    }
}
