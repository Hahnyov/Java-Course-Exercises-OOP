package Exercises.Ex6_Reflections.barracksWars.core.commands;

import Exercises.Ex6_Reflections.barracksWars.interfaces.Repository;
import Exercises.Ex6_Reflections.barracksWars.interfaces.UnitFactory;

public class FightCommand extends Command{
    public FightCommand(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() {
        return "fight";
    }
}