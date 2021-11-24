package laba_1_2;

import java.util.ArrayList;
import java.util.List;

public class GameServer {

    private static GameServer instance;
    private World world;
    private int updateCounter;
    public void updateServer(){
        updateCounter++;
        world.updateWorld();
    }
    public static void main(String[] args){
        new GameServer();
    }
    public GameServer() {
        instance = this;
        List<Entity> entities = new ArrayList<>();
        entities.add(new EntityPlayer("Me", 10, 10, 0, 100, 100, 0));
        entities.add(new EntityPlayer("Anouther", 20, 14, 10, 100, 50, 20));
        entities.add(new EntityGuard("Cow", 13, 16, 10, 30, 30));
        entities.add(new EntityGuard("Elf", 16, 20, 100, 90, 50));
        entities.add(new EntityGuard("Bird", 5, 5, 3, 20, 20));
        entities.add(new EntityMonster("Dragon", 20, 20, 100, 100, 100, 20));
        entities.add(new EntityMonster("Wolf", 15, 20, 9, 40, 30, 10));
        world = new World(entities);
        for ( int i = 0; i < 30; i++ ) {
            updateServer();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(instance);
        }
    }

    @Override
    public String toString() {
        return "GameServer{" +
                "world=" + world +
                ", updateCounter=" + updateCounter +
                '}';
    }

    public static GameServer getInstance() {
        return instance;
    }

    public static void setInstance(GameServer instance) {
        GameServer.instance = instance;
    }

    public World getWorld() {
        return world;
    }

    public void setWorld(World world) {
        this.world = world;
    }

    public int getUpdateCounter() {
        return updateCounter;
    }

    public void setUpdateCounter(int updateCounter) {
        this.updateCounter = updateCounter;
    }
}
