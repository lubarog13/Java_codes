package laba_1_2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class World {
    private List<Entity> entities;
    public void updateWorld(){
        for(Entity entity : entities){
            entity.update();
        }
        entities.removeIf((entity -> entity.health<=0));
    }

    public World(List<Entity> entities) {
        this.entities = entities;
    }

    public List<Entity> getEntities() {
        return entities;
    }

    public void setEntities(List<Entity> entities) {
        this.entities = entities;
    }

    public List<Entity> getEntitiesInRegion(int x, int z, double range){
        List<Entity> entities1 = new ArrayList<>(entities);
        entities1.removeIf(entity -> (Math.sqrt(Math.pow(entity.getxPoz() - x, 2) + Math.pow(entity.getzPoz() - z, 2)))>range);
        for ( Entity entity : entities1 ) entity.setRange(x, z);
        entities1.sort(new Comparator<Entity>() {
            @Override
            public int compare(Entity o1, Entity o2) {
                return Double.compare(o1.getRange(),
                        o2.getRange());
            }
        });
        return entities1;
    }
    public List<Entity> getEntitiesNearEntity(Entity entity, double range){
        return getEntitiesInRegion(entity.getxPoz(), entity.getzPoz(), range);
    }

    public List<EntityGuard> getGuardiansInRegion(int x, int z, double range){
        List<Entity> entities1 = new ArrayList<>(entities);
        List<EntityGuard> entityGuards  = new ArrayList<>();
        entities1.removeIf(entity -> (Math.sqrt(Math.pow(entity.getxPoz() - x, 2) + Math.pow(entity.getzPoz() - z, 2)))>range);
        entities1.removeIf(entity -> ! (entity instanceof EntityGuard));
        for ( Entity entity : entities1 ) {
            entity.setRange(x, z);
            entityGuards.add((EntityGuard) entity);
        }
        entityGuards.sort(new Comparator<EntityGuard>() {
            @Override
            public int compare(EntityGuard o1, EntityGuard o2) {
                return Double.compare(o1.getRange(),
                        o2.getRange());
            }
        });
        return  entityGuards;
    }

    @Override
    public String toString() {
        return "World{" +
                "entities=" + entities +
                '}';
    }
}
