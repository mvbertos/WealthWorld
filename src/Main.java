import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Scanner scr = new Scanner(System.in);
        Bob bob = new Bob();

        //HERE BOB THE HIS THING
        while(true) {
            bob.getState().execute(bob);
            Thread.sleep(600);
        }
    }
}
