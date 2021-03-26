package rpm_java;

public class Solovey extends EntityLiving implements ISoundEntity, IFlyEntity{
    private double maxFlyHeight;
    private double maxFlyTime;
    private String sound;
    public Solovey(double maxFlyHeigh, double maxFlyTime, String sound) {
        super("Соловей", "птица");
        this.maxFlyHeight = maxFlyHeigh;
        this.maxFlyTime=maxFlyTime;
        this.sound = sound;
    }

    @Override
    public double getMaxFlightHeight() {
        return maxFlyHeight;
    }

    @Override
    public String getSound() {
        return sound;
    }

    @Override
    public String toString() {
        return "Solovey{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", maxFlyHeigh=" + maxFlyHeight +
                ", maxFlyTime=" + maxFlyTime +
                '}';
    }

    public void setMaxFlyHeigh(double maxFlyHeigh) {
        this.maxFlyHeight = maxFlyHeigh;
    }

    @Override
    public double getMaxFlyTime() {
        return maxFlyTime;
    }

    public void setMaxFlyTime(double maxFlyTime) {
        this.maxFlyTime = maxFlyTime;
    }
}
