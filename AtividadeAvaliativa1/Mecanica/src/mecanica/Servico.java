public class Servico {
    private String nome;
    private int tempoEstimadoMinutos;
    private double valor;
    private String categoria;

    public Servico(String nome, int tempoEstimadoMinutos, double valor, String categoria) {
        this.nome = nome;
        this.tempoEstimadoMinutos = tempoEstimadoMinutos;
        this.valor = valor;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public int getTempoEstimadoMinutos() {
        return tempoEstimadoMinutos;
    }

    public double getValor() {
        return valor;
    }

    public String getCategoria() {
        return categoria;
    }
}