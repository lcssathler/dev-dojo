package maratonajava.javacore.Gassociacao.domain;

public class School {
    private String nameSchool;
    private Teacher [] teachers;

    public School(String nameSchool) {
        this.nameSchool = nameSchool;
    }

    public School(String nameSchool, Teacher[] teachers) {
        this.nameSchool = nameSchool;
        this.teachers = teachers;
    }

    public void print() {
        System.out.println("School Name: " + this.nameSchool);
        if (teachers == null) {
            return;
        }
        for (int i = 0; i < teachers.length; i++) {
            System.out.println(i + 1 + "º teacher: " + teachers[i].getName());
        }
    }

    public String getNameSchool() {
        return nameSchool;
    }

    public void setNameSchool(String nameSchool) {
        this.nameSchool = nameSchool;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }
}
