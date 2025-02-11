import java.util.Scanner;

public class CashMachine {
    Scanner s = new Scanner(System.in);

    private Double saldo = 1580.69;
    private Double saque;
    private Double deposito;
    private String options = "";
    private String operation = "";

    public void boxEletronic() {
        System.out.print("Você deseja reslizar uma operação bancaria? ");
        operation = s.next();

        while (operation.equalsIgnoreCase("sim")) {
            System.out.println("Escolha uma das opções: ");
            System.out.println(" ");

            System.out.println("Digite 1 para saque: ");
            System.out.println("Digite 2 para deposito: ");
            System.out.println("Digite 3 para saldo: ");

            options = s.next();


            if(options.equals("1")){
                System.out.print("Informe o valor que deseja sacar: ");
                saque = s.nextDouble();
                System.out.print("Informe o valor que deseja sacar: ");
                saldo = saldo - saque;

                System.out.println("Processando seu saque...");
            }
            else if(options.equals("2")) {
                System.out.print("Informe o valor que deseja depositar: ");
                deposito = s.nextDouble();
                saldo = saldo + deposito;

                System.out.println("Deposito realizado com sucesso.");
            }
            else if(options.equals("3")){
                System.out.println("Seu saldo atual: " + saldo);
            }

            System.out.print("Você deseja reslizar uma nova operação bancaria? ");
            operation = s.next();
        };

        System.out.println("Operacao Finalizada");

    }

}
