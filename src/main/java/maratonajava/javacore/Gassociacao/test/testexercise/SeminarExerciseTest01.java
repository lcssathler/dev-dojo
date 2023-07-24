package maratonajava.javacore.Gassociacao.test.testexercise;

import maratonajava.javacore.Gassociacao.domain.domainexercise.Location;
import maratonajava.javacore.Gassociacao.domain.domainexercise.Seminar;
import maratonajava.javacore.Gassociacao.domain.domainexercise.Student;
import maratonajava.javacore.Gassociacao.domain.domainexercise.Teacher;

public class SeminarExerciseTest01 {
    public static void main(String[] args) {
        Location location = new Location("Rua das Maringás, 457");
        Student student1 = new Student("José", 18);
        Student student2 = new Student("Carlos", 21);
        Student student3 = new Student("Maria", 33);
        Student [] students = {student1, student2, student3};
        Teacher teacher1 =  new Teacher("Angelina", "Math");
        Teacher teacher2 =  new Teacher("Andrew", "Physic");
        Teacher [] teachers = {teacher1, teacher2};
        Seminar seminar1 = new Seminar("The NASA's Math", location, teacher1, students);
        Seminar seminar2 = new Seminar(" Computer Engineering", location, teacher2,new Student[]{student1, student2});
        Seminar [] seminars = {seminar1, seminar2};
        teacher1.setSeminars(new Seminar[]{seminar1});
        teacher2.setSeminars(new Seminar[]{seminar2});



        for (Seminar seminar : seminars) {
            seminar.printSeminar();
        }

        for (Teacher teacher : teachers) {
            teacher.printTeacher();
        }

    }




}
