package laba_1;

public class EntityPlayer extends Entity{
    private String nickname;

    public EntityPlayer(String title, double posX, double posZ, int maxHealth, int health, int attackDamage, String nickname) {
        super(title, posX, posZ, false, maxHealth, health, attackDamage);
        this.nickname=nickname;
    }
    public void update(){
        super.update();
        if (GameServer.getInstance().getUpdater()%2==0){
            if(health<maxHealth){
                health++;
            }
        }
    }
    @Override
    public String toString() {
        return "EntityPlayer{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", posX=" + posX +
                ", posZ=" + posZ +
                ", agressive=" + agressive +
                ", maxHealth=" + maxHealth +
                ", health=" + health +
                ", attackDamage=" + attackDamage +
                ", nickname='" + nickname + '\'' +
                '}';
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
