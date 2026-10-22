public class PedidoAlimento extends Pedido{
    private double valorTotal;
    private double frete = 5;

    public PedidoAlimento(int id, String nomeCliente, double valor, StatusPedido status, Categoria categoria) {
        super(id, nomeCliente, valor, status, categoria);
    }

    public double getFrete() {
        return frete;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }

    @Override
    public double calcularValorTotal() {
        valorTotal = getValor() + frete;
        return valorTotal;
    }
}
