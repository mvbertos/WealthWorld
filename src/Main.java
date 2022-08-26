import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        Bob bob = new Bob(10,0,10);

        //HERE BOB THE HIS THING
        while(true) {
            bob.ExecuteStep();
            scr.next();
        }
    }

}
