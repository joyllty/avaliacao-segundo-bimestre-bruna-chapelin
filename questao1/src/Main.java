public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Notebook", 10);

        Compras compras = new Compras(produto);
        Vendas vendas = new Vendas(produto);
        Auditoria auditoria = new Auditoria(produto);

        produto.adicionarObserver(compras);
        produto.adicionarObserver(vendas);
        produto.adicionarObserver(auditoria);

        System.out.println("\n ======= Alterando quantidade =======");
        produto.alterarQuantidade(4);

        System.out.println("\n ======= Alterando quantidade =======");
        produto.alterarQuantidade(0);

        System.out.println("\n ======= Alterando quantidade =======");
        produto.alterarQuantidade(8);

        // removendo Auditoria
        produto.removerObserver(auditoria);

        System.out.println("\n ======= Alterando quantidade =======");
        produto.alterarQuantidade(3);

        System.out.println("\n ======= Alterando quantidade =======");
        produto.alterarQuantidade(0);

        System.out.println("\n ======= Alterando quantidade =======");
        produto.alterarQuantidade(6);
    }
}

