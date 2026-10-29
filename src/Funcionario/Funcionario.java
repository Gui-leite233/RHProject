package Funcionario;

import java.util.Random;

public class Funcionario{
    private Random r = new Random();
    private int id = r.nextInt(1000);
    private String nome;

    public Funcionario(String nome, int id) {
        this.id = id;
        this.nome = nome;
    }

    // ! Apenas para chamar "adicionarFuncionario"
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


    public void adicionarFuncionario(TipoFunc tipo){
        
    }
}
