class PessoaJuridica extends Conta {
    public PessoaJuridica(String numero, String agencia, String titular, double saldo) {
        super(numero, agencia, titular, saldo);
    }
    @Override
    public void sacar(double valor){
        double taxaSaque = 1.50;
        if (valor > 0 && (valor + taxaSaque) <= this.saldo){
            this.saldo -= (valor + taxaSaque);
            IO.println("Saque de R$ " + valor + " feito (Taxa de R$ 1.50)." );
        } else{
            IO.println("Saldo insuficiente para o saque e a taxa.");
        }
    }
    @Override
    public void calcularTarifaMensal(){
        this.saldo -= 20.00;
        IO.println("Taria mensal de R$ 20,00 aplicada à Conta PJ.");
    }
}
