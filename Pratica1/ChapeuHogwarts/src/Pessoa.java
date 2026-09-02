public class Pessoa {
    private String nome;
    private int idade;
    private int coragem;
    private int inteligencia;
    private int ambicao;
    private int lealdade;
    private int estrategia;
    private int criativade;
    private String casa;

    public Pessoa(String nome, int idade, int coragem, int inteligencia, int ambicao, int lealdade, int estrategia, int criativade) {
        this.nome = nome;
        this.idade = idade;
        this.coragem = coragem;
        this.inteligencia = inteligencia;
        this.ambicao = ambicao;
        this.lealdade = lealdade;
        this.estrategia = estrategia;
        this.criativade = criativade;
    }
    public Pessoa(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getCoragem() {
        return coragem;
    }

    public void setCoragem(int coragem) {
        this.coragem = coragem;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getAmbicao() {
        return ambicao;
    }

    public void setAmbicao(int ambicao) {
        this.ambicao = ambicao;
    }

    public int getLealdade() {
        return lealdade;
    }

    public void setLealdade(int lealdade) {
        this.lealdade = lealdade;
    }

    public int getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(int estrategia) {
        this.estrategia = estrategia;
    }

    public int getCriativade() {
        return criativade;
    }

    public void setCriativade(int criativade) {
        this.criativade = criativade;
    }

    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }

    public void exibirInformacoes(){
        System.out.println("\n|-----------------------------|");
        System.out.println("| Nome: "+ getNome());
        System.out.println("| Idade: "+ getIdade());
        System.out.println("| Casa: "+ getCasa());
        System.out.println("|-----------------------------|\n");
    }

    public void calcularCasa(){
        int grifinoria = (2*getCoragem())+getLealdade();
        int sonserina = (2*getAmbicao())+getEstrategia();
        int corvinal = (2*getInteligencia())+getCriativade();
        int lufalufa = ((2*getLealdade())+getCoragem())/3;

        if((grifinoria>=sonserina) && (grifinoria>=corvinal) && (grifinoria>=lufalufa)){
            setCasa("Grifinoria");
        }
        if((sonserina>=grifinoria) && (sonserina>=corvinal) && (sonserina>=lufalufa)){
            setCasa("Sonserina");
        }
        if((corvinal>=grifinoria) && (corvinal>=sonserina) && (corvinal>=lufalufa)){
            setCasa("Corvinal");
        }
        if((lufalufa>=grifinoria) && (lufalufa>=sonserina) && (lufalufa>=corvinal)){
            setCasa("Lufa Lufa");
        }
    }
}
