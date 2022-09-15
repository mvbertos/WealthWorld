
public class GoHomeAndSleepTillRested implements State {
    private static GoHomeAndSleepTillRested instance;

    private GoHomeAndSleepTillRested() {

    }

    public static GoHomeAndSleepTillRested getInstance() {
        if(instance == null){
            instance = new GoHomeAndSleepTillRested();
        }
        return instance;
    }

    @Override
    public void enter(Bob bob) {
    }

    @Override
    public void execute(Bob bob) {
        System.out.println("Bob is now RESTING");
        bob.increaseStamina(1);
        if (bob.getStamina() >= bob.getMaxStamina()) {
            bob.changeState(EnterMineDigForNugget.getInstance());
        }
    }

    @Override
    public void exit(Bob bob) {
        System.out.println("Bob is now RESTED");

    }

}
