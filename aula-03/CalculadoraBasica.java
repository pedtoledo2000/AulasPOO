import java.util.Scanner;

public class CalculadoraBasica {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String comando = "";
// menu somente so para mostrar para o usuario
        while (!comando.equalsIgnoreCase("fim")) {
            System.out.println("\n--- MENU DE OPERAÇÕES ---");
            System.out.println("Digite + para Somar");
            System.out.println("Digite - para Subtrair");
            System.out.println("Digite * para Multiplicar");
            System.out.println("Digite / para Dividir");
            System.out.println("Digite 'fim' para encerrar");
            
            System.out.print("Escolha uma opção: ");
            comando = leitor.nextLine();

            // verificar qual é o comando e oque ele quer
        
            if (comando.equals("+") || comando.equals("-") || comando.equals("*") || comando.equals("/")) {
                

                System.out.print("Digite o primeiro número: ");
                double num1 = Double.parseDouble(leitor.nextLine());
                System.out.print("Digite o segundo número: ");
                double num2 = Double.parseDouble(leitor.nextLine());

                // if para saber qual equação usar 

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
                        // divisão por zero não tem jeito
                    }
                }
                // caso ele coloque algo que não esta esperando 
            } else if (!comando.equalsIgnoreCase("fim")) {
                System.out.println("Comando inválido! Tente novamente.");
            }
        }

        System.out.println("Programa encerrado. Até logo!");
        leitor.close();
    }
}
//Crie um programa que faça 4 operações matematica basicas (soma subtração, multiplicação e divisão) usando um meny de ioções para o usuario escolher a operações até que o usuario escolha encerrar o programa e digite "fim"