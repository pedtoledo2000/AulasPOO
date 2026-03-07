import java.util.Scanner;

public class CalculadoraBasica {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String comando = "";

        while (!comando.equalsIgnoreCase("fim")) {
            System.out.println("\n--- MENU DE OPERAÇÕES ---");
            System.out.println("Digite + para Somar");
            System.out.println("Digite - para Subtrair");
            System.out.println("Digite * para Multiplicar");
            System.out.println("Digite / para Dividir");
            System.out.println("Digite 'fim' para encerrar");
            
            System.out.print("Escolha uma opção: ");
            comando = leitor.nextLine();

            // Verificamos se o comando é uma das operações antes de pedir os números
            if (comando.equals("+") || comando.equals("-") || comando.equals("*") || comando.equals("/")) {
                
                System.out.print("Digite o primeiro número: ");
                double num1 = Double.parseDouble(leitor.nextLine());
                System.out.print("Digite o segundo número: ");
                double num2 = Double.parseDouble(leitor.nextLine());

                if (comando.equals("+")) {
                    System.out.println("Resultado: " + (num1 + num2));
                } else if (comando.equals("-")) {
                    System.out.println("Resultado: " + (num1 - num2));
                } else if (comando.equals("*")) {
                    System.out.println("Resultado: " + (num1 * num2));
                } else if (comando.equals("/")) {
                    if (num2 != 0) {
                        System.out.println("Resultado: " + (num1 / num2));
                    } else {
                        System.out.println("Erro: Divisão por zero não permitida!");
                    }
                }
            } else if (!comando.equalsIgnoreCase("fim")) {
                System.out.println("Comando inválido! Tente novamente.");
            }
        }

        System.out.println("Programa encerrado. Até logo!");
        leitor.close();
    }
}
//Crie um programa que faça 4 operações matematica basicas (soma subtração, multiplicação e divisão) usando um meny de ioções para o usuario escolher a operações até que o usuario escolha encerrar o programa e digite "fim"