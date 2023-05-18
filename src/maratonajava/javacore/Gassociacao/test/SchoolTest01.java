package maratonajava.javacore.Gassociacao.test;

import maratonajava.javacore.Gassociacao.domain.School;
import maratonajava.javacore.Gassociacao.domain.Teacher;

public class SchoolTest01 {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Joseph");
        Teacher teacher2 = new Teacher("Dwayne");
        Teacher teacher3 = new Teacher("Marcus");
        Teacher teacher4 = new Teacher("Jose");
        Teacher [] teachers = {teacher1, teacher2, teacher3, teacher4};
        School school = new School("Havard", teachers);

        school.print();
    }
}
