public class QuenchyThirsty implements State {
    @Override
    public void enter(Bob bob) {

    }

    @Override
    public void execute(Bob bob) {
        System.out.println("Drank and feel better");
        bob.increaseThirsty(2);

        if (bob.getThirst() >= bob.getMaxThirsty()) {
            bob.changeState(new EnterMineDigForNugget());
        }
    }

    @Override
    public void exit(Bob bob) {
    }
}
