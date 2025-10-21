import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o Nome do dono da conta:");
        String nome = leitura.nextLine();
        System.out.println("Digite o Tipo da conta: Corrente ou Poupança");
        String tipoConta = leitura.nextLine();
        System.out.println("Digite o valor inicial da sua conta");
        Double saldo = leitura.nextDouble();
        System.out.println("***********************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: R$" + saldo);
        System.out.println("\n***********************");
        int opcao = 0;
        boolean variaveis = true;

        String menu = """
        ** Digite sua opção **
        1 - Consultar saldo
        2 - Transferir valor
        3 - Receber valor 
        4 - Sair
        """;
       
        while(variaveis){
            System.out.println(menu);
            opcao = leitura.nextInt();
            if(opcao == 1){
                System.out.println("Saldo atual: R$" + saldo);
            }else if(opcao == 2){
                System.out.println("Digite o CPF pra quem você quer transferir");
                leitura.nextLine(); // consome a quebra de linha pendente
                String cpf = leitura.nextLine();
                System.out.println("Esse é o CPF pra quem você vai transferir " + cpf);
                System.out.println("Saldo atual: R$" + saldo);
                System.out.println("Digite o valor que você quer transferir");
                Double transferencia = leitura.nextDouble();
                saldo = saldo - transferencia;
                System.out.println("Saldo atual: R$" + saldo);
            }else if(opcao == 3){
                System.out.println("Digite o valor que você quer receber");
                Double transferencia = leitura.nextDouble();
                saldo = saldo + transferencia;
                System.out.println("Saldo atual: R$" + saldo);
            }else{
                System.out.println("Operações finalizadas");
                variaveis = false;
            }
        }
    }
}
