import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Fatura fatura = new Fatura();
        Item item = new Item();

        ArrayList<Produto> produtos = new ArrayList<>();

        Produto p1 = new Produto("Arroz", 1, 8.90);
        Produto p2 = new Produto("Feijão", 2, 4.90);
        Produto p3 = new Produto("Carne", 3, 20.90);

        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);

        int escolha = 0;

        int codigo;
        int qnt;
        double valorUnitario;

        while (escolha != 5){
            System.out.println("\n|---------------- SUPERMERCADO ----------------|");
            System.out.println("| 1 - Comprar" +
                    "\n| 2 - Ver fatura" +
                    "\n| 3 - Excluir Item" +
                    "\n| 4 - Alterar item" +
                    "\n| 5 - Encerrar");
            System.out.println("|----------------------------------------------|");
            escolha = scanner.nextInt();

            if(escolha == 1){
                System.out.println("--------------- PRODUTOS ---------------");
                System.out.println("| CODIGO | NOME | VALOR |");
                for (int i = 0; i < produtos.size(); i++ ){
                    System.out.println("| " + produtos.get(i).getCodigo() + " | " + produtos.get(i).getNome() + " | " + produtos.get(i).getPreco());
                }

                System.out.println("Digite o código do item a ser comprado: ");
                codigo = scanner.nextInt();

                System.out.println("Digite quantos itens: ");
                qnt = scanner.nextInt();

                Produto nome_produto;
                for (Produto produto : produtos){
                    if (codigo == produto.getCodigo()){
                        nome_produto = produto;
                        item = new Item(nome_produto, qnt);
                        fatura.adicionarItem(item);
                        break;
                    }
                }
            }

            if(escolha == 2){
                fatura.somarTotalFatura();
                fatura.visualizarFatura();
            }
            if(escolha == 3){
                System.out.println("Digite o código do item a ser excluído: ");
                codigo = scanner.nextInt();
                fatura.excluirItem(codigo);

            }
            if(escolha == 4){
                System.out.println("Digite o código do item a ser alterado: ");
                codigo = scanner.nextInt();

                System.out.println("Digite a quantidade a ser comprada: ");
                qnt = scanner.nextInt();

                fatura.alterarItem(codigo, qnt);

            }
            if(escolha == 5){
                System.out.println("Saindo do sistema...");
            }
        }



    }
}