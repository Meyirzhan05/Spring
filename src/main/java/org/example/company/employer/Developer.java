package org.example.company.employer;

public class Developer extends Employer<ITRole> {
    private String language;
    public Developer(String name, int age, String language) {
        super(name, age, ITRole.Developer);
        this.language = language;
    }
    public void work() {
        writeCode();
    }
    public void writeCode() {
        System.out.println(this.getName() + " is writing " + this.language + " coding");
    }
}
