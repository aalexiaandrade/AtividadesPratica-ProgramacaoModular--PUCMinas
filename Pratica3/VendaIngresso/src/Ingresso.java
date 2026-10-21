
public abstract class Ingresso {
    private int codigo;
    private String nomeEvento;
    private String setor;
    private double valorBase;

    public Ingresso(int codigo, String nomeEvento, String setor, double valorBase) {
        this.codigo = codigo;
        this.nomeEvento = nomeEvento;
        this.setor = setor;
        this.valorBase = valorBase;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public double getValorBase() {
        return valorBase;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }

    public void exibirInformacoes() {
        System.out.println("------ Ingresso ------");
        System.out.println("Código: " + getCodigo());
        System.out.println("Evento: " + getNomeEvento());
        System.out.println("Setor: " + getSetor());
        System.out.printf("Valor base: R$ %.2f%n", getValorBase());
        System.out.printf("Valor final: R$ %.2f%n", calcularValorFinal());
        System.out.println("Benefícios: " + obterBeneficios());
    }

    public abstract double calcularValorFinal();

    public abstract String obterBeneficios();
}
