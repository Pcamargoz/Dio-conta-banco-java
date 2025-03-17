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
            System.out.println("Sua agência é " + agencia + ", conta " + numero + " e seu saldo R$100.00 já está disponível.");

        } else{
            System.out.println("\nOs dados informados não correspondem aos esperados.");
        }


        // Fechando o Scanner;
        scanner.close();
    }
}

