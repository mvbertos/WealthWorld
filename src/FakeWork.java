public class FakeWork implements State<Billy> {

    // Begin Singleton:
    private static FakeWork instance = null;
    private int workPerTick = 1;
    private int workProgress = 0;
    private int workCompleted = 10;

    private FakeWork() {
    }

    public static FakeWork getInstance() {
        if (instance == null) {
            instance = new FakeWork();
        }
        return instance;
    }

    @Override
    public void enter(Billy character) {
        // TODO Auto-generated method stub
        workProgress = 0;

    }

    @Override
    public void execute(Billy character) {
        // TODO Auto-generated method stub
        System.out.println("Billy is pretending to work... I am mean his IS working on the Farm");
        // Faz um Rand para verificar se ele trabalhou tempo suficiente:
        workProgress += workPerTick;
        if (workProgress >= workCompleted) {
            character.getStateMachine().changeState(LookAtTheWeather.getInstance());
        }
    }

    @Override
    public void exit(Billy character) {
        System.out.println("Billy is done with the job!");
        MessageDispatcher.getInstance().dispatchMessage(character,
                CharacterManager.getInstance().getCharacter("Bob"),
                "JobsDone!", null);

    }

    @Override
    public boolean onMessage(Billy c, Message msg) {
        // TODO Auto-generated method stub
        return false;
    }
}
