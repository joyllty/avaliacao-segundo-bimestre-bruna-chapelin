public abstract class ComplementoDecorator implements Bebida {

    protected final Bebida bebida;
    private final String nome;
    private final double preco;

    protected ComplementoDecorator(Bebida bebida, String nome, double preco) {
        this.bebida = bebida;
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public double preco() {
        return bebida.preco() + preco;
    }

    @Override
    public String descricao() {
        return bebida.descricao() + " + " + nome;
    }

    
}