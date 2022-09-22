public class QuenchyThirsty implements State<Bob> {
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
    public void enter(Bob character) {

    }

    @Override
    public void execute(Bob character) {
        System.out.println("Drank and feel better");
        if (character instanceof Bob) {
            Bob bob = (Bob) character;
            bob.increaseThirsty(2);

            if (bob.getThirst() >= bob.getMaxThirsty()) {
                bob.changeState(EnterMineDigForNugget.getInstance());
            }
        }
    }

    @Override
    public void exit(Bob character) {
    }
}
