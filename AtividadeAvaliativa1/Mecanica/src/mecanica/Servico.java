/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mecanica;

/**
 *
 * @author 1538464
 */
public class Servico {
    private String nome;
    private int tempo_estimado;
    private double valor;
    private String categoria;

    public Servico(String nome, int tempo_estimado, double valor, String categoria) {
        this.nome = nome;
        this.tempo_estimado = tempo_estimado;
        this.valor = valor;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTempo_estimado() {
        return tempo_estimado;
    }

    public void setTempo_estimado(int tempo_estimado) {
        this.tempo_estimado = tempo_estimado;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
}
