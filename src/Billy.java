public class Billy extends Character {
    public Billy() {
        super("Billy");
        this.getStateMachine().changeState(LookAtTheWeather.getInstance());
    }
}
