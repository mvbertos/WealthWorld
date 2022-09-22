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
    public void enter(Character character) {
        // TODO Auto-generated method stub

    }

    @Override
    public void execute(Character character) {

        System.out.println("Bob whent to the bank and stored all his coins");

        if (character instanceof Bob) {
            Bob bob = (Bob) character;
            bob.bankCoins();
        }
        
        character.changeState(EnterMineDigForNugget.getInstance());
    }

    @Override
    public void exit(Character character) {
        // TODO Auto-generated method stub

    }
}
