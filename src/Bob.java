import java.util.Scanner;

public class Bob extends Character {

    public Bob() {
        super("Bob");
        getStateMachine().setCurrentState(EnterMineDigForNugget.getInstance());
        // getStateMachine().setGlobalState();
    }

}
