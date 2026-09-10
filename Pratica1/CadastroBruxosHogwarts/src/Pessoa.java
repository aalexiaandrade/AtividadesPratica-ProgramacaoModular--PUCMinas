import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private String usuario;
    private LocalDate data_nascimento;
    private int idade;
    private String maioridade;
    private int coragem;
    private int inteligencia;
    private int ambicao;
    private int lealdade;
    private int estrategia;
    private int criativade;
    private String casa;
    private String cod_matricula;

    public Pessoa(String nome, String sobrenome, LocalDate data_nascimento, int coragem, int inteligencia, int ambicao, int lealdade, int estrategia, int criativade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.data_nascimento = data_nascimento;
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

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getMaioridade() {
        return maioridade;
    }

    public void setMaioridade(String maioridade) {
        this.maioridade = maioridade;
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

    public LocalDate getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(LocalDate data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getCod_matricula() {
        return cod_matricula;
    }

    public void setCod_matricula(String cod_matricula) {
        this.cod_matricula = cod_matricula;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void calcularIdade(){
        LocalDate data = LocalDate.now();
        Period periodo = Period.between(getData_nascimento(), data);
        setIdade(periodo.getYears());
        maioridade(getIdade());
    }

    public void maioridade(int idade){
        if(idade >= 17){
            setMaioridade("Sim");
        }
        else{
            setMaioridade("Não");
        }
    }

    public void gerarNomeUsuario(){
        Character primeiraLetra = getNome().toLowerCase().charAt(0);
        String sobrenomeMinu = getSobrenome().toLowerCase();
        String nomUsu = primeiraLetra + sobrenomeMinu;
        setUsuario(nomUsu);
    }


    public void gerarCodigoMatricula(int index) {
        String primeiraLetraNome = String.valueOf(getNome().charAt(0)).toUpperCase();
        String primeiraLetraSobrenome = String.valueOf(getSobrenome().charAt(0)).toUpperCase();

        int ano = LocalDate.now().getYear();
        String codMatr = primeiraLetraNome + primeiraLetraSobrenome + "-" + ano + "-" + (index+1);

        setCod_matricula(codMatr);
    }

    public boolean verificarCasa(String casa) {
        if (getCasa() != null && getCasa().equalsIgnoreCase(casa)) {
            System.out.println(getNome() + " " + getSobrenome());
            return true;
        }
        return false;
    }

    public void verificarPalavra(String sobrenome){
        if (sobrenome.equalsIgnoreCase("MALFOY") || (sobrenome.equalsIgnoreCase("BLACK"))){
            System.out.println("\n O sobrenome do aluno é um sobrenome proibido...");
        }
    }

    public void exibirInformacoes(){
        System.out.println("\n|-----------------------------|");
        System.out.println("| Nome: "+ getNome());
        System.out.println("| Usuário: "+ getUsuario());
        System.out.println("| Matrícula: "+ getCod_matricula());
        System.out.println("| Idade: "+ getIdade());
        System.out.println("| Casa: "+ getCasa().toUpperCase());
        System.out.println("|-----------------------------|\n");
    }

    public void calcularCasa() {
        int grifinoria = (2 * getCoragem()) + getLealdade();
        int sonserina = (2 * getAmbicao()) + getEstrategia();
        int corvinal = (2 * getInteligencia()) + getCriativade();
        int lufalufa = (2 * getLealdade()) + getCoragem()/3;

        int maiorPontuacao = grifinoria;
        String casaEscolhida = "Grifinoria";

        if (sonserina > maiorPontuacao) {
            maiorPontuacao = sonserina;
            casaEscolhida = "Sonserina";
        }

        if (corvinal > maiorPontuacao) {
            maiorPontuacao = corvinal;
            casaEscolhida = "Corvinal";
        }

        if (lufalufa > maiorPontuacao) {
            casaEscolhida = "Lufa-Lufa";
        }

        setCasa(casaEscolhida);
    }
}
