import java.util.Scanner;

import Funcionario.*;

public class Main {
    public static void main() throws InterruptedException{
      Scanner scan = new Scanner(System.in);

      System.out.println("Bem vindo ao RH Project! Selecione uma das funções:");
      System.out.println("1 - Gerenciar Funcionários");
      System.out.println("2 - Gerenciar horas de trabalho");
      System.out.println("0 - Sair");
      int decisao = scan.nextInt();

      switch (decisao) {
        case 1:
          gerenciarFuncionarios();
          limpaTerm();
          break;
        case 2:

          break;
      
        default:
          System.out.println("Até logo!");
          break;
      }

      
        
        

      scan.close();
    }


    public static void gerenciarFuncionarios() throws InterruptedException{
      limpaTerm();
      Scanner scan = new Scanner(System.in);

      System.out.println("Bem vindo ao gerenciamento de funcionários!! Essas são as suas opções:");
      System.out.println("1 - Adicionar funcionário");
      System.out.println("2 - Remover funcionário");
      System.out.println("0 - Sair");
      int decisao = scan.nextInt();
      Funcionario funcionario = new Funcionario();

      switch (decisao) {
        case 1:
          limpaTerm();
          System.out.println("Qual o tipo de funcionário?");
          System.out.println("1 - Gerente");
          System.out.println("2 - Coordenador");
          System.out.println("3 - Analista");
          System.out.println("4 - Assistente");
          System.out.println("5 - Estagiário");
          int tipoFunc = scan.nextInt();
          TipoFunc tipo = TipoFunc.deCodigo(tipoFunc);
          funcionario.adicionarFuncionario(tipo);

          break;
        case 2:

          break;
      
        default:
          System.out.println("Até logo!");
          break;
      }

      scan.close();
    }
      // * Método para limpar o terminal
     public static void limpaTerm() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }


    

    
}