public class PedidoEletronico extends Pedido implements Entregavel{
    private double valorTotal;
    private double frete;

    public PedidoEletronico(int id, String nomeCliente, double valor, StatusPedido status, Categoria categoria) {
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
        if(getValor() > 100){
            valorTotal = getValor()*0.10;
        }
        else{
            valorTotal = getValor();
        }
        return valorTotal;
    }

    @Override
    public double calcularFrete(){
        frete = 20 + (getValor()*0.10);
        return frete;
    }
}



