public class BobGlobalState implements State<Bob> {

    // Begin Singleton:
    private static BobGlobalState instance = null;

    private BobGlobalState() {
    }

    public static BobGlobalState getInstance() {
        if (instance == null) {
            instance = new BobGlobalState();
        }
        return instance;
    }

    @Override
    public void enter(Bob character) {
        // TODO Auto-generated method stub

    }

    @Override
    public void execute(Bob character) {
        int rand = character.getRnd().nextInt(100);
        if (rand == 1) {
            character.getStateMachine().changeState(VisitBathroom.getInstance());
        }
    }

    @Override
    public void exit(Bob character) {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean onMessage(Bob c, Message msg) {
        if (msg.getMessage().compareToIgnoreCase("JobsDone!") == 0) {
            c.setBillyWorked(true);
            return true;
        } else {
            return false;
        }

    }

}
