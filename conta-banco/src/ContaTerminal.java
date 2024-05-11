import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Bem vindo, siga as intruções para criação de sua conta no banco.");

        System.out.print("Por favor, insira o seu nome: ");
        String name = sc.nextLine();

        System.out.print("Por favor, digite o número da Conta: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite o número da Agência: ");
        String agency = sc.nextLine();
        
        System.out.print("Insira o saldo que deseja depositar: ");
        double balance = sc.nextDouble();

        System.out.println("Olá " + name + ", obrigado por criar uma conta em nosso banco, sua agência é " + agency + ", conta " + accountNumber + " e seu saldo " + balance + " já está disponível para saque.");
             
        
        sc.close();
    }
}
