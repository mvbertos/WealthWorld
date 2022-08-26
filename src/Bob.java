import java.util.Scanner;

public class Bob {

    private int fullWealth = 10;
    private  Bank bank;
    private Scanner scn;
    //BOB ATTRIBUTES
    private int stamina = 10;
    private int wealth = 10;
    private int wealthMult = 1;
    private int thirst = 10;



    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getWealth() {
        return wealth;
    }

    public void setWealth(int wealth) {
        this.wealth = wealth;
    }

    public int getThirst() {
        return thirst;
    }

    public void setThirst(int thirst) {
        this.thirst = thirst;
    }

    public void CallBob(){
        System.out.println("Hello World");
    }

    public Bob(int stamina, int wealth, int thirst) {
        this.stamina = stamina;
        this.wealth = wealth;
        this.thirst = thirst;
        bank = new Bank();
        scn = new Scanner(System.in);
    }

    public void ExecuteStep(){
        if(wealth >= fullWealth){ //if pockets it full
            VisitBankAndDepositGold();
        }else if(stamina > 0) { //if bob have stamina
            if (thirst > 0) { //check thirsty if is thirsty
                EnterMineAndDigForNugged();
            } else {
                QuenchThirty();
            }
        }else { //if stamina is 0 or lesser
            GoHomeAndSleepTillRested();
        }

        System.out.println("Stamina:"+stamina+"\n"+
                "Thirst:"+thirst+"\n"+
                "Wealth:"+wealth+"\n");
    }

    public void EnterMineAndDigForNugged(){
        stamina -= 1;
        thirst -= 1;
        wealth +=1 * wealthMult;
        System.out.println("Bob went to the mine and dig nugget");
    }
    public void VisitBankAndDepositGold(){
        bank.StoreCoins(wealth);
        wealth = 0;
        System.out.println("Bob went to the bank and saved his gold");
    }
    public void GoHomeAndSleepTillRested(){
        stamina = 10;
        System.out.println("Bob rested for the day");
    }
    public void  QuenchThirty(){
        if(bank.getCoins() > 10){
            System.out.println("Bob went to the bar and the bar man offered a special drink, do you want to play 10 coins for it?\n1 for yes and 2 for n");
            int op = scn.nextInt();
            if(op == 1){
                bank.RemoveCoins(10);
                wealthMult += 1;
            }else {
                System.out.println("Bob declined");
            }
        }
        thirst = 10;
        System.out.println("Bob drank a lot and is thirsty no more");
    }
}
