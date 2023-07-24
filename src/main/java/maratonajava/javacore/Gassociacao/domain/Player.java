package maratonajava.javacore.Gassociacao.domain;

public class Player {
    private String name;
    private Team team;

    public Player(String name) {
        this.name = name;
    }

    public void print() {
        System.out.print(this.name + " ");
        if (team == null) {
            return;
        }
        System.out.println(team.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
