package Lectures.L01WorkingWithAbstractions.HotelReservetation_04;

public enum Season {
    AUTUMN(1),
    SUMMER(4),
    WINTER(3),
    SPRING(2);

    private int multiplayer;
    Season(int multiplayer) {
        this.multiplayer = multiplayer;
    }
    public int getMultiplayer() {
        return multiplayer;
    }

}
