class ContaPoupança extends Conta {
    public ContaPoupança(String numero, String agencia, String titular, double saldo) {
        super(numero, agencia, titular, saldo);
    }

    @Override
    public void calcularTarifaMensal() {
        IO.println("Conta Poupança isenta de tarifa.");
    }
}