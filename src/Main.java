import java.util.Scanner;

public class Main {
    public static void main() {
      Scanner scan = new Scanner(System.in);

      System.out.println("Bem vindo ao RH Project! Selecione uma das funções:");
      System.out.println("1 - Gerenciar Funcionários");
      System.out.println("2 - Gerenciar horas de trabalho");
      System.out.println("0 - Sair");
      int decisao = scan.nextInt();

      switch (decisao) {
        case 1:
          gerenciarFuncionarios();
          break;
        case 2:

          break;
      
        default:
          System.out.println("Até logo!");
          break;
      }

      
        
        

      scan.close();
    }


    public static void gerenciarFuncionarios(){
      Scanner scan = new Scanner(System.in);

      System.out.println("Bem vindo ao gerenciamento de funcionários!! Essas são as suas opções:");
      System.out.println("1 - Adicionar funcionário");
      System.out.println("2 - Remover funcionário");
      System.out.println("0 - Sair");
      int decisao = scan.nextInt();

      switch (decisao) {
        case 1:
          
          break;
        case 2:

          break;
      
        default:
          System.out.println("Até logo!");
          break;
      }

      scan.close();
    }
}