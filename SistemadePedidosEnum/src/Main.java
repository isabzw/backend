public class Main {
    public static void main(String[] args) {

        Pedido pedido = new Pedido(101, "Isabela", StatusPedido.AGUARDANDO_PAGAMENTO);

        pedido.avancarStatus(pedido);
        IO.println(pedido.getStatus());

        pedido.avancarStatus(pedido);
        IO.println(pedido.getStatus());

        pedido.avancarStatus(pedido);
        IO.println(pedido.getStatus());

        pedido.avancarStatus(pedido);
        IO.println(pedido.getStatus());

    }
}