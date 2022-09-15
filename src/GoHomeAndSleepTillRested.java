
public class GoHomeAndSleepTillRested implements State {

    @Override
    public void enter(Bob bob) {
    }

    @Override
    public void execute(Bob bob) {
        System.out.println("Bob is now RESTING");
        bob.increaseStamina(1);
        if (bob.getStamina() >= bob.getMaxStamina()) {
            bob.changeState(new EnterMineDigForNugget());
        }
    }

    @Override
    public void exit(Bob bob) {
        System.out.println("Bob is now RESTED");

    }

}
