public class Produto extends absObservado {
    private String nome;
    private int quantidade;

    public Produto(String nome, int quantidade){
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome(){
        return nome;
    }
    
    public int getQuantidade(){
        return quantidade;
    }

    public void alterarQuantidade(int novaQuantidade){
        if (this.quantidade == novaQuantidade) {
            return;
        }

        this.quantidade = novaQuantidade;

        notificarObservers();
    }
}
