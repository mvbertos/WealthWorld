public class QuenchyThirsty implements State {
    private static QuenchyThirsty instance;

    private QuenchyThirsty() {

    }

    public static QuenchyThirsty getInstance() {
        if (instance == null) {
            instance = new QuenchyThirsty();
        }
        return instance;
    }

    @Override
    public void enter(Bob bob) {

    }

    @Override
    public void execute(Bob bob) {
        System.out.println("Drank and feel better");
        bob.increaseThirsty(2);

        if (bob.getThirst() >= bob.getMaxThirsty()) {
            bob.changeState(EnterMineDigForNugget.getInstance());
        }
    }

    @Override
    public void exit(Bob bob) {
    }
}
