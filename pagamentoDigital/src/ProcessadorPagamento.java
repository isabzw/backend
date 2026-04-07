public class ProcessadorPagamento {
    private MetodoPagamento metodo;

    public void selecionarMetodo(MetodoPagamento metodo) {
        this.metodo = metodo;
    }

    public void realizarCobranca(double valor) {
        if (metodo == null) {
            IO.println("Erro: Nenhum método de pagamento selecionado.");
            return;
        }

        if (metodo.validar()) {
            metodo.processar(valor);
            IO.println("Status: Pagamento Concluído.\n");
        } else {
            IO.println("Status: Falha no pagamento.\n");
        }
    }
}
