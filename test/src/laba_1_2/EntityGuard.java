package laba_1_2;

import java.util.Comparator;
import java.util.List;

public class EntityGuard extends Entity{

    @Override
    public void update() {
        super.update();
        List<Entity> entities = GameServer.getInstance().getWorld().getEntitiesNearEntity(this, 100);
        entities.removeIf((entity -> !(entity instanceof EntityPlayer)));
        if(entities.size()>0) {
            EntityPlayer entityPlayer = (EntityPlayer) entities.get(0);
            if (entityPlayer.getxPoz() > xPoz) xPoz++;
            else if (entityPlayer.getxPoz() < xPoz) zPoz++;
            if (entityPlayer.getzPoz() > zPoz) zPoz++;
            else if (entityPlayer.getzPoz() < zPoz) zPoz--;
        }
    }

    public EntityGuard(String title, int xPoz, int zPoz, int age, double maxHealth, double health) {
        super(title, xPoz, zPoz, age, maxHealth, health);
    }

    @Override
    public String toString() {
        return "EntityGuard{" +
                "title='" + title + '\'' +
                ", xPoz=" + xPoz +
                ", zPoz=" + zPoz +
                ", age=" + age +
                ", maxHealth=" + maxHealth +
                ", health=" + health +
                '}';
    }
}
