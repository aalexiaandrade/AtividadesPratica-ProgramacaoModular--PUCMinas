
import java.util.ArrayList;

public class Bilheteria {
    ArrayList<Ingresso> ingressos = new ArrayList<>();

    public void adicionarIngresso(Ingresso ingresso) {
        ingressos.add(ingresso);
        System.out.println("Ingresso cadastrado com sucesso!");
    }

    public boolean removerIngresso(int codigo) {
        for (int i = 0; i < ingressos.size(); i++) {
            if (ingressos.get(i).getCodigo() == codigo) {
                ingressos.remove(i);
                return true;
            }
        }

        return false;
    }

    public Ingresso buscarIngresso(int codigo) {
        for (int i = 0; i < ingressos.size(); i++) {
            if (ingressos.get(i).getCodigo() == codigo) {
                return ingressos.get(i);
            }
        }

        return null;
    }

    public void listarIngressos() {
        if (ingressos.size() == 0) {
            System.out.println("Nenhum ingresso cadastrado!");
        } else {
            for (int i = 0; i < ingressos.size(); i++) {
                ingressos.get(i).exibirInformacoes();
                System.out.println();
            }
        }
    }

    public double calcularArrecadacao() {
        double total = 0;

        for (int i = 0; i < ingressos.size(); i++) {
            total += ingressos.get(i).calcularValorFinal();
        }

        return total;
    }

    public void listarBeneficios() {
        if (ingressos.size() == 0) {
            System.out.println("Nenhum ingresso cadastrado!");
        } else {
            for (int i = 0; i < ingressos.size(); i++) {
                System.out.println("Código: "
                        + ingressos.get(i).getCodigo());
                System.out.println("Evento: "
                        + ingressos.get(i).getNomeEvento());
                System.out.println("Benefícios: "
                        + ingressos.get(i).obterBeneficios());
                System.out.println();
            }
        }
    }
}
