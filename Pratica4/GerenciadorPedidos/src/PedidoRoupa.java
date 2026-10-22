public class PedidoRoupa extends Pedido implements Entregavel{
    private double valorTotal;
    private double frete;

    public PedidoRoupa(int id, String nomeCliente, double valor, StatusPedido status, Categoria categoria) {
        super(id, nomeCliente, valor, status, categoria);
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getFrete() {
        return frete;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }

    @Override
    public double calcularValorTotal() {
        if(getValor() > 200){
            valorTotal = getValor() * 0.20;
        }
        else{
            valorTotal = getValor();
        }
        return valorTotal;
    }

    @Override
    public double calcularFrete(){
        frete = 10 + (getValor()*0.05);
        return frete;
    }
}
