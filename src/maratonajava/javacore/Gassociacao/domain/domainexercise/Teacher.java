package maratonajava.javacore.Gassociacao.domain.domainexercise;

public class Teacher {
    private String name;
    private String speciality;
    private Seminar [] seminars;

    public Teacher(String name, String speciality) {
        this.name = name;
        this.speciality = speciality;
    }

    public void setSeminars(Seminar[] seminars) {
        this.seminars = seminars;
    }

    public  void printTeacher () {
        System.out.println("-=-=-=-=-=-=-=-=-=-=");
        System.out.println("## About " + this.name + " ##");

        System.out.println("Teacher's Speciality: " + this.speciality);

        if (seminars != null) {
            System.out.print("Seminars Given:");
            for (Seminar seminar : seminars) {
                if (this.name == seminar.getTeacher().getName()) {
                    System.out.println(seminar.getTitle());
                }

                if (seminar.getLocation() != null) {
                    System.out.println(("Location: " + seminar.getLocation().getAddress()));
                }

                if (seminar.getStudents() == null) {
                    continue;
                }
                System.out.println("Enrolleds Students: ");
                for (Student student : seminar.getStudents()) {
                    System.out.println(" * " + student.getName());
                }
                System.out.println();
            }

        }
    }

    public String getName() {
        return name;
    }

    public String getSpeciality() {
        return speciality;
    }
}
