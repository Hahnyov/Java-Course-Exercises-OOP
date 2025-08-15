package Exercises.Ex6_Reflections.barracksWars.core.commands;


import Exercises.Ex6_Reflections.barracksWars.interfaces.Repository;
import Exercises.Ex6_Reflections.barracksWars.interfaces.UnitFactory;
import jdk.jshell.spi.ExecutionControl;

public class RetireCommand extends Command {
    public RetireCommand(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() {

        String unitType = this.getData()[1];

        String messageToReturn = unitType + " retired!";

        try {
            this.getRepository().removeUnit(unitType);
        } catch (ExecutionControl.NotImplementedException e) {
            throw new RuntimeException(e);
        }


        return messageToReturn;
    }
}