public class BillyGlobalState implements State<Billy> {

    // Begin Singleton:
    private static BillyGlobalState instance = null;

    private BillyGlobalState() {
    }

    public static BillyGlobalState getInstance() {
        if (instance == null) {
            instance = new BillyGlobalState();
        }
        return instance;
    }

    @Override
    public void enter(Billy character) {
        // TODO Auto-generated method stub

    }

    @Override
    public void execute(Billy character) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exit(Billy character) {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean onMessage(Billy c, Message msg) {
        // Verifica se sabe tratar a mensagem:
        if (msg.getMessage().compareTo("GetToWork!") == 0) {
            c.getStateMachine().changeState(FakeWork.getInstance());
            return true;
        } else {
            return false;
        }
    }

}
