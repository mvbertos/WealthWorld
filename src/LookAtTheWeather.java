public class LookAtTheWeather implements State<Billy> {

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
    public void enter(Billy character) {
        System.out.println("Billy stopped to look at the sky");

    }

    @Override
    public void execute(Billy character) {
        System.out.println("Billy is happy looking at the sky");
        if (character.getRnd().nextInt(101) > 25) {
            character.changeState(WalkAroundTheFarm.getInstance());
        }
    }

    @Override
    public void exit(Billy character) {
        System.out.println("Billy is tired of looking at the sky");

    }

}