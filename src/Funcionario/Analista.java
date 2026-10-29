package Funcionario;

public class Analista extends Funcionario implements Funcionarios{

    private String formacao;

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public Analista(String nome, int id, String formacao) {
        super(nome, id);
        this.formacao = formacao;
    }


    
    
}
