public class QuenchyThirsty implements State{
    @Override
    public void enter(Bob bob) {

    }

    @Override
    public void execute(Bob bob) {
        System.out.print("Drank a lot");

    }

    @Override
    public void exit(Bob bob) {
        bob.changeState(new EnterMineDigForNugget());
    }
}
