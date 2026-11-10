public class Mensalista implements PagamentoStrategy{
    
    private final double valorFixo = 300.00;

    @Override
    public double calcularValor(int minutos){

        return valorFixo;
    }
}
