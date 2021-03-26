package rpm_java;

import java.util.Objects;

public abstract class Human {
    protected String firstname;
    protected String surname;
    protected String patrnymic;
    protected GenderEnum gender;
    protected int age;
    public abstract void work();
    public Human(String firstname, String surname, String patrnymic, GenderEnum gender, int age) {
        this.firstname = firstname;
        this.surname = surname;
        this.patrnymic = patrnymic;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age && Objects.equals(firstname, human.firstname) && Objects.equals(surname, human.surname) && Objects.equals(patrnymic, human.patrnymic) && gender == human.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, surname, patrnymic, gender, age);
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstname='" + firstname + '\'' +
                ", surname='" + surname + '\'' +
                ", patrnymic='" + patrnymic + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }

    public GenderEnum getGender() {
        return gender;
    }

    public void setGender(GenderEnum gender) {
        this.gender = gender;
    }

    public void nextYear(){
        age++;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatrnymic() {
        return patrnymic;
    }

    public void setPatrnymic(String patrnymic) {
        this.patrnymic = patrnymic;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
