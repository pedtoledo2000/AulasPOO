import java.util.Scanner;

public class loop {

    public static void main ( String[] args) {
        for (int i = 0; i < 1; i++) {
           System.out.println("O valor de i é: " + i);
        }
        System.out.println("Isso foi um teste de loop");
        System.out.println();
        System.out.print("Agora isso é um teste de while so quando acertar a senha ira sair do programa");
        Scanner scanner = new  Scanner (System.in);
        String senha="Fatec@2026";
        String tentativa="";
        while (!tentativa.equals(senha)){
            System.out.println("Digite a senha");
            tentativa = scanner.nextLine();
            if (!tentativa.equals(senha)) {
                System.out.println("(Senha incorreta, tente novamente.)");
            }
        }
        System.out.println("Senha correta! Acesso concedido");
        scanner.close();
    }
}
