public class Main {
    public static void main(String[] args) {

        PagamentoStrategy rotativo = new Rotativo();
        PagamentoStrategy mensalista = new Mensalista();
        PagamentoStrategy conveniado = new Conveniado();

        // cria um único ticket
        PagamentoContext ticket = new PagamentoContext(rotativo, "ABC-1234", 90);

        System.out.println(">> Rotativo: R$ " + ticket.executeStrategy());

        // trocando para mensalista
        ticket.setStrategy(mensalista);
        System.out.println(">> Mensalista: R$ " + ticket.executeStrategy());

        // trocando para conveniado
        ticket.setStrategy(conveniado);
        System.out.println(">> Conveniado: R$ " + ticket.executeStrategy());

        ticket.setStrategy(rotativo);
        System.out.println(">> Voltando para Rotativo: R$ " + ticket.executeStrategy());
    }
}
