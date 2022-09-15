public class VisitBankForGold implements State {

    @Override
    public void enter(Bob bob) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void execute(Bob bob) {
        System.out.println("Bob whent to the bank and stored all his coins");
        bob.bankCoins();
        bob.changeState(new EnterMineDigForNugget());
    }

    @Override
    public void exit(Bob bob) {
        // TODO Auto-generated method stub
        
    }  
}
