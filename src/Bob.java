import java.util.Scanner;

public class Bob extends Character {

    // BOB ATTRIBUTES
    private int stamina = 10;
    private int maxStamina = 10;
    private int maxThirsty = 10;
    private int thirsty = 10;
    private int coinMax = 10;
    private int coin;
    private int coinpermine = 1;

    // GETTERS
    public int getStamina() {
        return stamina;
    }

    public int getMaxStamina() {
        return maxStamina;
    }

    public int getThirst() {
        return thirsty;
    }

    public int getMaxThirsty() {
        return maxThirsty;
    }

    public int getCoin() {
        return coin;
    }

    public Bob() {
        super();
        changeState(EnterMineDigForNugget.getInstance());
    }

    // COIN
    public void increaseCoinBasedOnBob() {
        increaseCoin(coinpermine);
    }

    public void increaseCoin(int value) {
        coin += value;
    }

    public Boolean isFullOfCoin() {
        return coin >= coinMax;
    }

    public void bankCoins() {
        getBank().storeCoins(coin);
        coin = 0;
    }

    // Thirsty
    public void reduceThirsty(int value) {
        thirsty -= value;
    }

    public void increaseThirsty(int value) {
        thirsty += value;
    }

    public boolean isThirsty() {
        return thirsty <= 0;
    }

    // REST
    public void reduceStamina(int value) {
        stamina -= value;
    }

    public void increaseStamina(int value) {
        stamina += value;
    }

    public boolean isTired() {
        return stamina <= 0;
    }
}
