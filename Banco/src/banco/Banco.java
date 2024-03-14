package banco;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author walis
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner pergunta = new Scanner(System.in);
        ArrayList lista = new ArrayList();
        int numConta = 0;
        do{
            
            //OPÇÕES:
            System.out.println("=========================================");
            System.out.println("Digite um número para executar uma ação:");
            System.out.println("[1] Criar uma nova conta;");
            System.out.println("[2] Visualizar o saldo atual;");
            System.out.println("[3] Saque;");
            System.out.println("[4] Depositar;");
            System.out.println("Digite qualquer outro valor para sair.");
            System.out.println("=========================================");
            int opcao = pergunta.nextInt();
            switch (opcao){
                case 1:
                    numConta += 1;
                    System.out.print("Digite seu nome: ");
                    String nome = pergunta.next();
                    System.out.print("Qual será o saldo inicial da conta? ");
                    double saldoInicial = pergunta.nextDouble();
                    Conta c = new Conta(numConta, nome, saldoInicial);
                    lista.add(c);
                    System.out.println("O numero da sua conta é: " + c.getNumero());
                    break;

                case 2:
                    System.out.println("Qual é o número da sua conta? ");
                    int numeroConta = pergunta.nextInt(); 
                    Iterator percorre2 = lista.iterator();
                    while (percorre2.hasNext()){
                        Conta verificaConta2 = (Conta) percorre2.next();
                        if (numeroConta == verificaConta2.getNumero()){
                            System.out.println("O seu saldo é de: " + verificaConta2.getSaldo());
                        } //FIM DO LAÇO IF (DENTRO DO CASE 2)
                    } // FIM DO LAÇO WHILE (DENTRO DO CASE 2)
                    break;
                    
                case 3:
                    System.out.print("Qual é o número da sua conta? ");
                    int numeroConta3 = pergunta.nextInt();
                    System.out.print("Quanto você deseja sacar? ");
                    double quantiaSaque = pergunta.nextInt();
                    Iterator percorre3 = lista.iterator();
                    while (percorre3.hasNext()){
                        Conta verificaConta3 = (Conta) percorre3.next();
                        if (numeroConta3 == verificaConta3.getNumero()){
                            if (verificaConta3.sacar(quantiaSaque) == true){
                                System.out.println("Saque efetuado com sucesso");
                            } else{
                                System.out.println("Saque não efetuado");
                            } //fim do if else da operação de saque
                        } //FIM DO LAÇO IF (DENTRO DO CASE 3)
                    } // FIM DO LAÇO WHILE (DENTRO DO CASE 3)
                    break;

                case 4: //funcionando!!
                    System.out.print("Qual é o número da sua conta? ");
                    int numeroConta4 = pergunta.nextInt();
                    System.out.print("Quanto você deseja depositar? ");
                    int quantiaDeposito = pergunta.nextInt();
                    Iterator percorre4 = lista.iterator();
                    while (percorre4.hasNext()){
                        Conta verificaConta4 = (Conta) percorre4.next();
                        if (numeroConta4 == verificaConta4.getNumero()){
                            verificaConta4.depositar(quantiaDeposito);
                            System.out.println("Saldo atual: " + verificaConta4.getSaldo());
                        } //FIM DO LAÇO IF (DENTRO DO CASE 4)
                    } // FIM DO LAÇO WHILE (DENTRO DO CASE 4)
                    break;

                default:
                    System.out.println("Fim da execução do programa, obrigado por nossa agência!");
                    System.exit(0);
                } //Fim do Swith
        } while(true); //Fim do laço "do while"
    }
    
}
