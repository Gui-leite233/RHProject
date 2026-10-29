package Funcionario;

public class Assistente extends Funcionario implements Funcionarios{
    // # O diferencial é opcional
    String diferencial;
    
    public String getDiferencial() {
        return diferencial;
    }

    public void setDiferencial(String diferencial) {
        this.diferencial = diferencial;
    }

    public Assistente(String nome, int id) {
        super(nome, id);
    }

    public Assistente(String nome, int id, String diferencial) {
        super(nome, id);
        this.diferencial = diferencial;
    }

    
    
}
