import java.util.ArrayList;

public class Fatura {
    private ArrayList<Item> itens;
    private double valorTotalFatura;

    public Fatura() {
        this.itens = new ArrayList<>();
        this.valorTotalFatura = 0.0;
    }

    public void adicionarItem(Item item) {
        itens.add(item);
        calcularTotalFatura();
    }

    public void calcularTotalFatura() {
        double total = 0.0;
        for (Item item : itens) {
            total += item.getValorTotal();
        }
        this.valorTotalFatura = total;
    }

    public void visualizarFatura() {
        if (itens.isEmpty()) {
            System.out.println("Fatura vazia!");
            return;
        }
        System.out.println("\n--- ITENS DA FATURA ---");
        for (Item item : itens) {
            System.out.println("Produto: " + item.getProduto().getNome() +
                    " | Qtd: " + item.getQuantidade() +
                    " | Subtotal: R$ " + item.getValorTotal());
        }
        System.out.println("---------------------------");
        System.out.println("TOTAL DA FATURA: R$ " + valorTotalFatura);
    }

    public ArrayList<Item> getItens() { return itens; }
    public double getValorTotalFatura() { return valorTotalFatura; }
}