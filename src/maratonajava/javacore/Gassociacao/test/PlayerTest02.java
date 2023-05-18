package maratonajava.javacore.Gassociacao.test;

import maratonajava.javacore.Gassociacao.domain.Player;
import maratonajava.javacore.Gassociacao.domain.Team;

import java.sql.Time;

public class PlayerTest02 {
    public static void main(String[] args) {
        Player player1 = new Player("Zico");
        Team team = new Team("Seleção Brasileira");

        player1.setTeam(team);

        player1.print();
    }


}
