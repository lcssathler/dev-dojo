package maratonajava.javacore.ZZKjunit.domain;

public class Developer extends Employee {
    private String mainProgrammingLanguage;

    public Developer(Integer id, String mainProgrammingLanguage) {
        super(id);
        this.mainProgrammingLanguage = mainProgrammingLanguage;
    }

    public String getMainProgrammingLanguage() {
        return mainProgrammingLanguage;
    }

    public void setMainProgrammingLanguage(String mainProgrammingLanguage) {
        this.mainProgrammingLanguage = mainProgrammingLanguage;
    }
}
