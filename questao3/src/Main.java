public class Main {

    public static void main(String[] args) {

        Bebida pedido1 = new Chantilly(new Espresso());
        Bebida pedido2 = new Leite(new Leite(new Espresso()));
        Bebida pedido3 = new Calda(new Chantilly(new Leite(new Cha())));

        System.out.printf("\n%s = R$ %.2f%n", pedido1.descricao(), pedido1.preco());
        System.out.printf("\n%s = R$ %.2f%n", pedido2.descricao(), pedido2.preco());
        System.out.printf("\n%s, = R$ %.2f%n", pedido3.descricao(), pedido3.preco());

    
    }
}