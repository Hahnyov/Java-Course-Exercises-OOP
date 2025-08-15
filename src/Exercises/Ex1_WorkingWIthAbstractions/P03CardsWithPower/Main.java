package Exercises.Ex1_WorkingWIthAbstractions.P03CardsWithPower;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rank = scanner.nextLine();
        String suit = scanner.nextLine();
        for(CardRanks cardRank : CardRanks.values()) {
            if(cardRank.name().equals(rank)) {
                for(suitPower suitPower : suitPower.values()) {
                    if(suitPower.name().equals(suit)) {
                        int sumPower=suitPower.getPowers()+cardRank.getPowers();
                        System.out.printf("Card name: %s of %s; Card power: %d",cardRank.name(),suitPower.name(),sumPower);
                    }
                }
            }
        }
    }
}
