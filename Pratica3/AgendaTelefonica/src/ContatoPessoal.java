public class ContatoPessoal extends Contato{
    private String dataAniver;
    private String parentesco;

    public ContatoPessoal(String nome, String email, String telefone, String dataAniver, String parentesco) {
        super(nome, email, telefone);
        this.dataAniver = dataAniver;
        this.parentesco = parentesco;
    }

    public String getDataAniver() {
        return dataAniver;
    }

    public void setDataAniver(String dataAniver) {
        this.dataAniver = dataAniver;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }
}
