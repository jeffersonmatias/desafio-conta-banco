import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int number = 0;
        String agency = "";
        String clientName = "";
        double balance = 0;

        boolean inputValido = false;

        while (!inputValido) {
            try {
                System.out.println("Por favor, digite o número da Conta");
                number = scanner.nextInt();
                scanner.nextLine();
                inputValido = true;
            } catch (InputMismatchException e) {
                System.out.println("Erro: Por favor, digite um número válido para a conta.");
                scanner.nextLine();
            }
        }

        inputValido = false;


        while (!inputValido) {
            System.out.println("Por favor, digite o número da Agência !");
            agency = scanner.nextLine();
            if (!agency.trim().isEmpty()) {
                inputValido = true;
            } else {
                System.out.println("Erro: Por favor, digite um número de agência válido.");
            }
        }

        inputValido = false;

        while (!inputValido) {
            System.out.println("Por favor, digite seu nome !");
            clientName = scanner.nextLine();
            if (!clientName.trim().isEmpty()) {
                inputValido = true;
            } else {
                System.out.println("Erro: Por favor, digite um nome válido.");
            }
        }

        inputValido = false;

        while (!inputValido) {
            try {
                System.out.println("Por favor, digite seu saldo !");
                balance = scanner.nextDouble();
                inputValido = true;
            } catch (InputMismatchException e) {
                System.out.println("Erro: Por favor, digite um valor numérico válido para o saldo.");
                scanner.nextLine();
            }
        }


        System.out.println("Olá " + clientName + ", obrigado por criar uma conta em nosso banco !");
        System.out.println("sua agência é: " + agency);
        System.out.println("conta: " + number);
        System.out.println("e seu saldo: " + balance + " já está disponível para saque !");
    }
}
