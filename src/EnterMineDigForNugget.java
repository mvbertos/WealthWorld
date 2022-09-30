public class EnterMineDigForNugget implements State<Bob> {

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
    public void execute(Bob character) {

        // try to get some nugget
        if (character.getRnd().nextInt(2) != 0) {
            System.out.println("Bob dig a nugget");
            character.increaseCoinBasedOnBob();
            character.reduceThirsty(1);
            character.reduceStamina(3);
        } else {
            System.out.println("Bob dig Nothing");
        }

        // check
        if (character.isFullOfCoin() == true) { // pock is full
            character.getStateMachine().changeState(VisitBankForGold.getInstance());
        } else if (character.isThirsty()) { // is thirsty
            character.getStateMachine().changeState(QuenchyThirsty.getInstance());
        } else if (character.isTired()) {
            character.getStateMachine().changeState(GoHomeAndSleepTillRested.getInstance());
        }

    }

    @Override
    public void exit(Bob bob) {
        System.out.println("Bob digged enough");
    }

    @Override
    public boolean onMessage(Bob c, Message msg) {
        // TODO Auto-generated method stub
        return false;
    }
}
