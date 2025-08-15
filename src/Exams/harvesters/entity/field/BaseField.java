package Exams.harvesters.entity.field;

import Exams.harvesters.entity.harvester.Harvester;
import Exams.harvesters.entity.harvester.Harvester;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class BaseField implements Field {   private String name;
    private int crop;
     private Collection<Harvester> harvesters;

    public BaseField(String name, int crop) {
        setName(name);
        setCrop(crop);
        this.harvesters = new ArrayList<>();
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Field name cannot be null or empty.");
        }
        this.name = name;
    }

    protected void setCrop(int crop) {
        this.crop = crop;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getCrop() {
        return this.crop;
    }

    @Override
    public Collection<Harvester> getHarvesters() {
        if (this.harvesters == null) {
            this.harvesters = new ArrayList<>();
        }
        return this.harvesters;
    }


    public abstract void reduceCrop();
}
