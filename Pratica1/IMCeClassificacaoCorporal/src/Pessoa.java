public class Pessoa {
    private String nome;
    private String sobrenome;
    private int idade;
    private double altura;
    private double peso;
    private double imc;


    public Pessoa(String nome, String sobrenome, int idade, double altura, double peso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public double getImc() {
        return imc;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double calcularIMC(double peso, double altura){
        imc = peso/(Math.pow(altura,2));
        return imc;
    }

    public void informaObesidade(){
        if (imc <= 18.5){
            System.out.println("Você está abaixo do peso.");
        }
        else if (imc <= 24.9) {
            System.out.println("Você está com o peso normal.");
        }
        else if (imc <= 29.9) {
            System.out.println("Você está com sobrepeso.");
        }
        else if (imc <= 34.9) {
            System.out.println("Você está com Obesidade de grau 1.");
        }
        else if (imc <= 39.9) {
            System.out.println("Você está com Obesidade de grau 2.");
        }
        else if (imc >= 40.0) {
            System.out.println("Você está com Obesidade de grau 3.");
        }
    }
}
