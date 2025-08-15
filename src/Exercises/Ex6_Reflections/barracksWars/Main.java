package Exercises.Ex6_Reflections.barracksWars;

import Exercises.Ex6_Reflections.barracksWars.core.Engine;
import Exercises.Ex6_Reflections.barracksWars.core.factories.UnitFactoryImpl;
import Exercises.Ex6_Reflections.barracksWars.data.UnitRepository;
import Exercises.Ex6_Reflections.barracksWars.interfaces.Repository;
import Exercises.Ex6_Reflections.barracksWars.interfaces.Runnable;
import Exercises.Ex6_Reflections.barracksWars.interfaces.UnitFactory;

public class Main {

    public static void main(String[] args) {
        Repository repository = new UnitRepository();
        UnitFactory unitFactory = new UnitFactoryImpl();

        Runnable engine = new Engine(repository, unitFactory);
        engine.run();
    }
}