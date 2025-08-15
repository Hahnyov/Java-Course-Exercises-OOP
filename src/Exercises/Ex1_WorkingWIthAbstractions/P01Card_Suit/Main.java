package Exercises.Ex1_WorkingWIthAbstractions.P01Card_Suit;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("Card Suits:");
        for(SuitsType suit: SuitsType.values()){

            System.out.printf("Ordinal value: %d; Name value: %s%n",count,suit.name());
            count++;
        }
    }
}
