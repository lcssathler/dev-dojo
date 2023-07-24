package maratonajava.javacore.Xserialization.test;

import maratonajava.javacore.Xserialization.domain.Student;
import maratonajava.javacore.Xserialization.domain.Team;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializationTest01 {
    public static void main(String[] args) {
        Student student = new Student(1L, "Lucas Sathler", "lucassenha123");
        Team team = new Team("Basketball Team");
        student.setTeam(team);
        serialize(student);
        deserialize();
    }

    public static void serialize(Student student) {
        Path path = Paths.get("folder/student.ser");
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
            oos.writeObject(student);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void deserialize() {
        Path path = Paths.get("folder/student.ser");
        try (ObjectInputStream oos = new ObjectInputStream(Files.newInputStream(path))) {
            Object readObject = oos.readObject();
            System.out.println(readObject);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
