import java.util.Scanner;

public class Bob {
    private Bank bank;
    private Scanner scn;
    private State state;

    //BOB ATTRIBUTES
    private int stamina;
    private int wealth;
    private int thirst;


    public State getState() {
        return state;
    }
    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getWealth() {
        return wealth;
    }

    public void setWealth(int wealth) {
        this.wealth = wealth;
    }

    public int getThirst() {
        return thirst;
    }

    public void setThirst(int thirst) {
        this.thirst = thirst;
    }

    public void CallBob(){
        System.out.println("Hello World");
    }

    public Bob() {
        this.stamina = 0;
        this.wealth = 0;
        this.thirst = 0;
        bank = new Bank();
        scn = new Scanner(System.in);
        state = new EnterMineDigForNugget();
    }

    public void changeState(State state){
        this.state.exit(this);
        this.state = state;
        this.state.enter(this);
    }
}
