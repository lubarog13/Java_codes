package rpm_java;

public class Animal {
    private String title;
    private String type;
    private int legCount;
    private int age;
    private boolean hunter;
    public Animal (String title, String type, int legCount, int age, boolean hunter){
        this.title = title;
        this.type = type;
        this.legCount = legCount;
        this.age = age;
        this.hunter = hunter;
    }
    public Animal(String title, String type){
        this(title, type, 4, 1, false);
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public int getLegCount() {
        return legCount;
    }

    public int getAge() {
        return age;
    }
    public boolean getHunter(){
        return hunter;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setLegCount(int legCount) {
        this.legCount = legCount;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHunter(boolean hunter) {
        this.hunter = hunter;
    }

    @Override
    public String toString() {
        return title + " " + type + " " + legCount + " " + age + " " + hunter;
    }
}
