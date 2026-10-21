import java.util.ArrayList;

public class Agenda {
    ArrayList<Contato> contatos = new ArrayList<>();
    private int contatos_cadastrados = 0;

    public Agenda(ArrayList<Contato> contatos, int contatos_cadastrados) {
        this.contatos = contatos;
        this.contatos_cadastrados = contatos_cadastrados;
    }

    public Agenda(){}

    public ArrayList<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(ArrayList<Contato> contatos) {
        this.contatos = contatos;
    }

    public void getContatos_cadastrados() {
        System.out.println("Total de contatos cadastrados: "+ this.contatos_cadastrados);
    }

    public void setContatos_cadastrados(int contatos_cadastrados) {
        this.contatos_cadastrados = contatos_cadastrados;
    }

    public void adicionarContatos(Contato contato){
        contatos.add(contato);
        setContatos_cadastrados(contatos_cadastrados + 1);
        System.out.println("Contato adicionado com sucesso!");
    }

    public void excluirContatos(String nome){
        for (int i = 0; i < contatos.size(); i++){
            if(contatos.get(i).getNome().equalsIgnoreCase(nome)){
                contatos.remove(contatos.get(i));
                setContatos_cadastrados(contatos_cadastrados - 1);
                System.out.println("Contato excluido com sucesso.");
                break;
            }
            System.out.println("Contato não localizado.");
        }
    }

    public void buscarContatoNome(String nome) {
        for (int i = 0; i < contatos.size(); i++) {
            if (contatos.get(i).getNome().equalsIgnoreCase(nome)) {
                contatos.get(i).exibirDados();
                break;
            }
            System.out.println("Contato não localizado.");
        }
    }

    public void buscarContatoEmail(String email) {
        for (int i = 0; i < contatos.size(); i++) {
            if (contatos.get(i).getEmail().equalsIgnoreCase(email)) {
                contatos.get(i).exibirDados();
                break;
            }
            System.out.println("Contato não localizado.");
        }
    }

    public void buscarContatoTelefone(String telefone) {
        for (int i = 0; i < contatos.size(); i++) {
            if (contatos.get(i).getTelefone().equalsIgnoreCase(telefone)) {
                contatos.get(i).exibirDados();
                break;
            }
            break;
        }
        System.out.println("Contato não localizado.");
    }
}
