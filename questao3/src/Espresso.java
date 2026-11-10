public class Espresso implements Bebida {

    private static final double preco = 6.00;

    @Override
    public double preco() {
        return preco;
    }

    @Override
    public String descricao() {
        return "Café Espresso ";
    }

    
}