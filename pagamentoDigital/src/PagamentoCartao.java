public class PagamentoCartao implements MetodoPagamento {
    private String numeroCartao;

    public PagamentoCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    @Override
    public boolean validar() {
        IO.println("Verificando limite do cartão: " + numeroCartao);
        return true;
    }

    @Override
    public void processar(double valor) {
        IO.println("Transação de R$" + valor + " aprovada.");
    }
}
