package Exams.harvesters.entity.field;

import harvesters.entity.harvester.Harvester;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CornField extends BaseField{
    private static final int UNIT_LOSS = 3;

    public CornField(String name, int crop) {
        super(name, crop);
    }
    @Override
    public void reduceCrop() {
        setCrop(getCrop() - UNIT_LOSS);
    }

}
