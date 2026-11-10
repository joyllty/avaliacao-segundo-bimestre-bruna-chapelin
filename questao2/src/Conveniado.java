public class Conveniado implements PagamentoStrategy{
    
    private final double valorHora = 8.00;
    private final double desconto = 0.30;

    @Override
    public double calcularValor(int minutos){
        int minutosGratuitos = 30;

        if (minutos <= minutosGratuitos){
            return 0.0;
        }

        int minutosCobrados = minutos - minutosGratuitos;

        double total = ((minutosCobrados / 60) * valorHora); 

        return total - (total * desconto);
    }
}
