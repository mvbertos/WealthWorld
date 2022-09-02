public class EnterMineDigForNugget implements State {

    @Override
    public void enter(Bob bob) {

    }

    @Override
    public void execute(Bob bob) {
        System.out.println("Bob went to the mine and dig nugget");

    }

    @Override
    public void exit(Bob bob) {
        bob.changeState(new QuenchyThirsty());
    }
}
