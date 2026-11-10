public class Chantilly extends ComplementoDecorator {

    private static final double preco = 3.50;

    public Chantilly(Bebida bebida) {
        super(bebida, "Chantilly", preco);
    }
}