package Funcionario;

import java.util.MissingFormatArgumentException;
import java.util.Random;
import java.util.Scanner;

public class Funcionario{
    private Random r = new Random();
    private int id = r.nextInt(1000);
    private String nome;

    public Funcionario(String nome, int id) {
        this.id = id;
        this.nome = nome;
    }

    // * Apenas para chamada de métodos
    public Funcionario() {}

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }


    public void adicionarFuncionario(TipoFunc tipo) throws MissingFormatArgumentException, IllegalArgumentException{
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Qual o nome do Funcionário que quer adicionar?");
        String nome = scanner.nextLine();        
        
        switch (tipo) {
            case GERENTE:
                System.out.println("Responda: Qual filial é gerenciada pelo cadastrado?");
                String filial = scanner.nextLine();
                Gerente gerente = new Gerente(nome, id, filial);
                break;
            case COORDENADOR:
                System.out.println("Responda: De qual setor é este coordenador?");
                String setor = scanner.nextLine();
                Coordenador coordenador = new Coordenador(nome, id, setor);
                break;
            case ANALISTA:
                System.out.println("Responda: Qual a formação deste Analista?");
                String formacao = scanner.nextLine();
                Analista analista = new Analista(nome, id, formacao);
                break;
            case ASSISTENTE:
                System.out.println("Quer definir um diferencial para o assistente? [1] para SIM e [0] para NÃO");
                int decisao = scanner.nextInt();

                if (decisao == 1) {
                    System.out.println("Responda: Qual o diferencial do Assistente?");
                    String diferencial = scanner.nextLine();
                    Assistente assistente = new Assistente(nome, decisao, diferencial);
                } else {
                    Assistente assistente = new Assistente(nome, id);
                }

                break;
            case ESTAGIARIO:
                System.out.println("Responda: Qual o curso do estagiário?");
                String curso = scanner.nextLine();
                Estagiario estagiario = new Estagiario(nome, id, curso);

            default:
                throw new IllegalArgumentException("Não existe o tipo de funcionário escolhido!");
                
            
        }

        scanner.close();
    }
}
