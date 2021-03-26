package rpm_java;

import java.util.Arrays;

public class Zoo {
    private String title;
    private EntityLiving[] animals;

    public Zoo(String title, EntityLiving[] animals) {
        this.title = title;
        this.animals = animals;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "title='" + title + '\'' +
                ", animals=" + Arrays.toString(animals) +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public EntityLiving[] getAnimals() {
        return animals;
    }

    public void setAnimals(EntityLiving[] animals) {
        this.animals = animals;
    }

    public int getFlyCount(){
        int sum=0;
        for (int i=0;i<animals.length;i++){
            if (animals[i] instanceof IFlyEntity) sum++;
        }
        return sum;
    }
    public int getPredatorEntityCount(){
        int sum=0;
        for (int i=0;i<animals.length;i++){
            if (animals[i] instanceof IPredator) sum++;
        }
        return sum;
    }
    public int getSoundEntityCount(){
        int sum=0;
        for (int i=0;i<animals.length;i++){
            if (animals[i] instanceof ISoundEntity) sum++;
        }
        return sum;
    }
    public void feedPredators(EntityLiving entity){
        if (entity instanceof IPredator) System.out.println("Это хищник!");
        else {
            for ( int i=0;i<animals.length;i++ ){
                if (animals[i] instanceof IPredator) ((IPredator) animals[i]).hunt(entity);
            }
        }
    }
}
