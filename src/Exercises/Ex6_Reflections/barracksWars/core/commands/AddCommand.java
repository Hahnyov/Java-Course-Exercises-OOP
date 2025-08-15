package Exercises.Ex6_Reflections.barracksWars.core.commands;

import Exercises.Ex6_Reflections.barracksWars.interfaces.Repository;
import Exercises.Ex6_Reflections.barracksWars.interfaces.Unit;
import Exercises.Ex6_Reflections.barracksWars.interfaces.UnitFactory;
import jdk.jshell.spi.ExecutionControl;

import Exercises.Ex6_Reflections.barracksWars.interfaces.Repository;
import Exercises.Ex6_Reflections.barracksWars.interfaces.Unit;
import Exercises.Ex6_Reflections.barracksWars.interfaces.UnitFactory;
import jdk.jshell.spi.ExecutionControl;

import java.lang.reflect.InvocationTargetException;

public class AddCommand extends Command {
    public AddCommand(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() throws ExecutionControl.NotImplementedException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        String unitType = this.getData()[1];
        Unit unitToAdd = this.getUnitFactory().createUnit(unitType);

        this.getRepository().addUnit(unitToAdd);
        return unitType + " added!";
    }
}