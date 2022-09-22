public class WalkAroundTheFarm implements State {
    private static WalkAroundTheFarm instance;

    private WalkAroundTheFarm() {
    }

    public static WalkAroundTheFarm getInstance() {
        if (instance == null) {
            instance = new WalkAroundTheFarm();
        }
        return instance;
    }

    @Override
    public void enter(Character character) {
        System.out.println("Billy starts to take a walk at the farm");

    }

    @Override
    public void execute(Character character) {
        System.out.println("Billy is walking around the farm");
        if (character.getRnd().nextInt(101) > 76) {
            character.changeState(LookAtTheWeather.getInstance());
        }

    }

    @Override
    public void exit(Character character) {
        System.out.println("Billy is tired of walking at the farm");

    }
}