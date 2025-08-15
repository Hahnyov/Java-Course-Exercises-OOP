package Exercises.Ex3_Inheritance.NeedForSpeed;

public class FamilyCar extends Car{
    public FamilyCar(double fuel, int horsePower) {
        super(fuel, horsePower);
        super.setFuelConsumption(3);
    }
}
