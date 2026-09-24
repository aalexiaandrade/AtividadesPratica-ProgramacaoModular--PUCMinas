import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Estoque estoque = new Estoque();
        Fatura fatura = new Fatura();

        // Cadastrando produtos iniciais no estoque[cite: 1, 2]
        estoque.adicionarProduto(new Produto("Arroz", 1, 8.90, 10));
        estoque.adicionarProduto(new Produto("Feijão", 2, 4.90, 3)); // Estoque baixo[cite: 2]
        estoque.adicionarProduto(new Produto("Carne", 3, 20.90, 8));

        int opcao = 0;

        while (opcao != 10) {
            System.out.println("\n|----------------- MENU LOJA -----------------|");
            System.out.println("| 1 - Comprar");
            System.out.println("| 2 - Ver Fatura");
            System.out.println("| 3 - Consultar Produto no Estoque");
            System.out.println("| 4 - Cadastrar Novo Produto no Estoque");
            System.out.println("| 5 - Remover Produto do Estoque");
            System.out.println("| 6 - Repor Estoque de um Produto");
            System.out.println("| 7 - Exibir Produtos com Estoque Baixo");
            System.out.println("| 8 - Listar Todo o Estoque");
            System.out.println("| 10 - Finalizar");
            System.out.println("|---------------------------------------------|");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            if (opcao == 1) {
                // Integração com a compra[cite: 2]
                System.out.println("\n--- PRODUTOS DISPONÍVEIS ---");
                estoque.listarProdutos();

                System.out.print("\nDigite o código do produto: ");
                int codigo = scanner.nextInt();

                // 1. Verifica se existe no estoque[cite: 2]
                if (!estoque.verificarExistencia(codigo)) {
                    System.out.println("Erro: Produto não encontrado no estoque!");
                } else {
                    Produto p = estoque.buscarProduto(codigo);
                    System.out.print("Digite a quantidade desejada: ");
                    int qtd = scanner.nextInt();

                    // 2. Tenta retirar do estoque (Verifica e reduz)[cite: 2]
                    if (p.retirarEstoque(qtd)) {
                        Item item = new Item(p, qtd);
                        fatura.adicionarItem(item); // 3. Adiciona na fatura[cite: 2]
                        System.out.println("Compra realizada e adicionada à fatura!");
                    } else {
                        System.out.println("Erro: Quantidade insuficiente em estoque! Disponível: " + p.getQuantidadeEstoque());
                    }
                }

            } else if (opcao == 2) {
                fatura.visualizarFatura();

            } else if (opcao == 3) {
                System.out.print("Digite o código do produto: ");
                int codigo = scanner.nextInt();
                Produto p = estoque.buscarProduto(codigo);
                if (p != null) {
                    System.out.println(p);
                } else {
                    System.out.println("Produto não encontrado!");
                }

            } else if (opcao == 4) {
                scanner.nextLine(); // Limpa o buffer do teclado
                System.out.print("Nome do produto: ");
                String nome = scanner.nextLine();
                System.out.print("Código: ");
                int codigo = scanner.nextInt();
                System.out.print("Preço: R$ ");
                double preco = scanner.nextDouble();
                System.out.print("Quantidade inicial em estoque: ");
                int qtd = scanner.nextInt();

                Produto novo = new Produto(nome, codigo, preco, qtd);
                if (estoque.adicionarProduto(novo)) {
                    System.out.println("Produto cadastrado com sucesso!");
                } else {
                    System.out.println("Erro: Código de produto já existente!");
                }

            } else if (opcao == 5) {
                System.out.print("Digite o código do produto a remover: ");
                int codigo = scanner.nextInt();
                if (estoque.removerProduto(codigo)) {
                    System.out.println("Produto removido do estoque!");
                } else {
                    System.out.println("Produto não encontrado!");
                }

            } else if (opcao == 6) {
                System.out.print("Digite o código do produto: ");
                int codigo = scanner.nextInt();
                Produto p = estoque.buscarProduto(codigo);
                if (p != null) {
                    System.out.print("Quantidade a adicionar: ");
                    int qtd = scanner.nextInt();
                    p.adicionarEstoque(qtd);
                    System.out.println("Estoque atualizado! Novo saldo: " + p.getQuantidadeEstoque());
                } else {
                    System.out.println("Produto não encontrado!");
                }

            } else if (opcao == 7) {
                estoque.listarEstoqueBaixo();

            } else if (opcao == 8) {
                System.out.println("\n--- ESTOQUE COMPLETO ---");
                estoque.listarProdutos();

            } else if (opcao == 10) {
                System.out.println("Finalizando sistema... Total a pagar: R$ " + fatura.getValorTotalFatura());
            }
        }
        scanner.close();
    }
}