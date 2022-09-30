public class Billy extends Character {
    public Billy() {
        super("Billy");
        this.getStateMachine().setCurrentState(LookAtTheWeather.getInstance());
        this.getStateMachine().setGlobalState(BillyGlobalState.getInstance());
    }
}
