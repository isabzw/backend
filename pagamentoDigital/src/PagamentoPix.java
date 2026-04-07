public class PagamentoPix implements MetodoPagamento {
    private String chavePix;

    public PagamentoPix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public boolean validar() {
        IO.println("Validando chave : " + chavePix);
        return true;
    }

    @Override
    public void processar(double valor) {
        IO.println("Pagamento de R$" + valor + " realizado via Pix. ");
    }
}


