package Exams.harvesters;

import Exams.harvesters.core.Controller;
import Exams.harvesters.core.ControllerImpl;
import Exams.harvesters.core.Engine;
import Exams.harvesters.core.EngineImpl;

public class Main {
    public static void main(String[] args) {

        Controller controller = new ControllerImpl();
        Engine engine = new EngineImpl(controller);
        engine.run();
    }
}
