public class Bank {

    private int coins = 0;

    public int getCoins() {
        return coins;
    }

    public void storeCoins(int coins){
        this.coins += coins;
        System.out.println("Bob addded to his bank acount:"+coins+"\nNow he have:"+this.coins);
    }
    
    public  void removeCoins(int coins){
        this.coins -= coins;
        System.out.println("Bob used:"+coins+"\n Now he have:"+this.coins);
    }
}
