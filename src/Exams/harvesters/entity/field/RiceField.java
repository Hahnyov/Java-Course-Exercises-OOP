package Exams.harvesters.entity.field;

import Exams.harvesters.entity.harvester.Harvester;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class RiceField extends BaseField{
    private static final int UNIT_LOSS = 2;
    public RiceField(String name, int crop) {
        super(name, crop);

    }

    @Override
    public void reduceCrop() {
        setCrop(getCrop() - UNIT_LOSS);
    }

}
