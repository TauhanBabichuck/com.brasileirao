
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
public class man {

    public static void main(String[] args) {
        // Criando jogadores
        Jogador ViniJR = new Jogador("ViniJR", 9, Posicao.ATACANTE);
        Jogador Neuer = new Jogador("Neuer", 1, Posicao.GOLEIRO);
        Jogador Sergio = new Jogador("Sergio Ramos", 3, Posicao.ZAGUEIRO);
        Jogador Aaron = new Jogador("Aaron Wan-Bissaka", 3, Posicao.LATERAL);
        Jogador Kevin = new Jogador("Kevin De Bruyne", 3, Posicao.MEIA);
        Jogador Marcelo = new Jogador("Marcelo Brozović", 3, Posicao.VOLANTE);

        Tecnico tecnicoDoInter = new Tecnico();
        Time internacional = new Time("Internacional", tecnicoDoInter, 0, 0, 0);

        Tecnico tecnicoDoGremio = new Tecnico();
        Time gremio = new Time("Grêmio", tecnicoDoGremio, 0, 0, 0);

        // Adicionando jogadores aos times
        internacional.AdicionarJogador(ViniJR);

        internacional.AdicionarJogador(Neuer);

        internacional.AdicionarJogador(Sergio);

        internacional.AdicionarJogador(Aaron);

        internacional.AdicionarJogador(Kevin);

        internacional.AdicionarJogador(Marcelo);

        gremio.AdicionarJogador(ViniJR);

        gremio.AdicionarJogador(Neuer);

        gremio.AdicionarJogador(Sergio);

        gremio.AdicionarJogador(Aaron);

        gremio.AdicionarJogador(Kevin);

        gremio.AdicionarJogador(Marcelo);

        // Criando partida
        Partida partida = new Partida(gremio, internacional, 0, 0);

        // Imprimindo informações da partida
        System.out.println(
                "Partida: " + partida.getTimeDaCasa().getNome() + " vs " + partida.getTimeDeVisitante().getNome());
        System.out.println(
                "Jogadores do " + partida.getTimeDaCasa().getNome() + ":");
        for (Jogador jogador
                : partida.getTimeDaCasa()
                .getJogadores()) {
            System.out.println(jogador.getNome());
        }

        System.out.println(
                "Jogadores do " + partida.getTimeDeVisitante().getNome() + ":");
        for (Jogador jogador
                : partida.getTimeDeVisitante()
                .getJogadores()) {
            System.out.println(jogador.getNome());
        }
    }
}
