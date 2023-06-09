
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Escola
 */
public class Time {
    
    private String nome;
    private Tecnico tecnico;
    private List<Jogador> jogadores;
    private int vitorias;
    private int empate;
    private int derrotas;
    
          public void AdicionarJogador(Jogador jogador) {     

        if ((jogadores.size() < 11) && (!jogadores.contains(jogador))) {
            jogadores.add(jogador);

        } else {
            System.out.println("jogador nao pode ser add");

        }
    }

    public Time() {
        this.jogadores = new ArrayList();
    }
          

    public Time(String nome, Tecnico tecnico, int vitorias, int empate, int derrotas) {
        this.nome = nome;
        this.tecnico = tecnico;
        
        this.vitorias = vitorias;
        this.empate = empate;
        this.derrotas = derrotas;
        this.jogadores = new ArrayList();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getEmpate() {
        return empate;
    }

    public void setEmpate(int empate) {
        this.empate = empate;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    @Override
    public String toString() {
        return "Time{" + "nome=" + nome + ", tecnico=" + tecnico + ", jogadores=" + jogadores + ", vitorias=" + vitorias + ", empate=" + empate + ", derrotas=" + derrotas + '}';
    }

}