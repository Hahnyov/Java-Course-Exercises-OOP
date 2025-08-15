package Exams.harvesters.entity.field;

import Exams.harvesters.entity.harvester.Harvester;
import Exams.harvesters.entity.harvester.Harvester;

import java.util.Collection;

public interface Field {

    void reduceCrop();
    Collection<Harvester> getHarvesters();

    String getName();

    int getCrop();



}
