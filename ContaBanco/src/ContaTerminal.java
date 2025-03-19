import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args)  {
        // Criando um Scanner para entrada de dados;
        Scanner scanner = new Scanner(System.in);

        // Solicitando e capturando os dados do usuário, e embaixo criando variaveis para armazenar o conteudo;
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o número da agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Digite o número da conta: ");
        int numero = scanner.nextInt();

        // IF para caso as informações da conta forem correspondente a da conta destinada;

        if(nome.equalsIgnoreCase("PEDRO") && agencia.equals("1234") && numero == 100){

            System.out.println("\nBem-vindo, Pedro! Sua conta foi criada com sucesso.");
            System.out.println("Sua agência é " + agencia + ", conta " + numero + " e seu saldo R$1500.00 já esta disponivel !");

        } else{
            System.out.println("\nOs dados informados não correspondem aos esperados.");
        }

        // Quanto de saldo disponivel tem na conta;
        double saldo = 1500;

        // Perguntando quanto quer sacar
        System.out.print("Quanto você quer sacar ?: ");
        int valorSolicitado = scanner.nextInt();

        // Se o valorsolicitado e menor ou igual do que o saldo;
        if(valorSolicitado <= saldo){

            saldo -= valorSolicitado;
            System.out.println("Saque realizado com sucesso. Seu saldo ficou: R$" + saldo);
            
        // Caso não for;
        }else{

            System.out.println("Seu Saldo não esta disponivel !!");
        }


        // Fechando o Scanner;
        scanner.close();
    }
}

