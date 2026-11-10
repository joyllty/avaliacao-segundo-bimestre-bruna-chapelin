public class Compras extends absObservador{

    public Compras(Produto observado){
        super(observado);
    }

    @Override 
    public void update(){

        if(observado.getQuantidade() < 5) {
            System.out.println("\nCOMPRAS\n>> Estoque baixo de " + observado.getNome() + "\n>> Quantidade: " + observado.getQuantidade());
        }
    }
    
}
