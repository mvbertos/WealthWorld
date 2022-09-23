public class Billy extends Character {
    public Billy() {
        super();
        this.getStateMachine().changeState(LookAtTheWeather.getInstance());
    }

}
