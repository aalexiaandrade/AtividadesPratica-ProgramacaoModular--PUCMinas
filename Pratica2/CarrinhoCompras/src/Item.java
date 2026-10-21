public class Item {
    private Produto produto;
    private int quantidade;
    private double valor_total;

    public Item(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.valor_total = calcularValorTotal();
    }
    public Item(){

    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
        this.valor_total = calcularValorTotal();
    }

    public double getValor_total() {
        return valor_total;
    }

    public void setValor_total(double valor_total) {
        this.valor_total = valor_total;
    }

    public double calcularValorTotal(){
        return this.quantidade * produto.getPreco();
    }
}
