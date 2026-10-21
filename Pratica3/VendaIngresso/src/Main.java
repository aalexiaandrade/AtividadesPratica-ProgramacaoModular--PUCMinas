
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bilheteria bilheteria = new Bilheteria();

        int opcao = 0;

        while (opcao != 7) {
            System.out.println("\n===== BILHETERIA =====");
            System.out.println("1 - Cadastrar ingresso");
            System.out.println("2 - Remover ingresso");
            System.out.println("3 - Buscar ingresso por código");
            System.out.println("4 - Listar todos os ingressos");
            System.out.println("5 - Calcular arrecadação total");
            System.out.println("6 - Listar benefícios dos ingressos");
            System.out.println("7 - Finalizar");
            System.out.print("Escolha uma opção: ");

            opcao = lerInteiro(sc);

            switch (opcao) {
                case 1:
                    System.out.println("\nTipos de ingresso:");
                    System.out.println("1 - Comum");
                    System.out.println("2 - Estudante");
                    System.out.println("3 - VIP");
                    System.out.print("Escolha o tipo: ");

                    int tipo = lerInteiro(sc);

                    if (tipo < 1 || tipo > 3) {
                        System.out.println("Tipo de ingresso inválido!");
                        break;
                    }

                    System.out.print("Código: ");
                    int codigo = lerInteiro(sc);

                    if (bilheteria.buscarIngresso(codigo) != null) {
                        System.out.println("Já existe um ingresso com esse código!");
                        break;
                    }

                    System.out.print("Nome do evento: ");
                    String nomeEvento = sc.nextLine();

                    System.out.print("Setor: ");
                    String setor = sc.nextLine();

                    System.out.print("Valor base: R$ ");
                    double valorBase = lerDouble(sc);

                    if (valorBase < 0) {
                        System.out.println("O valor não pode ser negativo!");
                        break;
                    }

                    Ingresso ingresso;

                    if (tipo == 1) {
                        ingresso = new IngressoComum(
                                codigo, nomeEvento, setor, valorBase);

                    } else if (tipo == 2) {
                        System.out.print("Instituição de ensino: ");
                        String instituicao = sc.nextLine();

                        ingresso = new IngressoEstudante(
                                codigo, nomeEvento, setor,
                                valorBase, instituicao);

                    } else {
                        System.out.print("Possui acesso ao backstage? (s/n): ");
                        String resposta = sc.nextLine();

                        boolean backstage;

                        if (resposta.equalsIgnoreCase("s")) {
                            backstage = true;
                        } else {
                            backstage = false;
                        }

                        System.out.print("Número do lounge: ");
                        int lounge = lerInteiro(sc);

                        ingresso = new IngressoVIP(
                                codigo, nomeEvento, setor,
                                valorBase, backstage, lounge);
                    }

                    bilheteria.adicionarIngresso(ingresso);
                    break;

                case 2:
                    System.out.print("Informe o código do ingresso: ");
                    int codigoRemover = lerInteiro(sc);

                    if (bilheteria.removerIngresso(codigoRemover)) {
                        System.out.println("Ingresso removido com sucesso!");
                    } else {
                        System.out.println("Ingresso não encontrado!");
                    }
                    break;

                case 3:
                    System.out.print("Informe o código do ingresso: ");
                    int codigoBuscar = lerInteiro(sc);

                    Ingresso encontrado =
                            bilheteria.buscarIngresso(codigoBuscar);

                    if (encontrado != null) {
                        encontrado.exibirInformacoes();
                    } else {
                        System.out.println("Ingresso não encontrado!");
                    }
                    break;

                case 4:
                    bilheteria.listarIngressos();
                    break;

                case 5:
                    System.out.printf(
                            "Arrecadação total: R$ %.2f%n",
                            bilheteria.calcularArrecadacao());
                    break;

                case 6:
                    bilheteria.listarBeneficios();
                    break;

                case 7:
                    System.out.println("Programa finalizado!");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        sc.close();
    }

    public static int lerInteiro(Scanner sc) {
        while (true) {
            try {
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Digite um número inteiro válido: ");
            }
        }
    }

    public static double lerDouble(Scanner sc) {
        while (true) {
            try {
                return Double.parseDouble(
                        sc.nextLine().replace(",", "."));
            } catch (NumberFormatException e) {
                System.out.print("Digite um valor válido: R$ ");
            }
        }
    }
}
