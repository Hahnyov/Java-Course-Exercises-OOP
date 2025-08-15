package Exercises.Ex3_Inheritance.Animals;

public class Frog extends Animal{
    private static final String FROG_SOUND = "Ribbit";
    public Frog(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public String produceSound() {
        return FROG_SOUND;
    }
}