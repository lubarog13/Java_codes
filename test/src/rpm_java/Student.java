package rpm_java;

import java.util.Objects;

public class Student extends Human{
    private int level;

    public Student(String firstname, String surname, String patrnymic, GenderEnum genderEnum, int age, int level) {
        super(firstname, surname, patrnymic, genderEnum, age);
        this.level = level;
    }

    @Override
    public void work() {
        System.out.println("Делает лабы");
    }

    @Override
    public void nextYear(){
        super.nextYear();
        level++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return level == student.level;
    }

    @Override
    public int hashCode() {
        return Objects.hash(level);
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", surname='" + surname + '\'' +
                ", patrnymic='" + patrnymic + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", level=" + level +
                '}';
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
