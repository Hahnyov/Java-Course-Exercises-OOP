package Exercises.Ex3_Inheritance.Animals;
public class Cat extends Animal{
    private static final String CAT_SOUND = "Meow meow";
    public Cat(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public String produceSound() {
        return CAT_SOUND;
    }
}