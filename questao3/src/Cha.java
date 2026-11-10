public class Cha implements Bebida {

    private static final double preco = 9.00;

    @Override
    public double preco() {
        return preco;
    }

    @Override
    public String descricao() {
        return "Cha Quente";
    }

    
}