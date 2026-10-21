import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Agenda agenda = new Agenda();

        int escolha = 0;
        String nome;
        String email;
        String telefone;
        String dataAniversario;
        String parentesco;
        String empresa;
        String cargo;
        int grau;
        String observacao;

        while (escolha != 7) {
            System.out.println("\n---------- AGENDA TELEFONICA ----------" +
                    "\n 1 - Adicionar contato" +
                    "\n 2 - Remover contato" +
                    "\n 3 - Buscar contato pelo nome" +
                    "\n 4 - Buscar contato pelo email" +
                    "\n 5 - Buscar contato pelo telefone" +
                    "\n 6 - Consultar tamanho da agenda" +
                    "\n 7 - Finalizar" +
                    "\n \n Digite o número de sua escolha: ");

            escolha = scanner.nextInt();

            if (escolha == 1) {
                int escolha2 = 0;
                System.out.println("\nQual o tipo de contato você deseja cadastrar?" +
                        "\n 1 - Contato pessoal" +
                        "\n 2 - Contato profissional" +
                        "\n 3 - Contato emergencial");

                escolha2 = scanner.nextInt();
                scanner.nextLine();

                if (escolha2 == 1) {
                    System.out.println("\nDigite o nome: ");
                    nome = scanner.nextLine();
                    System.out.println("Digite o email: ");
                    email = scanner.nextLine();
                    System.out.println("Digite o telefone: ");
                    telefone = scanner.nextLine();
                    System.out.println("Digite a data de aniversario: ");
                    dataAniversario = scanner.nextLine();
                    System.out.println("Digite o parentesco: ");
                    parentesco = scanner.nextLine();

                    ContatoPessoal cp = new ContatoPessoal(nome, email, telefone, dataAniversario, parentesco);
                    agenda.adicionarContatos(cp);
                }

                if (escolha2 == 2) {
                    System.out.println("\nDigite o nome: ");
                    nome = scanner.nextLine();
                    System.out.println("Digite o email: ");
                    email = scanner.nextLine();
                    System.out.println("Digite o telefone: ");
                    telefone = scanner.nextLine();
                    System.out.println("Digite a empresa: ");
                    empresa = scanner.nextLine();
                    System.out.println("Digite o cargo: ");
                    cargo = scanner.nextLine();

                    ContatoProfissional cpp = new ContatoProfissional(nome, email, telefone, empresa, cargo);
                    agenda.adicionarContatos(cpp);
                }

                if (escolha2 == 3) {
                    System.out.println("\nDigite o nome: ");
                    nome = scanner.nextLine();
                    System.out.println("Digite o email: ");
                    email = scanner.nextLine();
                    System.out.println("Digite o telefone: ");
                    telefone = scanner.nextLine();
                    System.out.println("Digite o grau de prioridade: ");
                    grau = scanner.nextInt();
                    if (grau >= 1 & grau <= 5){}

                    else {
                        System.out.println("Não é possível inserir esse grau de prioridade..");
                        break;
                    }
                    System.out.println("Digite a observação: ");
                    observacao = scanner.nextLine();

                    ContatoEmergencia ce = new ContatoEmergencia(nome, email, telefone, grau, observacao);
                    agenda.adicionarContatos(ce);
                }

            }
            if (escolha == 2) {
                scanner.nextLine();
                System.out.println("\nDigite o nome do contato a ser excluido: ");
                nome = scanner.nextLine();
                agenda.excluirContatos(nome);
            }

            if (escolha == 3) {
                scanner.nextLine();
                System.out.println("\nDigite o nome: ");
                nome = scanner.nextLine();
                agenda.buscarContatoNome(nome);
            }

            if (escolha == 4) {
                scanner.nextLine();
                System.out.println("\nDigite o email: ");
                email = scanner.nextLine();
                agenda.buscarContatoNome(email);
            }

            if (escolha == 5) {
                scanner.nextLine();
                System.out.println("\nDigite o telefone: ");
                telefone = scanner.nextLine();
                agenda.buscarContatoNome(telefone);
            }

            if (escolha == 6) {
                agenda.getContatos_cadastrados();
            }

            if (escolha == 7) {
                System.out.println("\nSaindo do sistema...");
                break;
            }


        }
    }
}