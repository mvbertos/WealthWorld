public class VisitBankForGold implements State<Bob> {

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
    public void enter(Bob character) {
        // TODO Auto-generated method stub

    }

    @Override
    public void execute(Bob character) {

        System.out.println("Bob whent to the bank and stored all his coins");

        character.bankCoins();
        character.getStateMachine().changeState(EnterMineDigForNugget.getInstance());
    }

    @Override
    public void exit(Bob character) {
        // TODO Auto-generated method stub

    }
}
