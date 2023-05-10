/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author geang
 */
public class Partida {

    private Time timeDaCasa;
    private Time timeDeVisitante;
    private int golsDaCasa;
    private int golsDeVisitantes;

    public Partida() {
        
    }
    
    public Partida(Time timeDaCasa, Time timeDeVisitante, int golsDaCasa, int golsDeVisitantes) {
        this.timeDaCasa = timeDaCasa;
        this.timeDeVisitante = timeDeVisitante;
        this.golsDaCasa = golsDaCasa;
        this.golsDeVisitantes = golsDeVisitantes;
    }

    public Time getTimeDaCasa() {
        return timeDaCasa;
    }

    public void setTimeDaCasa(Time timeDaCasa) {
        this.timeDaCasa = timeDaCasa;
    }

    public Time getTimeDeVisitante() {
        return timeDeVisitante;
    }

    public void setTimeDeVisitante(Time timeDeVisitante) {
        this.timeDeVisitante = timeDeVisitante;
    }

    public int getGolsDaCasa() {
        return golsDaCasa;
    }

    public void setGolsDaCasa(int golsDaCasa) {
        this.golsDaCasa = golsDaCasa;
    }

    public int getGolsDeVisitantes() {
        return golsDeVisitantes;
    }

    public void setGolsDeVisitantes(int golsDeVisitantes) {
        this.golsDeVisitantes = golsDeVisitantes;
    }

    @Override
    public String toString() {
        return "Partida{" + "timeDaCasa=" + timeDaCasa + ", timeDeVisitante=" + timeDeVisitante + ", golsDaCasa=" + golsDaCasa + ", golsDeVisitantes=" + golsDeVisitantes + '}';
    }

}
