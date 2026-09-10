import java.time.LocalDate;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Pessoa p[] = new Pessoa[10];

        int escolha = 0;

        int cont = 0;

        String nome;
        String sobrenome;
        int ano;
        int mes;
        int dia;
        LocalDate data_nascimento;
        int coragem;
        int inteligencia;
        int ambicao;
        int lealdade;
        int estrategia;
        int criativade;
        String casa;

        while (escolha!=8) {
            System.out.println("\n---------- CADASTRAR ALUNOS HOGWARTS ----------");
            System.out.println("1 - Cadastrar alunos \n" +
                    "2 - Listar todos os alunos \n" +
                    "3 - Listar alunos de uma casa\n" +
                    "4 - Exibir alunos por casa \n" +
                    "5 - Exibir alunos maiores de idade \n" +
                    "6 - Exibir alunos menores de idade \n" +
                    "7 - Buscar aluno por sobrenome \n" +
                    "8 - Encerrar");
            escolha = scanner.nextInt();

            if (escolha == 1) {
                if (cont < p.length) {
                    scanner.nextLine();
                    System.out.println("Digite seu nome: ");
                    nome = scanner.nextLine();
                    System.out.println("Digite seu sobrenome: ");
                    sobrenome = scanner.nextLine();
                    System.out.println("Digite seu ano de aniversario (Ex:2003): ");
                    ano = scanner.nextInt();
                    System.out.println("Digite seu mês de aniversario (Ex:09): ");
                    mes = scanner.nextInt();
                    System.out.println("Digite seu dia de aniversario (Ex:27): ");
                    dia = scanner.nextInt();
                    System.out.println("Digite o numero da sua coragem: ");
                    coragem = scanner.nextInt();
                    System.out.println("Digite o numero da sua inteligencia: ");
                    inteligencia = scanner.nextInt();
                    System.out.println("Digite o numero da sua ambicao: ");
                    ambicao = scanner.nextInt();
                    System.out.println("Digite o numero da sua lealdade: ");
                    lealdade = scanner.nextInt();
                    System.out.println("Digite o numero da sua estrategia: ");
                    estrategia = scanner.nextInt();
                    System.out.println("Digite o numero da sua criativade: ");
                    criativade = scanner.nextInt();

                    data_nascimento = LocalDate.of(ano, mes, dia);
                    p[cont] = new Pessoa(nome, sobrenome, data_nascimento, coragem, inteligencia, ambicao, lealdade, estrategia, criativade);

                    p[cont].calcularCasa();
                    p[cont].verificarPalavra(sobrenome);
                    p[cont].calcularIdade();
                    p[cont].gerarNomeUsuario();
                    p[cont].gerarCodigoMatricula(cont);
                    p[cont].exibirInformacoes();

                    cont++;
                }
                else{
                    System.out.println("\nNúmero máximo de alunos cadastrados...");
                }
            }

            else if (escolha == 2) {
                System.out.println("\n---------- ALUNOS CADASTRADOS NO SISTEMA ----------");
                for(int i = 0; i< p.length; i++){
                    System.out.println(p[i].getNome() + " " +  p[i].getSobrenome());
                }
            }

            else if (escolha == 3) {
                scanner.nextLine();
                System.out.println("\nDigite o nome da casa: ");
                casa = scanner.nextLine().toUpperCase();

                int alunos = 0;
                System.out.println("\n---------- ALUNOS DA CASA "+ casa +" ----------");
                for(int i = 0; i< p.length; i++){
                    if (p[i].verificarCasa(casa)) {
                        alunos++;
                    }
                }
                System.out.println("Total de: "+ alunos + " alunos.");
            }

            else if (escolha == 4) {
                System.out.println("\n---------- ALUNOS ----------");
                for(int i = 0; i< p.length; i++) {
                    if (p[i].getCasa().equalsIgnoreCase("GRIFINORIA")) {
                        System.out.println("- GRIFINORIA: ");
                        System.out.println(p[i].getNome() + p[i].getSobrenome());
                    }
                }
                for(int i = 0; i< p.length; i++) {
                    if (p[i].getCasa().equalsIgnoreCase("SONSERINA")) {
                        System.out.println("- SONSERINA: ");
                        System.out.println(p[i].getNome() + p[i].getSobrenome());
                    }
                }
                for(int i = 0; i< p.length; i++) {
                    if (p[i].getCasa().equalsIgnoreCase("CORVINAL")) {
                        System.out.println("- CORVINAL: ");
                        System.out.println(p[i].getNome() + p[i].getSobrenome());
                    }
                }
                for(int i = 0; i< p.length; i++){
                    if (p[i].getCasa().equalsIgnoreCase("LUFA LUFA")){
                        System.out.println("- LUFA LUFA: ");
                        System.out.println(p[i].getNome() + p[i].getSobrenome());
                    }
                }
            }

            else if(escolha == 5){
                System.out.println("\n---------- ALUNOS MAIORES DE IDADE ----------");
                for (int i=0; i < p.length; i++){
                    if (p[i].getMaioridade().equalsIgnoreCase("Sim")){
                        System.out.println(p[i].getNome() +" "+ p[i].getSobrenome());
                    }
                }
            }

            else if(escolha == 6){
                System.out.println("\n---------- ALUNOS MENORES DE IDADE ----------");
                for (int i=0; i < p.length; i++){
                    if (p[i].getMaioridade().equalsIgnoreCase("Não")){
                        System.out.println(p[i].getNome() +" "+ p[i].getSobrenome());
                    }
                }
            }

            else if (escolha == 7){
                scanner.nextLine();
                System.out.println("\nDigite o sobrenome: ");
                sobrenome = scanner.nextLine().toUpperCase();

                for (int i=0; i<p.length; i++){
                    if (p[i].getSobrenome().equalsIgnoreCase(sobrenome)){
                        System.out.println(p[i].getNome() +" "+p[i].getSobrenome());
                    }
                }
            }

            else {
                System.out.println("Saindo do sistema...");
                break;
            }
        }}}
