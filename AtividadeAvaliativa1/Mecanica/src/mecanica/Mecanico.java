public class Mecanico {
    private String nome;
    private String cpf;
    private String especialidade;
    private String telefone;
    private boolean vinculadoABox;

    public Mecanico(String nome, String cpf, String especialidade, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.especialidade = especialidade;
        this.telefone = telefone;
        this.vinculadoABox = false;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public boolean isVinculadoABox() {
        return vinculadoABox;
    }

    public void setVinculadoABox(boolean vinculadoABox) {
        this.vinculadoABox = vinculadoABox;
    }
}