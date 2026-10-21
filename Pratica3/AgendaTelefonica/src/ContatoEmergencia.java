public class ContatoEmergencia extends Contato{
    private int grau_prioridade;
    private String observacao;

    public ContatoEmergencia(String nome, String email, String telefone, int grau_prioridade, String observacao) {
        super(nome, email, telefone);
        this.grau_prioridade = grau_prioridade;
        this.observacao = observacao;
    }

    public int getGrau_prioridade() {
        return grau_prioridade;
    }

    public void setGrau_prioridade(int grau_prioridade) {
        this.grau_prioridade = grau_prioridade;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}
