public class Produto {
    private String nome;
    private int codigo;
    private double preco;
    private int quantidadeEstoque; // Atributo solicitado

    public Produto(String nome, int codigo, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getCodigo() { return codigo; }
    public void setCodigo(int codigo) { this.codigo = codigo; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }

    public int getQuantidadeEstoque() { return quantidadeEstoque; }

    // Adiciona quantidade ao estoque existente
    public void adicionarEstoque(int quantidade) {
        this.quantidadeEstoque += quantidade;
    }

    // Retira quantidade do estoque se houver saldo suficiente[cite: 2]
    public boolean retirarEstoque(int quantidade) {
        if (this.quantidadeEstoque >= quantidade) {
            this.quantidadeEstoque -= quantidade;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + " | Nome: " + nome + " | Preço: R$ " + preco + " | Estoque: " + quantidadeEstoque;
    }
}