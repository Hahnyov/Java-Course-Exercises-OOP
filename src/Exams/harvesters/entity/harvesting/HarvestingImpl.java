package Exams.harvesters.entity.harvesting;

import Exams.harvesters.entity.field.CornField;
import Exams.harvesters.entity.field.Field;
import Exams.harvesters.entity.harvester.Harvester;

import java.util.Collection;

public class HarvestingImpl implements Harvesting {



    @Override
    public void startHarvesting(Field field) {
        if (field.getCrop() <= 0) {
            return;
        }

        String fieldClassName = field.getClass().getSimpleName();

        for (Harvester harvester : field.getHarvesters()) {  // <-- промяна тук
            if ("CornField".equals(fieldClassName)) {
                if (!(harvester.getClass().getSimpleName().equals("ProficientHarvester")
                        || harvester.getClass().getSimpleName().equals("ExpertHarvester"))) {
                    continue;
                }
            }

            while (field.getCrop() > 0 && harvester.getStrength() > 0) {
                harvester.harvesting();
                field.reduceCrop();

                if (field.getCrop() <= 0) {
                    break;
                }
            }

            if (field.getCrop() <= 0) {
                break;
            }
        }
    }
}