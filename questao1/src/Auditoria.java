public class Auditoria extends absObservador{

    public Auditoria(Produto observado){
        super(observado);
    }

    // registra toda alteração de estoque
    @Override 
    public void update(){
        System.out.println("\nAUDITORIA\n>> Estoque de " + observado.getNome() + " alterado para "+ observado.getQuantidade() + " unidades");
    }
    
}
