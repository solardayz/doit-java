package chapter09.game;

public class Player {
    private PlayerLevel playerLevel;

    public Player() {
        this.playerLevel = new BeginnerLevel();
        playerLevel.showLevelMsg();
    }

    public PlayerLevel getLevel(){
        return playerLevel;
    }

    public void upgradeLevel(PlayerLevel playerLevel) {
        this.playerLevel = playerLevel;
        playerLevel.showLevelMsg();
    }
    public void play(int count){
        playerLevel.go(count);
    }
}
