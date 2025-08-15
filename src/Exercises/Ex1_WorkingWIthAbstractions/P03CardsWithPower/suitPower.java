package Exercises.Ex1_WorkingWIthAbstractions.P03CardsWithPower;

public enum suitPower {
    CLUBS(0), DIAMONDS(13), HEARTS(26),SPADES(39);
    private int powers;
    suitPower(int powers) {
        this.powers = powers;
    }
    public int getPowers() {
        return this.powers;
    }
}
