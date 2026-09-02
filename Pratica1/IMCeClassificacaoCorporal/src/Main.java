import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome;
        String sobrenome;
        int idade;
        double peso;
        double altura;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        nome = scanner.nextLine();
        System.out.println("Digite seu sobrenome: ");
        sobrenome = scanner.nextLine();
        System.out.println("Digite sua idade: ");
        idade = scanner.nextInt();
        System.out.println("Digite seu peso: ");
        peso = scanner.nextDouble();
        System.out.println("Digite sua altura: ");
        altura = scanner.nextDouble();

        Pessoa p = new Pessoa(nome, sobrenome, idade, peso, altura);

        System.out.println(p.getNome());

        double imc = p.calcularIMC(peso, altura);
        System.out.println("Seu IMC é: "+ imc);
        p.informaObesidade();
    }
}