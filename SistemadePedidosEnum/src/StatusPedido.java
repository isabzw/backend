public enum StatusPedido {
    AGUARDANDO_PAGAMENTO("Aguardando confirmação financeira"),
    PROCESSANDO("Pedido sendo preparado no estoque"),
    ENVIADO("Pedido enviado para transporte"),
    ENTREGUE("Pedido entregue ao destinatário"),
    CANCELADO("Pedido cancelado");

    private String descricao;

    StatusPedido(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}