import java.util.Random;
import java.util.Scanner;

public abstract class Character {
    private String name;

    private Bank bank;

    private Scanner scn;

    private State state;

    private Random rnd;

    private StateMachine stateMachine;

    // BOB ATTRIBUTES
    private int stamina = 10;
    private int maxStamina = 10;
    private int maxThirsty = 10;
    private int thirsty = 10;
    private int coinMax = 10;
    private int coin;
    private int coinpermine = 1;

    public Character(String name) {
        this.name = name;
        bank = new Bank();
        scn = new Scanner(System.in);
        rnd = new Random();
        this.stateMachine = new StateMachine<Character>(this);
    }

    // GETTERS
    public String getName() {
        return this.name;
    }

    public StateMachine getStateMachine() {
        return stateMachine;
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

    public Random getRnd() {
        return rnd;
    }

    public State getState() {
        return state;
    }

    public Bank getBank() {
        return bank;
    }

    public Scanner getScn() {
        return scn;
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
        return stamina != maxStamina;
    }

    //MESSAGES
    public boolean handleMessages(Message msg){
        return stateMachine.handleMessages(msg);
    }
}
