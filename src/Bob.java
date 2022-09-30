import java.util.Scanner;

public class Bob extends Character {
    private boolean billyWorked = false;

    public boolean getBillyWorked() {
        return billyWorked;
    }

    public void setBillyWorked(boolean billyWorked) {
        this.billyWorked = billyWorked;
    }

    public Bob() {
        super("Bob");
        getStateMachine().setCurrentState(EnterMineDigForNugget.getInstance());
        getStateMachine().setGlobalState(BobGlobalState.getInstance());
    }

}
