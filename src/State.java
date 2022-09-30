public interface State<NonPlayableCharacter extends Character> {
    public void enter(NonPlayableCharacter character);

    public void execute(NonPlayableCharacter character);

    public void exit(NonPlayableCharacter character);

    public boolean onMessage(NonPlayableCharacter c, Message msg);
}
