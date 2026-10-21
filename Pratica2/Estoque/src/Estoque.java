import java.util.HashMap;
import java.util.Map;

public class Estoque {
    // HashMap<Chave, Valor> -> Chave: Código (Integer), Valor: Produto[cite: 2]
    private Map<Integer, Produto> produtos;

    public Estoque() {
        this.produtos = new HashMap<>();
    }

    // Adiciona se não existir um produto com o mesmo código[cite: 2]
    public boolean adicionarProduto(Produto produto) {
        if (verificarExistencia(produto.getCodigo())) {
            return false;
        }
        produtos.put(produto.getCodigo(), produto);
        return true;
    }

    // Retorna o produto pelo código[cite: 2]
    public Produto buscarProduto(int codigo) {
        return produtos.get(codigo);
    }

    // Remove o produto pelo código[cite: 2]
    public boolean removerProduto(int codigo) {
        if (verificarExistencia(codigo)) {
            produtos.remove(codigo);
            return true;
        }
        return false;
    }

    // Verifica se a chave existe no HashMap[cite: 2]
    public boolean verificarExistencia(int codigo) {
        return produtos.containsKey(codigo);
    }

    // Exibe todos os produtos do estoque[cite: 2]
    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Estoque vazio!");
            return;
        }
        for (Produto p : produtos.values()) {
            System.out.println(p);
        }
    }

    // Exibe produtos com quantidade inferior a 5[cite: 2]
    public void listarEstoqueBaixo() {
        System.out.println("\n--- PRODUTOS COM ESTOQUE BAIXO (< 5) ---");
        boolean encontrou = false;
        for (Produto p : produtos.values()) {
            if (p.getQuantidadeEstoque() < 5) {
                System.out.println(p);
                encontrou = true;
            }
        }
        if (!encontrou) {
            System.out.println("Nenhum produto com estoque baixo.");
        }
    }

    public int getTamanho() {
        return produtos.size();
    }
}