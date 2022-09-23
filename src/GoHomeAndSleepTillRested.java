
public class GoHomeAndSleepTillRested implements State<Bob> {
    private static GoHomeAndSleepTillRested instance;

    private GoHomeAndSleepTillRested() {

    }

    public static GoHomeAndSleepTillRested getInstance() {
        if (instance == null) {
            instance = new GoHomeAndSleepTillRested();
        }
        return instance;
    }

    @Override
    public void enter(Bob character) {
    }

    @Override
    public void execute(Bob character) {
        System.out.println("Bob is now RESTING");
        character.increaseStamina(1);
        if (character.getStamina() >= character.getMaxStamina()) {
            character.getStateMachine().changeState(EnterMineDigForNugget.getInstance());
        }
    }

    @Override
    public void exit(Bob character) {
        System.out.println("Bob is now RESTED");

    }

}
