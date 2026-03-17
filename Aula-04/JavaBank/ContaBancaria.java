

public class ContaBancaria {

    public String cpf;
    public String Nome;
    public int numeroConta;
    public int agencia;
    public double saldo;
    public boolean ehPoupanca;

    public void statusConta() {
        System.out.println("----Status JavaBank----");
        System.out.println("Cpf: " + this.cpf);
        System.out.println("Nome: " + this.Nome);
        System.out.println("Numero Conta: " + this.numeroConta);
        System.out.println("Agencia: " + this.agencia);
        System.out.println("Saldo: " + this.saldo);

        if (this.ehPoupanca) {
            System.out.println("Tipo de conta: Poupança");
        } else {
            System.out.println("Tipo de conta: Corrente");
        }
    }
}