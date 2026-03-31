class ContaCorrente extends Conta{
    public ContaCorrente(String numero, String agencia, String titular, double saldo){
        super(numero, agencia, titular, saldo);
    }
    @Override
    public void calcularTarifaMensal(){
        this.saldo -= 12.00 ;
        IO.println("Tarifa aplicada à Conta Corrente.");
    }
}
