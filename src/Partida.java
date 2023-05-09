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
  private Time golsDaCasa;
  private Time golsDeVisitantes;

    public Partida(Time timeDaCasa, Time timeDeVisitante, Time golsDaCasa, Time golsDeVisitantes) {
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

    public Time getGolsDaCasa() {
        return golsDaCasa;
    }

    public void setGolsDaCasa(Time golsDaCasa) {
        this.golsDaCasa = golsDaCasa;
    }

    public Time getGolsDeVisitantes() {
        return golsDeVisitantes;
    }

    public void setGolsDeVisitantes(Time golsDeVisitantes) {
        this.golsDeVisitantes = golsDeVisitantes;
    }

    public Partida() {
    }

    @Override
    public String toString() {
        return "Partida{" + "timeDaCasa=" + timeDaCasa + ", timeDeVisitante=" + timeDeVisitante + ", golsDaCasa=" + golsDaCasa + ", golsDeVisitantes=" + golsDeVisitantes + '}';
    }
  
  
}