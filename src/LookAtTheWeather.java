public class LookAtTheWeather implements State {

    private static LookAtTheWeather instance;

    private LookAtTheWeather() {

    }

    public static LookAtTheWeather getInstance() {
        if (instance == null) {
            instance = new LookAtTheWeather();
        }
        return instance;
    }

    @Override
    public void enter(Character character) {
        System.out.println("Billy stopped to look at the sky");

    }

    @Override
    public void execute(Character character) {
        System.out.println("Billy is happy looking at the sky");
        if (character.getRnd().nextInt(101) > 25) {
            character.changeState(WalkAroundTheFarm.getInstance());
        }
    }

    @Override
    public void exit(Character character) {
        System.out.println("Billy is tired of looking at the sky");

    }

}