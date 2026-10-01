/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mecanica;

import java.util.ArrayList;
/**
 *
 * @author 1538464
 */
public class Box {
    
    ArrayList<OrdemServico> ordens;

    private int num;
    private String tipo_servico;
    private int capacidade_maxima;
    private String localizacao;
    private Mecanico mecanico;
    
    public Box(int num, String tipo_servico, int capacidade_maxima, String localizacao) {
        this.num = num;
        this.tipo_servico = tipo_servico;
        this.capacidade_maxima = capacidade_maxima;
        this.localizacao = localizacao;
    }

    public Box(){}
    
    
    public ArrayList<OrdemServico> getOrdem() {
        return ordens;
    }

    public void setOrdem(ArrayList<OrdemServico> ordem) {
        this.ordens = ordem;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getTipo_servico() {
        return tipo_servico;
    }

    public void setTipo_servico(String tipo_servico) {
        this.tipo_servico = tipo_servico;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void adicionarOrdem(OrdemServico ordem){
        ordens.add(ordem);
    }

    public void adicionarBox(){

    }

    public void visualizarOrdem(int num_box){
        System.out.println("---------------- ORDENS ----------------");
        int quant = 0;
        for (int i = 0; i < ordens.size(); i++){
            System.out.println("Codigo: "+ ordens.get(i).getCodigo() + " | Data Inicio: "+ ordens.get(i).getData() + " | Cliente: " + ordens.get(i).getNome_cliente());
            quant++;
        }
        System.out.println("------------ Total ordens: " + quant);
    }
}
