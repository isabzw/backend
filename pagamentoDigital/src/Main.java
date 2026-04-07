public class Main {
    public static void main(String[] args) {
        ProcessadorPagamento processador = new ProcessadorPagamento();

        IO.println("--- Cenário 1: Pagamento via Pix ---");
        processador.selecionarMetodo(new PagamentoPix("isaabsouza@hotmail.com"));
        processador.realizarCobranca(150.00);

        IO.println("--- Cenário 2: Pagamento via Cartão ---");
        processador.selecionarMetodo(new PagamentoCartao("2344-8753-6476-7987"));
        processador.realizarCobranca(850.50);
    }
}