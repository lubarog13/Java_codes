package rpm_java;

public interface IPredator {
    public default void hunt(EntityLiving entity){
        System.out.println(((EntityLiving) this).title + " ест " + entity.title);
    }
}
