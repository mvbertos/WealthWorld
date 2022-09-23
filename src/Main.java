public class Main {

    public static void main(String[] args) throws InterruptedException {
        Bob bob = new Bob();
        Billy billy = new Billy();

        // HERE BOB THE HIS THING
        while (true) {
            bob.getStateMachine().update();
            billy.getStateMachine().update();
            Thread.sleep(600);
        }
    }
}
