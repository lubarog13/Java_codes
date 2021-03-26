package laba_1;

import java.util.ArrayList;
import java.util.Arrays;

public class GameServer {
    private String id;
    private int difficulty=1;
    private int updater=0;
    private static GameServer instance;
    private World serverWorld;
    public static void main(String[] args){
        new GameServer();
    }
    public GameServer() {
        instance = this;
        Entity[] entities = new Entity[7];
        entities[0]= new Entity("Dragon", 20, 15, true, 50, 50, 20);
        entities[1]=new Entity("Wolf", 40, 50, true, 30, 30, 10);
        entities[2] = new EntityPlayer("Me", 30, 25,50, 45, 20, "hello");
        entities[3] = new Entity("Cow", 41, 10, false, 20, 20, 0);
        entities[4] = new Entity("Cow", 27, 35, false, 20, 20, 0);
        entities[5] = new Entity("Cow", 40, 37, false, 20, 20, 0);
        entities[6] = new EntityPlayer("Anouther", 20, 20,50, 40, 25, "cool");
        this.serverWorld = new World(1, "Hello, world", new ArrayList<>(Arrays.asList(entities)));
        for ( int i = 0; i < 30; i++ ) {
            updater++;
            this.serverWorld.update();
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
                "id='" + id + '\'' +
                ", difficulty=" + difficulty +
                ", updater=" + updater +
                ", serverWorld=" + serverWorld +
                '}';
    }

    public int getUpdater() {
        return updater;
    }

    public void setUpdater(int updater) {
        this.updater = updater;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public World getServerWorld() {
        return serverWorld;
    }

    public void setServerWorld(World serverWorld) {
        this.serverWorld = serverWorld;
    }

    public static GameServer getInstance() {
        return instance;
    }

    public static void setInstance(GameServer instance) {
        GameServer.instance = instance;
    }


}
