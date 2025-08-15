package Exercises.Ex6_Reflections.barracksWars.core.commands;

import Exercises.Ex6_Reflections.barracksWars.interfaces.Repository;
import Exercises.Ex6_Reflections.barracksWars.interfaces.UnitFactory;

public class ReportCommand extends Command {
    public ReportCommand(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() {

        String output = this.getRepository().getStatistics();
        return output;
    }
}