public class Main {
    public static void main(String[] args) {
        IO.println("--- SISTEMA BANCÁRIO ---\n");

        Conta cc = new ContaCorrente("123-X", "001", "Ana Silva", 1000.00);
        Conta cp = new ContaPoupança("456-Y", "001", "Bruno Souza", 500.00);
        Conta pj = new PessoaJuridica("789-Z", "002", "Tech Solutions LTDA", 2000.00);


        cc.saldo();
        cc.sacar(100);
        cc.calcularTarifaMensal();


        IO.println("\n------------------------\n");

        cp.saldo();
        cp.depositar(200);
        cp.calcularTarifaMensal();


        IO.println("\n------------------------\n");

        pj.saldo();
        pj.sacar(500);
        pj.calcularTarifaMensal();

    }
}