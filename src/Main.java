import java.util.Scanner;

public class Main {
    public static final String ERRO_PADRAO = "Opcao não identificada, por favor digite novamente";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Cliente clienteBruno = new Cliente("Bruno", "000.000.000-00", "0000000000000");
        Conta contaBruno = new Conta("12345-6", "111111111 ", clienteBruno );
        int entrada;
        while (true){
            System.out.println("-----------------------");
            System.out.println("Bem vindo ao Banco "+clienteBruno.getNome()+"!!!");
            System.out.println("Conta: "+contaBruno.getNumeroConta()+"Agencia:"+ contaBruno.getAgencia());
            System.out.println("1 - Mostrar saldo");
            System.out.println("2 - Sacar valor");
            System.out.println("3 - Depositar valor");
            System.out.println("4 - Finalizar operacao");
            System.out.println("-----------------------");
            try{
                entrada = sc.nextInt();
                switch (entrada){
                    case 1:
                        System.out.println("-----------------------");
                        System.out.println("Saldo atual: "+contaBruno.getSaldo());
                        break;
                    case 2:
                        if(contaBruno.getSaldo()>=10){
                            System.out.println("-----------------------");
                            System.out.println("Sacar no valor de 10 ");
                            contaBruno.setSaldo(contaBruno.getSaldo()-10);
                        }
                        else {
                            System.out.println("-----------------------");
                            System.out.println("Não é possivel sacar");
                        }
                        break;
                    case 3:
                        System.out.println("-----------------------");
                        System.out.println("Deposito valor de 10");
                        contaBruno.setSaldo(contaBruno.getSaldo()+10);
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println(ERRO_PADRAO);
                        break;
                }
            }catch (Exception e){
                System.out.println(ERRO_PADRAO);
            }

        }

    }
}