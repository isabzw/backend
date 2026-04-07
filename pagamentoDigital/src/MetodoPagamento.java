public interface MetodoPagamento {
    boolean validar();
    void processar(double valor);
}

