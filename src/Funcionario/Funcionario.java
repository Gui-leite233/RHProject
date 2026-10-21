package Funcionario;
public class Funcionario{
    private int id;
    private String nome;

    public Funcionario(String nome, int id) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
}
