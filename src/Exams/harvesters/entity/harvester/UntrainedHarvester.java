package Exams.harvesters.entity.harvester;

public class UntrainedHarvester extends BaseHarvester{
    private static final int INITIAL_STRENGTH = 50;
    private static final int CROP_GAIN = 1;
    private static final int STRENGTH_LOSS = 10;
    public UntrainedHarvester( String name) {
        super(INITIAL_STRENGTH, name);
    }
    @Override
    public void harvesting() {
        setHarvest(getHarvest()+CROP_GAIN);

        int newStrength = getStrength() - STRENGTH_LOSS;
        if (newStrength < 0) {
            newStrength = 0;
        }
        setStrength(newStrength);
    }
}
