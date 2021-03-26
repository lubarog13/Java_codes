package rpm_java;

import java.util.Arrays;
import java.util.List;

public class School extends Building{
    private int index;
    private String title;
    private List<Teacher> teachers;
    private List<Student> students;

    public School(String address, int floorCount, int index, String title, List<Teacher> teachers, List<Student> students) {
        super(address, floorCount);
        this.index=index;
        this.title=title;
        this.students=students;
        this.teachers=teachers;
    }
    public boolean addEntity(Human human){
        if(human instanceof Teacher){
            teachers.add((Teacher) human);
            return true;
        }
        else if(human instanceof Student){
            students.add((Student) human);
            return true;
        }
        else System.out.println("not a school entity "+ human);
        return false;
    }

    @Override
    public BuildingTypeEnum getBuildingType() {
        return BuildingTypeEnum.SOCIAL;
    }
    public void workAll(){
        for(int i=0;i<students.size();i++){
            students.get(i).work();
        }
        for(int i=0;i<teachers.size();i++){
            teachers.get(i).work();
        }
    }
    public int nextYearAll(){
        int count=0;
        for(int i=0;i<teachers.size();i++){
            teachers.get(i).nextYear();
            if(teachers.get(i).getAge()>65){
                System.out.println(teachers.get(i).firstname +" Вышел на пенсию");
                count++;
            }
            teachers.removeIf(teacher -> teacher.getAge()>65);
        }
        for(int i=0;i<students.size();i++){
            students.get(i).nextYear();
            if(students.get(i).getLevel()>5){
                System.out.println(teachers.get(i).firstname + " Закончил университет");
                count++;
            }
            students.removeIf(student -> student.getLevel()>5);
        }
        return count;

    }

    @Override
    public String toString() {
        return "School{" +
                "address='" + address + '\'' +
                ", floorCount=" + floorCount +
                ", index=" + index +
                ", title='" + title + '\'' +
                ", teachers=" + teachers +
                ", students=" + students +
                '}';
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
