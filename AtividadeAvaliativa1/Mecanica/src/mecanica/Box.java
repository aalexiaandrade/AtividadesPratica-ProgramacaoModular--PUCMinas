import java.util.ArrayList;
import java.util.List;

public class Box {
    private int numero;
    private String tipoServicoPermitido;
    private int capacidadeMaximaVeiculos;
    private String localizacao;
    private Mecanico mecanicoResponsavel;
    private List<OrdemServico> ordensAtivas;
    private int totalOrdensFinalizadas;

    public Box(int numero, String tipoServicoPermitido, int capacidadeMaximaVeiculos, String localizacao) {
        this.numero = numero;
        this.tipoServicoPermitido = tipoServicoPermitido;
        this.capacidadeMaximaVeiculos = capacidadeMaximaVeiculos;
        this.localizacao = localizacao;
        this.mecanicoResponsavel = null;
        this.ordensAtivas = new ArrayList<>();
        this.totalOrdensFinalizadas = 0;
    }

    public int getNumero() {
        return numero;
    }

    public String getTipoServicoPermitido() {
        return tipoServicoPermitido;
    }

    public int getCapacidadeMaximaVeiculos() {
        return capacidadeMaximaVeiculos;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public Mecanico getMecanicoResponsavel() {
        return mecanicoResponsavel;
    }

    public void setMecanicoResponsavel(Mecanico mecanicoResponsavel) {
        this.mecanicoResponsavel = mecanicoResponsavel;
    }

    public List<OrdemServico> getOrdensAtivas() {
        return ordensAtivas;
    }

    public int getTotalOrdensFinalizadas() {
        return totalOrdensFinalizadas;
    }

    public boolean adicionarOrdem(OrdemServico ordem) {
        if (ordensAtivas.size() >= capacidadeMaximaVeiculos) {
            System.out.println("Erro: Capacidade máxima do Box " + numero + " atingida.");
            return false;
        }

        if (ordem.getServico() != null && !ordem.getServico().getCategoria().equalsIgnoreCase(tipoServicoPermitido)) {
            System.out.println("Erro: O tipo de serviço da OS (" + ordem.getServico().getCategoria() + 
                               ") é incompatível com o tipo permitido no Box (" + tipoServicoPermitido + ").");
            return false;
        }

        ordensAtivas.add(ordem);
        ordem.setStatus("em execução");
        ordem.setBoxAlocado(this);
        return true;
    }

    public boolean finalizarOrdem(int codigoOS) {
        OrdemServico ordemEncontrada = null;
        for (OrdemServico os : ordensAtivas) {
            if (os.getCodigo() == codigoOS) {
                ordemEncontrada = os;
                break;
            }
        }

        if (ordemEncontrada != null) {
            ordemEncontrada.setStatus("finalizada");
            ordensAtivas.remove(ordemEncontrada);
            totalOrdensFinalizadas++;
            return true;
        }
        return false;
    }
}