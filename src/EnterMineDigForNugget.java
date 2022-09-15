import java.util.Random;

public class EnterMineDigForNugget implements State {

    @Override
    public void enter(Bob bob) {

    }

    @Override
    public void execute(Bob bob) {
        Random rnd = new Random();

        // try to get some nugget
        if (rnd.nextInt(2) != 0) {
            System.out.println("Bob dig a nugget");
            bob.increaseCoinBasedOnBob();
            bob.reduceThirsty(1);
            bob.reduceStamina(3);
        } else {
            System.out.println("Bob dig Nothing");
        }

        // check
        if (bob.isFullOfCoin() == true) { // pock is full
            bob.changeState(new VisitBankForGold());
        } else if (bob.getThirst() <= 0) { // is thirsty
            bob.changeState(new QuenchyThirsty());
        } else if (bob.getStamina() <= 0) {
            bob.changeState(new GoHomeAndSleepTillRested());
        }
    }

    @Override
    public void exit(Bob bob) {
        System.out.println("Bob digged enough");
    }
}
