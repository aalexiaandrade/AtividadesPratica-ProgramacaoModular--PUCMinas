import javax.swing.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int escolha = 0;
        String nome;
        int idade;
        int coragem;
        int inteligencia;
        int ambicao;
        int lealdade;
        int estrategia;
        int criativade;

        while (escolha != 3) {
            System.out.println("---------- CHAPEU SELETOR DE HOGWARTS ----------");
            System.out.println("1 - Calcular casa | 2 - Exibir informações do aluno | 3 - Sair do sistema");
            escolha = scanner.nextInt();

            if (escolha == 1) {
                scanner.nextLine();
                System.out.println("Digite seu nome: ");
                nome = scanner.nextLine();
                System.out.println("Digite sua idade: ");
                idade = scanner.nextInt();
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

                Pessoa p = new Pessoa(nome, idade, coragem, inteligencia, ambicao, lealdade, estrategia, criativade);
                p.calcularCasa();
                p.exibirInformacoes();

            } else if (escolha == 2) {
                Pessoa p = new Pessoa();
                p.exibirInformacoes();
            }

            else {
                System.out.println("Saindo do sistema...");
                break;
            }
        }}}
