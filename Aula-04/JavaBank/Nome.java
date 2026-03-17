public class Nome {

    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria();
        Cartao cartao = new Cartao();

        conta1.cpf = "48388038851";
        conta1.Nome = "Pedro Toledo";
        conta1.numeroConta = 654797812;
        conta1.agencia = 12;
        conta1.saldo = 4582164.26;
        conta1.ehPoupanca = true;

        cartao.nomeCliente = "Pedro";
        cartao.statusCartao = true;

        conta1.statusConta();
        cartao.statusCartao();
    }
}