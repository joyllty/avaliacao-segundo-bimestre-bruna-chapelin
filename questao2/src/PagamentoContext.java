public class PagamentoContext {
    
    private PagamentoStrategy estrategia;

    private String placa;
    private int minutos;

    public PagamentoContext(PagamentoStrategy estrategia, String placa, int minutos){
        this.estrategia = estrategia;
        this.placa = placa;
        this.minutos = minutos;
    }

    public void setStrategy(PagamentoStrategy estrategiaNova){
        this.estrategia = estrategiaNova;
    }

    public double executeStrategy(){
        return estrategia.calcularValor(minutos);
    }
}
