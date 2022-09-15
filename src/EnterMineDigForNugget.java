import java.util.Random;

public class EnterMineDigForNugget implements State {

    private static EnterMineDigForNugget instance = null;

    private EnterMineDigForNugget() {

    }

    public static EnterMineDigForNugget getInstance() {
        if (instance == null) {
            instance = new EnterMineDigForNugget();
        }
        return instance;
    }

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
            bob.changeState(VisitBankForGold.getInstance());
        } else if (bob.isThirsty()) { // is thirsty
            bob.changeState(QuenchyThirsty.getInstance());
        } else if (bob.isTired()) {
            bob.changeState(GoHomeAndSleepTillRested.getInstance());
        }
    }

    @Override
    public void exit(Bob bob) {
        System.out.println("Bob digged enough");
    }
}
