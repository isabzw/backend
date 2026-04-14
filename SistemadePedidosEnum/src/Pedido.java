public class Pedido {
    private int id;
    private String cliente;
    private StatusPedido status;

    public Pedido(int id, String cliente, StatusPedido status) {
        this.id = id;
        this.cliente = cliente;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public void avancarStatus(Pedido pedido) {
        IO.println("status do pedido");
        if (StatusPedido.AGUARDANDO_PAGAMENTO == pedido.getStatus()){
            setStatus(StatusPedido.PROCESSANDO);
        } else if (StatusPedido.PROCESSANDO == pedido.getStatus()) {
            setStatus(StatusPedido.ENVIADO);
        } else if (StatusPedido.ENVIADO == pedido.getStatus()){
            setStatus(StatusPedido.ENTREGUE);
        } else {
            IO.println("o status não pode ser encontrado");
        }
    }
}