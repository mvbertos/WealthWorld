
public class GoHomeAndSleepTillRested implements State<Bob> {
    private static GoHomeAndSleepTillRested instance;

    private GoHomeAndSleepTillRested() {

    }

    public static GoHomeAndSleepTillRested getInstance() {
        if (instance == null) {
            instance = new GoHomeAndSleepTillRested();
        }
        return instance;
    }

    @Override
    public void enter(Bob bob) {
        bob.setBillyWorked(false);
        Character billy = CharacterManager.getInstance().getCharacter("Billy");
        System.out.println("Bob went back to his house to rest and billy still have work to do!!");
        MessageDispatcher.getInstance().dispatchMessage(bob, billy, "GetToWork!", null);
    }

    @Override
    public void execute(Bob bob) {
        bob.increaseStamina(1);

        // Verifica se o billy trabalhou E se ele ja descansou:
        if (bob.getBillyWorked() && !bob.isTired()) {
            bob.getStateMachine().changeState(EnterMineDigForNugget.getInstance());
        } else if (!bob.isTired()) {
            System.out.println("Bob is waiting for his Lazy brother to finish his work...");
        } else {
            System.out.println("Bob is now RESTING");
        }
    }

    @Override
    public void exit(Bob character) {
        System.out.println("Bob is now RESTED");

    }

    @Override
    public boolean onMessage(Bob c, Message msg) {
        // TODO Auto-generated method stub
        return false;
    }

}
