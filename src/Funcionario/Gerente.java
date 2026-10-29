package Funcionario;

public class Gerente extends Funcionario{
    String filial;

    public String getFilial() {
        return filial;
    }

    public void setFilial(String filial) {
        this.filial = filial;
    }
    
    public Gerente(String nome, int id, String filial) {
        super(nome, id);
        this.filial = filial;
    }
    
}
