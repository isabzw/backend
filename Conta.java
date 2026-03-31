public abstract class Conta {
    protected String numero;
    protected String agencia;
    protected String titular;
    protected double saldo;

    public Conta() {}

    public Conta(String numero, String agencia, String titular, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.titular = titular;
        this.saldo = saldo;
    }
    public void depositar(double valor) {
        if (valor > 0){
            this.saldo += valor;
            IO.println("Déposito de R$" + valor + " Feito.");
        }
    }
    public void sacar(double valor){
        if (valor > 0 && valor <= this.saldo){
            this.saldo -= valor;
            IO.println("Saldo de R$" + valor + " Feito.");
        } else {
            IO.println("Inválido.");
        }
    }
    public void exibirsaldo(){
        IO.println(String.format("Titular" + titular + "Valor atual" + String.format("%.2f", saldo)));
    }
    public abstract void calcularTarifaMensal();

    public void saldo() {
        IO.println("Seu saldo é: "+ saldo);
    }
}