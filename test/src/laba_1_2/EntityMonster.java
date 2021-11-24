package laba_1_2;

import java.util.List;

public class EntityMonster extends Entity{
    private double damage;

    public EntityMonster(String title, int xPoz, int zPoz, int age, double maxHealth, double health, double damage) {
        super(title, xPoz, zPoz, age, maxHealth, health);
        this.damage = damage;
    }

    @Override
    public void update() {
        super.update();
        List<Entity> entities = GameServer.getInstance().getWorld().getEntitiesNearEntity(this, 100);
        entities.removeIf((entity -> !(entity instanceof EntityPlayer)));
        if(entities.size()>0) {
            EntityPlayer entityPlayer = (EntityPlayer) entities.get(0);
            entities.removeIf(entity -> (Math.sqrt(Math.pow(entity.getxPoz() - xPoz, 2) + Math.pow(entity.getzPoz() - zPoz, 2))) > 2);
            if (entityPlayer.getxPoz() > xPoz) xPoz++;
            else if (entityPlayer.getxPoz() < xPoz) xPoz--;
            if (entityPlayer.getzPoz() > zPoz) zPoz++;
            else if (entityPlayer.getzPoz() < zPoz) zPoz--;
            for ( Entity player : entities ) {
                if (player.health > 0) {
                    EntityPlayer player1 = (EntityPlayer) player;
                    player1.attackEntityFrom(this, damage);
                }
            }
        }
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "EntityMonster{" +
                "title='" + title + '\'' +
                ", xPoz=" + xPoz +
                ", zPoz=" + zPoz +
                ", age=" + age +
                ", maxHealth=" + maxHealth +
                ", health=" + health +
                ", damage=" + damage +
                '}';
    }
}
