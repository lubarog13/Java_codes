package laba_1_2;

public abstract class Entity {
    protected String title;
    protected int xPoz;
    protected int zPoz;
    protected int age;
    protected double maxHealth;
    protected double health;
    protected Double range;
    public void update(){age++;}
    public  boolean attackEntityFrom(Entity entity, double damage){
        health -=damage;
        if(health<=0) System.out.println(entity.getTitle() + " убил " + title);
        return health <= 0;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Entity(String title, int xPoz, int zPoz, int age, double maxHealth, double health) {
        this.title = title;
        this.xPoz = xPoz;
        this.zPoz = zPoz;
        this.age = age;
        this.maxHealth = maxHealth;
        this.health = health;
    }

    public int getxPoz() {
        return xPoz;
    }

    public void setxPoz(int xPoz) {
        this.xPoz = xPoz;
    }

    public int getzPoz() {
        return zPoz;
    }

    public void setzPoz(int zPoz) {
        this.zPoz = zPoz;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(double maxHealth) {
        this.maxHealth = maxHealth;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public Double getRange() {
        return range;
    }

    public void setRange(int x, int y) {
        this.range =  Math.sqrt(Math.pow(xPoz - x, 2) + Math.pow(xPoz - y, 2));
    }
}
