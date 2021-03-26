package laba_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class World {
    private int id;
    private String worldName;
    private List<Entity> entities;

    public World(int id, String worldName, List<Entity> entities) {
        this.id = id;
        this.worldName = worldName;
        this.entities = entities;
    }

    @Override
    public String toString() {
        return "World{" +
                "id=" + id +
                ", worldName='" + worldName + '\'' +
                ", entities=" + entities +
                '}';
    }
    public void update(){
        for(Entity entity : entities) {
            entity.update();
        }
        entities.removeIf(entity -> !entity.isAlive());
    }
    public List<Entity> getEntitiesInRegion(double x, double z, double range) {
        List<Entity> entities1 = new ArrayList<>(entities);
        entities1.removeIf(entity -> (Math.sqrt(Math.pow(entity.getPosX() - x, 2) + Math.pow(entity.getPosZ() - z, 2)))>range);
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
        List <Entity> entities1 = getEntitiesInRegion(entity.getPosX(), entity.getPosZ(), range);
        return entities1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWorldName() {
        return worldName;
    }

    public void setWorldName(String worldName) {
        this.worldName = worldName;
    }

    public List<Entity> getEntities() {
        return entities;
    }

    public void setEntities(List<Entity> entities) {
        this.entities = entities;
    }
}
