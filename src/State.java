public interface State<NonPlayableCharacter> {
    public void enter(NonPlayableCharacter character);
    public void execute(NonPlayableCharacter character);
    public void exit(NonPlayableCharacter character);
}
