import java.util.Random;
import java.util.Scanner;

public abstract class Character {
    private Bank bank;

    private Scanner scn;

    private State state;

    private Random rnd;

    public Character() {
        bank = new Bank();
        scn = new Scanner(System.in);
        rnd = new Random();
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

    public void changeState(State state) {
        if (this.state != null) {
            this.state.exit(this);
        }

        this.state = state;
        state.enter(this);
    }
}
