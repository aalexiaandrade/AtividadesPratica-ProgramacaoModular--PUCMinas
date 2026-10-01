import java.util.ArrayList;
import java.util.Scanner;

public class Mecanica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
   
        
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Mecanico> mecanicos = new ArrayList<>();
        ArrayList<Box> boxes = new ArrayList<>();
        ArrayList<Servico> servicos = new ArrayList<>();
        ArrayList<OrdemServico> ordens = new ArrayList<>(); 
        
        Mecanico meca1 = new Mecanico("Joel", "1578965423", "LAVA-JATO", "318954782");
        Mecanico meca2 = new Mecanico("Fabricio", "1578965423", "TROCADOR DE OLEO", "318954782");
        Mecanico meca3 = new Mecanico("Antonio", "1578965423", "REPARADOR", "318954782");
        
        mecanicos.add(meca1);
        mecanicos.add(meca2);
        mecanicos.add(meca3);
        
        Box box1 = new Box(1, "LAVA-JATO", 2, "Belo Horizonte");
        Box box2 = new Box(2, "TROCADOR DE OLEO", 3, "Contagem");
        Box box3 = new Box(3, "REPARADOR", 1, "Betim" );
        
        boxes.add(box1);
        boxes.add(box2);
        boxes.add(box3);

        Servico serv1 = new Servico("Troca de óleo", 10, 50.00, "ÓLEO");
        Servico serv2 = new Servico("Lavagem completa", 60, 100.00, "LAVAGEM");
        Servico serv3 = new Servico("Reparação pintura", 180, 280.00, "PINTURA");

        servicos.add(serv1);
        servicos.add(serv2);
        servicos.add(serv3);

        
        int codigo = 0;
        int escolha = 0;
        
        while (escolha != 5){
            System.out.println("\n|---------------- OFICINA ----------------|");
            System.out.println("| 1 - Cadastrar Ordem de Serviço" +
                    "\n| 2 - Associar um mecânico a um box" +
                    "\n| 3 - Atribuir ordem de serviço a um box" +
                    "\n| 4 - Exibir todas as ordens atribuídas a um box específico" +
                    "\n| 5 - Informar a quantidade total de ordens finalizadas por cada box" +
                    "\n| 6 - Buscar ordens por status." +
                    "\n| 7 - Exibir os detalhes completos de uma ordem específica"+
                    "\n| 8 - Sair do Sistema");
            System.out.println("|----------------------------------------------|");
            escolha = scanner.nextInt();

            if(escolha == 1){
                if (escolha == 1) {
                System.out.println("\n--------------- ORDEM DE SERVIÇO ---------------");

                System.out.println("Serviços disponíveis:");
                for (int i = 0; i < servicos.size(); i++) {
                    System.out.println("- " + servicos.get(i).getNome() + " | Tempo: " + servicos.get(i).getTempoEstimadoMinutos() + " min | R$ " + servicos.get(i).getValor());
                }

                System.out.print("Digite o nome do cliente: ");
                String nome = scanner.nextLine();
                
                System.out.print("Digite o modelo do carro: ");
                String modelo = scanner.nextLine();
                
                System.out.print("Digite a placa do carro: ");
                String placa = scanner.nextLine();
                
                System.out.print("Digite a data (ex: 20/03/2026): ");
                String data = scanner.nextLine();
                
                System.out.print("Digite o nome exato do serviço desejado: ");
                String serv = scanner.nextLine();

                Servico servicoEncontrado = null;
                for (Servico s : servicos) {
                    if (serv.equalsIgnoreCase(s.getNome())) {
                        servicoEncontrado = s;
                        break;
                    }
                }

                if (servicoEncontrado != null) {
                    codigo++;
                    OrdemServico novaOrdem = new OrdemServico(codigo, nome, modelo, placa, data, servicoEncontrado);
                    ordens.add(novaOrdem);
                    System.out.println("Ordem de Serviço #" + codigo + " cadastrada com sucesso! (Status: ABERTA)");
                } else {
                    System.out.println("Erro: Serviço não encontrado no catálogo.");
                }

                if (servicoEncontrado != null) {
                    codigo++;
                    OrdemServico novaOrdem = new OrdemServico(codigo, nome, modelo, placa, data, servicoEncontrado);
                    ordens.add(novaOrdem);
                    System.out.println("Ordem de Serviço #" + codigo + " cadastrada com sucesso! (Status: ABERTA)");
                } else {
                    System.out.println("Erro: Serviço não encontrado no catálogo.");
                }

            }
            if(escolha == 2){
            }
            if(escolha == 3){

            }
            if(escolha == 4){

            }
            if(escolha == 8){
                System.out.println("Saindo do sistema...");
            }
        }
    }
}}
