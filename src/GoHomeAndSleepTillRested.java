
public class GoHomeAndSleepTillRested implements State {
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
    public void enter(Character character) {
    }

    @Override
    public void execute(Character character) {
        System.out.println("Bob is now RESTING");
        if (character instanceof Bob) {
            Bob bob = (Bob) character;
            bob.increaseStamina(1);
            if (bob.getStamina() >= bob.getMaxStamina()) {
                bob.changeState(EnterMineDigForNugget.getInstance());
            }
        }
    }

    @Override
    public void exit(Character character) {
        System.out.println("Bob is now RESTED");

    }

}
