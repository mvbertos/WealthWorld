import java.util.Scanner;

public class Bob extends Character {

    public Bob() {
        super();
        getStateMachine().setCurrentState(EnterMineDigForNugget.getInstance());
        // getStateMachine().setGlobalState();
    }

}
