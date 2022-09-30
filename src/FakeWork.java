public class FakeWork implements State {

    // Begin Singleton:
    private static FakeWork instance = null;

    private FakeWork() {
    }

    public static FakeWork getInstance() {
        if (instance == null) {
            instance = new FakeWork();
        }
        return instance;
    }

    @Override
    public void enter(Character character) {
        // TODO Auto-generated method stub

    }

    @Override
    public void execute(Character character) {
        // TODO Auto-generated method stub
        System.out.println("Pretending to work... ");
        System.out.println("I am mean working on the Farm");
        // Faz um Rand para verificar se ele trabalhou tempo suficiente:
        int rand = character.getRnd().nextInt(2);
        if (rand == 1) {
        } else {
            character.getStateMachine().changeState(LookAtTheWeather.getInstance());
        }
    }

    @Override
    public void exit(Character character) {
        MessageDispatcher.getInstance().dispatchMessage(character,
                CharacterManager.getInstance().getCharacter("Bob"),
                "JobsDone!", null);

    }

    @Override
    public boolean onMessage(Character c, Message msg) {
        // TODO Auto-generated method stub
        return false;
    }
}
