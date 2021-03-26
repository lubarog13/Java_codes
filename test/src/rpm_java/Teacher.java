package rpm_java;

import java.util.Arrays;
import java.util.Objects;

public class Teacher extends Human{
    private String subject;
    private int exp;

    public Teacher(String firstname, String surname, String patrnymic, GenderEnum genderEnum, int age, String subject, int exp) {
        super(firstname, surname, patrnymic, genderEnum, age);
        this.subject = subject;
        this.exp = exp;
    }

    @Override
    public void work() {
        System.out.println("Учит людей");
    }

    @Override
    public void nextYear(){
        super.nextYear();
        exp++;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "firstname='" + firstname + '\'' +
                ", surname='" + surname + '\'' +
                ", patrnymic='" + patrnymic + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", subject='" + subject + '\'' +
                ", exp=" + exp +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Teacher teacher = (Teacher) o;
        return exp == teacher.exp && Objects.equals(subject, teacher.subject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), subject, exp);
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }
}
