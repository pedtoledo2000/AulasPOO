

public class Cartao {

    public double numeroCartao;
    public int numeroSeguranca;
    public String nomeCliente;
    public String bandeiraCartao;
    public boolean statusCartao;

    public void statusCartao() {
        if (statusCartao == true) {
            System.out.println("\nCartao " + this.nomeCliente + " desbloqueado");
        } else {
            System.out.println("\nCartao " + this.nomeCliente + " bloqueado");
        }
    }
}