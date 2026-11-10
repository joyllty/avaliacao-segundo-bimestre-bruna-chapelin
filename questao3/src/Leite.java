public class Leite extends ComplementoDecorator {

    private static final double preco = 4.00;

    public Leite(Bebida bebida) {
        super(bebida, "Leite", preco);
    }
}