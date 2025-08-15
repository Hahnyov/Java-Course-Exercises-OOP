package Exercises.Ex1_WorkingWIthAbstractions.P02CardRank;

public class Main {
    public static void main(String[] args) {
        System.out.println("Card Ranks:");
        for (CardRanks1 rank : CardRanks1.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s%n",rank.ordinal(),rank.name());
        }

    }
}
