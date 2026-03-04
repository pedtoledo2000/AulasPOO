import java.util.Random;
import java.util.Scanner;

public class JogoDado {
    public static void main(String[]args){
        Scanner leitor = new Scanner(System.in);
        Random gerador = new Random();
        String comando = "";
        while (!comando.equalsIgnoreCase("fim")) {
             System.out.println("\n Digite J para jogaro dado ou fim para encerrar o jogo");
            comando = leitor.nextLine();
            if(comando.equalsIgnoreCase("j")){
                int resultado=gerador.nextInt(6) + 1; //Aqui esta gerando um numero aleatorio de 1 a 6
                System.out.println("Você rolou o dado e obteve " + resultado);
            }else if (!comando.equalsIgnoreCase("fim")) {
                System.out.println("(Comando invalido, Por favor digite J para jogar ou fim para encerrar)");
            }
            
        }
        System.out.println("Fim de Jogo");
        leitor.close();
    }
}
