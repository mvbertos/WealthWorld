public class Main {

    public static void main(String[] args) throws InterruptedException {
        Bob bob = new Bob();
        Billy billy = new Billy();

        // HERE BOB THE HIS THING
        while (true) {
            bob.getState().execute(bob);
            billy.getState().execute(billy);
            Thread.sleep(600);
        }
    }
}
