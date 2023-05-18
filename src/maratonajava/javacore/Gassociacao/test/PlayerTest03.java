package maratonajava.javacore.Gassociacao.test;

import maratonajava.javacore.Gassociacao.domain.Player;
import maratonajava.javacore.Gassociacao.domain.Team;

public class PlayerTest03 {
    public static void main(String[] args) {
        Team team = new Team("Real Madrid");
        Player player1 = new Player("Lavezzi");
        Player player2 = new Player("Ozil");
        Player player3 = new Player("Ibra");
        Player [] players = {player1, player2, player3};

        System.out.println("----- PLAYERS -----");
        System.out.println("Dentro da classe Player");
        for (Player player : players) {
            player.setTeam(team);
            player.print();
        }

        System.out.println("----- TEAMS -----");
        System.out.println("Dentro da classe Teams");
        team.setPlayers(players);
        team.print();




    }
}
