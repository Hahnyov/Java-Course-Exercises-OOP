package Exercises.Ex1_WorkingWIthAbstractions.P04TrafficLight;

public enum Color {
    RED("GREEN"), YELLOW("RED"), GREEN("YELLOW");
    private String nextColor;

    Color(String color) {
        this.nextColor = color;
    }

    public String getNextColor() {
        return nextColor;
    }

    public void setNextColor(String nextColor) {
        this.nextColor = nextColor;
    }
}
