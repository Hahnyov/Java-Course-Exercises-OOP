package Exams.harvesters.entity.harvester;

public abstract class BaseHarvester implements Harvester{
    private String name;
    private int harvest;
    private int strength;

    public BaseHarvester(int strength, String name) {
        this.strength = strength;
        setName(name);
        this.harvest=0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(!name.isEmpty() && !name.isBlank()){
            this.name = name;
        }else{
            throw new IllegalArgumentException("Harvester name cannot be null or empty.");
        }
    }

    public int getHarvest() {
        return harvest;
    }

    public void setHarvest(int harvest) {
        this.harvest = harvest;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
    public     abstract void harvesting();
}
