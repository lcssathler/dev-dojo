package maratonajava.javacore.Xserialization.domain;

import java.io.*;

public class Student implements Serializable {
    private static final long serialVersionUID = 3454176084247739022L;
    private Long id;
    private String name;
    private static final String SCHOOL_NAME = "Harvard";
    private Team team;
    private transient String password;

    public Student(Long id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", SCHOOL_NAME='" + SCHOOL_NAME + '\'' +
                ", Team='" + team + '\'' +
                '}';
    }

    @Serial
    public  void writeObject (ObjectOutputStream oos) {
        try {
            oos.defaultWriteObject();
            oos.writeUTF(team.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Serial
    public  void readObject (ObjectInputStream oos) {
        try {
            oos.defaultReadObject();
            String teamName = oos.readUTF();
            team = new Team(teamName);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
