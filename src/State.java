public interface State {
    public void enter(Character character);
    public void execute(Character character);
    public void exit(Character character);
}
