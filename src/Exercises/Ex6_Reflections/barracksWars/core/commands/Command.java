package Exercises.Ex6_Reflections.barracksWars.core.commands;

import Exercises.Ex6_Reflections.barracksWars.interfaces.Executable;
import Exercises.Ex6_Reflections.barracksWars.interfaces.Repository;
import Exercises.Ex6_Reflections.barracksWars.interfaces.UnitFactory;

public abstract class Command implements Executable {

    private String[] data;
    private Repository repository;
    private UnitFactory unitFactory;

    public Command(String[] data, Repository repository, UnitFactory unitFactory) {
        this.data = data;
        this.repository = repository;
        this.unitFactory = unitFactory;
    }

    public String[] getData() {
        return data;
    }

    public Repository getRepository() {
        return repository;
    }

    public UnitFactory getUnitFactory() {
        return unitFactory;
    }
}