public class Main {

    public static void main(String[] args) throws InterruptedException {
        CharacterManager cManager = CharacterManager.getInstance();
        Bob bob = new Bob();
        Billy billy = new Billy();

        cManager.registerCharacter(billy);
        cManager.registerCharacter(bob);
        
        // HERE BOB THE HIS THING
        while (true) {
        bob.getStateMachine().update();
        billy.getStateMachine().update();
        Thread.sleep(800);
        }
    }
}
