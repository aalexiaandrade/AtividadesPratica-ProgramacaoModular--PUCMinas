public class OrdemServico {
    private int codigo;
    private String nomeCliente;
    private String modeloVeiculo;
    private String placaVeiculo;
    private String data;
    private String status; // "aberta", "em execução", "finalizada"
    private double valorEstimado;
    private Servico servico;
    private Box boxAlocado;

    public OrdemServico(int codigo, String nomeCliente, String modeloVeiculo, String placaVeiculo, String data, Servico servico) {
        this.codigo = codigo;
        this.nomeCliente = nomeCliente;
        this.modeloVeiculo = modeloVeiculo;
        this.placaVeiculo = placaVeiculo;
        this.data = data;
        this.servico = servico;
        this.valorEstimado = servico != null ? servico.getValor() : 0.0;
        this.status = "aberta";
        this.boxAlocado = null;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getModeloVeiculo() {
        return modeloVeiculo;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public String getData() {
        return data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getValorEstimado() {
        return valorEstimado;
    }

    public Servico getServico() {
        return servico;
    }

    public Box getBoxAlocado() {
        return boxAlocado;
    }

    public void setBoxAlocado(Box boxAlocado) {
        this.boxAlocado = boxAlocado;
    }

    public void exibirDetalhesCompletos() {
        System.out.println("==========================================");
        System.out.println("          ORDEM DE SERVIÇO #" + codigo);
        System.out.println("==========================================");
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("Veículo: " + modeloVeiculo + " | Placa: " + placaVeiculo);
        System.out.println("Data: " + data);
        System.out.println("Status: " + status.toUpperCase());
        System.out.println("Valor Estimado: R$ " + String.format("%.2f", valorEstimado));
        System.out.println("------------------------------------------");
        if (servico != null) {
            System.out.println("Serviço Associado: " + servico.getNome() + " (" + servico.getCategoria() + ")");
        } else {
            System.out.println("Serviço Associado: Nenhum");
        }
        System.out.println("------------------------------------------");
        if (boxAlocado != null) {
            System.out.println("Box Associado: Box nº " + boxAlocado.getNumero() + " (" + boxAlocado.getLocalizacao() + ")");
            if (boxAlocado.getMecanicoResponsavel() != null) {
                System.out.println("Mecânico Responsável: " + boxAlocado.getMecanicoResponsavel().getNome());
            } else {
                System.out.println("Mecânico Responsável: Nenhum");
            }
        } else {
            System.out.println("Box Associado: Nenhum (Ordem sem box atribuído)");
        }
        System.out.println("==========================================\n");
    }
}