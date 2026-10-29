package Funcionario;

public class Coordenador extends Funcionario implements Funcionarios{

    String setor;
    
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Coordenador(String nome, int id, String setor) {
        super(nome, id);
        this.setor = setor;
    }
    
}
