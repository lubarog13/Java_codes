package laba_1_2;

import java.util.List;

public class EntityPlayer extends Entity{

    private int exp;

    public EntityPlayer(String title, int xPoz, int zPoz, int age, double maxHealth, double health, int exp) {
        super(title, xPoz, zPoz, age, maxHealth, health);
        this.exp = exp;
    }
    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    @Override
    public String toString() {
        return "EntityPlayer{" +
                "title='" + title + '\'' +
                ", xPoz=" + xPoz +
                ", zPoz=" + zPoz +
                ", age=" + age +
                ", maxHealth=" + maxHealth +
                ", health=" + health +
                ", exp=" + exp +
                '}';
    }

    @Override
    public void update() {
        super.update();
        if (GameServer.getInstance().getUpdateCounter()%2==0 && health < maxHealth && health > 0) health++;
    }

    @Override
    public boolean attackEntityFrom(Entity entity, double damage) {
        List<EntityGuard> entityGuards = GameServer.getInstance().getWorld().getGuardiansInRegion(xPoz, zPoz, 2);
        if(entityGuards!=null) {
            entityGuards.removeIf(entityGuard -> entityGuard.getHealth() <= 0);
            if ( entityGuards.size() > 0) {
                for ( EntityGuard entityGuard : entityGuards ) {
                    if (entityGuard.getHealth() > 0) entityGuard.attackEntityFrom(entity, damage / entityGuards.size());
                }
                return true;
            } else {
                super.attackEntityFrom(entity, damage);
                if(health>0){
                    entity.attackEntityFrom(this, calculateDamage());
                    if (entity.getHealth()<=0){
                        exp++;
                    }
                    return true;
                }
                return false;
            }
        } else {
            super.attackEntityFrom(entity, damage);
            if(health>0){
                entity.attackEntityFrom(this, calculateDamage());
                if (entity.getHealth()<=0) {
                    exp++;
                }
                return true;
            }
            System.out.println(entity.getTitle() + " убил " + title);
            return false;
        }
    }

    public double calculateDamage(){
        return 3 + exp * 0.5;
    }
}
