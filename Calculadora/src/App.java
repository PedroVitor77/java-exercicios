
/*
 * O programa deve solicitar ao usuário que insira dois números.
*Em seguida, o programa deve perguntar ao usuário qual operação ele deseja realizar (adição, subtração, multiplicação ou divisão).
*Após receber a entrada do usuário, o programa deve realizar a operação escolhida e exibir o resultado.
*Se o usuário tentar dividir por zero, o programa deve exibir uma mensagem de erro apropriada e solicitar que o usuário insira um divisor diferente.
*O programa deve continuar executando até que o usuário escolha sair.
 */

import java.util.Scanner;
public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Boolean sair = false;
        // O programa deve solicitar ao usuário que insira dois números.
        while (!sair) {
            System.out.println("****Bem vindo a calculadora****");
            System.out.println();

            System.out.println("Escolha a operação:");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Sair");
            int opcao = sc.nextInt();

            System.out.print("Digite o primeiro numero: ");
            double num1 = sc.nextDouble();
            System.out.print("Digite o segundo numero: ");
            double num2 = sc.nextDouble();
            // Em seguida, o programa deve perguntar ao usuário qual operação ele deseja
            // realizar (adição, subtração, multiplicação ou divisão).

            double resultado;

            switch (opcao) {
                case 1:
                    resultado = num1 + num2;
                    System.out.println("O resultado é: " + resultado);
                    break;
                case 2:
                    resultado = num1 - num2;
                    System.out.println("O resultado é: " + resultado);

                    break;
                case 3:
                    resultado = num1 * num2;
                    System.out.println("O resultado é: " + resultado);

                    break;
                case 4:
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("O resultado é: " + resultado);

                    } else {
                        System.out.println("Erro Divisao por zero");
                        continue;
                    }
                case 5:
                    sair = true;
                    System.out.println("Saindo do Programa ate mais");

                    break;
                default:
                    System.out.println("Opçao invalida");
                    break;
                    
            }
            
        }

    }
}
