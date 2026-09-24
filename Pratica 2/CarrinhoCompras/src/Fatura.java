import java.util.ArrayList;

public class Fatura {
    ArrayList<Item> itens = new ArrayList<Item>();
    private double valor_total_fatura;

    public Fatura (ArrayList<Item> item){
        this.itens = item;
    }

    public Fatura(){

    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }

    public double getValor_total_fatura() {
        return valor_total_fatura;
    }

    public void setValor_total_fatura(double valor_total_fatura) {
        this.valor_total_fatura = valor_total_fatura;
    }

    public void adicionarItem(Item item){
        itens.add(item);
    }

    public void excluirItem(int codigo){
        for (int i = 0; i< itens.size(); i ++){
            if (itens.get(i).getProduto().getCodigo() == codigo){
                itens.remove(itens.get(i).getProduto().getCodigo());
                System.out.println("Item excluído da fatura..");
                break;
            }
        }
    }

    public void alterarItem(int codigo, int qtd){
        for (int i = 0; i < itens.size(); i++){
            if (itens.get(i).getProduto().getCodigo() == codigo){
                itens.get(i).setQuantidade(qtd);
                System.out.println("Item alterado na fatura..");
                break;
            }
        }
    }

    public void somarTotalFatura(){
        double total = 0.0;
        for (Item item : this.itens){
            total += item.getValor_total();
        }
        setValor_total_fatura(total);
    }

    public void visualizarFatura(){
        System.out.println("---------------- FATURA ----------------");
        for (int i = 0; i < itens.size(); i++){
            System.out.println("Nome: "+ itens.get(i).getProduto().getNome() + " | Quantidade: "+ itens.get(i).getQuantidade() + " | Valor: " + itens.get(i).getValor_total());
        }
        System.out.println("------------ Valor Total: " + getValor_total_fatura());
    }
}