public class Calda extends ComplementoDecorator {

    private static final double preco = 2.00;

    public Calda(Bebida bebida) {
        super(bebida, "Calda", preco);
    }
}