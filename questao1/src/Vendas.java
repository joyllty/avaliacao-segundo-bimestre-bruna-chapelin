public class Vendas extends absObservador{

    private boolean estoqueZerado = false;

    public Vendas(Produto observado) {
        super(observado);
        this.estoqueZerado = observado.getQuantidade() == 0;
    }

    @Override 
    public void update(){

        int quantidade = observado.getQuantidade();

        if (quantidade == 0){
            estoqueZerado = true;
        }

        else if (estoqueZerado && quantidade > 0){
            System.out.println("\nVENDAS\n>> " + observado.getNome() + " voltou a ter estoque\n>> Quantidade: " + quantidade);

            estoqueZerado = false;
        }

    }
    
}
