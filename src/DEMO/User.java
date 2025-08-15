package DEMO;

public class User {
    private String name;
    private int age;
    Role role;
    public User(String name, int age,Role role) {
        this.name = name;
        this.age = age;
        this.role = role;
    }
    @Override
    public String toString() {
        return String.format("%s %s %d", name, role, age);
    }
}
