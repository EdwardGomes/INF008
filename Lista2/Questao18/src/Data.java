public class Data {

    private final int dia;
    private final int mes;
    private final int ano;
    private final int[] diasNoMes = {31,28,31,30,31,30,31,31,30,31,30,31};

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    private boolean isBissexto() {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    private int incrementaDia() {
        if (isBissexto()) {
            diasNoMes[1] = 29;
        }
        return diasNoMes[mes - 1];
    }

    public String getData() {
        if (dia > incrementaDia() || dia < 1 || mes < 1 || mes > 12 || ano < 1) {
            return "Data inválida";
        }
        return String.format("%02d/%02d/%04d é uma data válida", dia, mes, ano);
    }
}
