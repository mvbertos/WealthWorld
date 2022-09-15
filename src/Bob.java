import java.util.Scanner;

public class Bob {
    private Bank bank;
    private Scanner scn;
    private State state;

    // BOB ATTRIBUTES
    private int stamina = 10;
    private int maxStamina = 10;
    private int maxThirsty = 10;
    private int thirsty = 10;
    private int coinMax = 10;
    private int coin;
    private int coinpermine = 1;

    // GETTERS

    public State getState() {
        return state;
    }

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

    public void CallBob() {
        System.out.println("Hello World");
    }

    public Bob() {
        bank = new Bank();
        scn = new Scanner(System.in);
        state = new EnterMineDigForNugget();
    }

    public void changeState(State state) {
        this.state.exit(this);
        this.state = state;
        this.state.enter(this);
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
        bank.storeCoins(coin);
        coin = 0;
    }

    // WEALTH
    public void reduceThirsty(int value) {
        thirsty -= value;
    }

    public void increaseThirsty(int value) {
        thirsty += value;
    }

    // REST
    public void reduceStamina(int value) {
        stamina -= value;
    }

    public void increaseStamina(int value) {
        stamina += value;
    }
}
