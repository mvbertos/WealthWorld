public class VisitBathroom implements State<Bob> {
    // Begin Singleton:
    private static VisitBathroom instance = null;

    private VisitBathroom() {
    }

    public static VisitBathroom getInstance() {
        if (instance == null) {
            instance = new VisitBathroom();
        }
        return instance;
    }

    @Override
    // End Singleton:
    public void execute(Bob bob) {
        System.out.println("Bathroom time!");
        bob.getStateMachine().revertToPreviousState();
    }

    @Override
    public void enter(Bob character) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exit(Bob character) {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean onMessage(Bob c, Message msg) {
        // TODO Auto-generated method stub
        return false;
    }

}
