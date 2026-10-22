 abstract class Pedido implements Processavel{
    private int id;
    private String nomeCliente;
    private double valor;
    private StatusPedido status;
    private Categoria categoria;

     public Pedido(int id, String nomeCliente, double valor, StatusPedido status, Categoria categoria) {
         this.id = id;
         this.nomeCliente = nomeCliente;
//         if(valor <= 0){
//             return new ValorInvalidoException("Erro.");
//         }
//         else{
//             this.valor = valor;
//         }
         this.valor = valor;
         this.status = status;
         this.categoria = categoria;
     }

     public int getId() {
         return id;
     }

     public void setId(int id) {
         this.id = id;
     }

     public String getNomeCliente() {
         return nomeCliente;
     }

     public void setNomeCliente(String nomeCliente) {
         this.nomeCliente = nomeCliente;
     }

     public double getValor() {
         return valor;
     }

     public void setValor(double valor) {
         this.valor = valor;
     }

     public StatusPedido getStatus() {
         return status;
     }

     public void setStatus(StatusPedido status) {
         this.status = status;
     }

     public Categoria getCategoria() {
         return categoria;
     }

     public void setCategoria(Categoria categoria) {
         this.categoria = categoria;
     }

     @Override
     public void processarPedido(){
        if(this.status == StatusPedido.CANCELADO){

        }
     }
 }
