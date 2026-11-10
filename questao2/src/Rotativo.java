public class Rotativo implements PagamentoStrategy{

    private final double valorHora = 8.00;

    @Override
    public double calcularValor(int minutos){
        int horas = (minutos / 60);

        double total = horas * valorHora;

        return total;
    }
}
