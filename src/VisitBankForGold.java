public class VisitBankForGold implements State {

    private static VisitBankForGold instance;

    private VisitBankForGold() {

    }

    public static VisitBankForGold getInstance() {
        if (instance == null) {
            instance = new VisitBankForGold();
        }
        return instance;
    }

    @Override
    public void enter(Bob bob) {
        // TODO Auto-generated method stub

    }

    @Override
    public void execute(Bob bob) {
        System.out.println("Bob whent to the bank and stored all his coins");
        bob.bankCoins();
        bob.changeState(EnterMineDigForNugget.getInstance());
    }

    @Override
    public void exit(Bob bob) {
        // TODO Auto-generated method stub

    }
}
