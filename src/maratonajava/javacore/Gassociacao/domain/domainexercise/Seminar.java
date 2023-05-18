package maratonajava.javacore.Gassociacao.domain.domainexercise;

public class Seminar {
    private String title;
    private Student[] students;
    private Location location;
    private Teacher teacher;

    public Location getLocation() {
        return location;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public Seminar (String title, Location location, Teacher teacher) {
        this.title = title;
        this.location = location;
        this.teacher = teacher;
    }

    public Seminar(String title, Location location, Teacher teacher, Student[] students) {
        this.title = title;
        this.students = students;
        this.teacher = teacher;
        this.location = location;
    }

    public Student[] getStudents() {
        return students;
    }

    public void printSeminar () {
        System.out.println("----- " + this.getTitle() + " -----");

        System.out.println("Seminar Teacher: " + teacher.getName());
        System.out.println("Teacher's Speciality: " + teacher.getSpeciality());

        System.out.println("Location: " + location.getAddress());

        if (students != null) {
            for (Student student : students) {
                System.out.println(" * " + student.getName() + " - " + (int)student.getAge() + " years old");
            }
        }
        System.out.println("");
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
