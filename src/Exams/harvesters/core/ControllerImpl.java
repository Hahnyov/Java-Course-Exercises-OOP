package Exams.harvesters.core;

import Exams.harvesters.entity.field.*;
import Exams.harvesters.entity.harvester.ExpertHarvester;
import Exams.harvesters.entity.harvester.Harvester;
import Exams.harvesters.entity.harvester.ProficientHarvester;
import Exams.harvesters.entity.harvester.UntrainedHarvester;
import Exams.harvesters.entity.harvesting.Harvesting;
import Exams.harvesters.entity.harvesting.HarvestingImpl;
import Exams.harvesters.repository.FieldRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class ControllerImpl implements Controller {

    //TODO - Implement all methods


    private final FieldRepository fieldRepository;
    private final Harvesting harvesting;

    public ControllerImpl() {
        this.fieldRepository = new FieldRepository();
        this.harvesting = new HarvestingImpl();
    }

    @Override
    public String addField(String fieldType, String fieldName, int crops) {
        if (crops < 0) {
            throw new IllegalArgumentException("Field crops cannot be a negative number.");
        }

        if (fieldRepository.byName(fieldName) != null) {
            throw new IllegalArgumentException("This field already exists in repository.");
        }

        Field field;
        switch (fieldType) {
            case "WheatField":
                field = new WheatField(fieldName, crops);
                break;
            case "RiceField":
                field = new RiceField(fieldName, crops);
                break;
            case "CornField":
                field = new CornField(fieldName, crops);
                break;
            default:
                throw new IllegalArgumentException("Invalid field type.");
        }

        fieldRepository.add(field);
        return String.format("Field %s %s added.", fieldName, fieldType);
    }

    @Override
    public String addHarvester(String fieldName, String harvesterType, String harvesterName) {
        Field field = fieldRepository.byName(fieldName);
        if (field == null) {
            throw new IllegalArgumentException("Field does not exist.");
        }

        Harvester harvester;
        switch (harvesterType) {
            case "UntrainedHarvester":
                harvester = new UntrainedHarvester(harvesterName);
                break;
            case "ProficientHarvester":
                harvester = new ProficientHarvester(harvesterName);
                break;
            case "ExpertHarvester":
                harvester = new ExpertHarvester(harvesterName);
                break;
            default:
                throw new IllegalArgumentException("Invalid harvester.");
        }

        boolean harvesterExists = field.getHarvesters()
                .stream()
                .anyMatch(h -> h.getName().equals(harvesterName));
        if (harvesterExists) {
            throw new IllegalArgumentException(
                    String.format("Harvester with name %s already exist in this field.", harvesterName));
        }

        field.getHarvesters().add(harvester);

        return String.format("%s %s added.", harvesterType, harvesterName);
    }

    @Override
    public String goHarvesting(String fieldName) {
        Field field = fieldRepository.byName(fieldName);
        if (field == null) {
            throw new NullPointerException(
                    String.format("%s does not exist in the field repository.", fieldName));
        }

        harvesting.startHarvesting(field);

        if (field.getCrop() > 0) {
            return String.format("There was harvesters at %s %s. Remaining crops: %d",
                    field.getName(), field.getClass().getSimpleName(), field.getCrop());
        } else {
            return String.format("Harvesting more crops in %s %s is not possible.",
                    field.getName(), field.getClass().getSimpleName());
        }
    }

    @Override
    public String getStatistics() {
        StringBuilder sb = new StringBuilder();
        for (Field field : fieldRepository.getCollection()) {
            for (Harvester harvester : field.getHarvesters()) {
                if (harvester.getHarvest() > 0) {
                    sb.append(String.format("Harvester harvesting on %s %s:%n",
                            field.getName(), field.getClass().getSimpleName()));
                    sb.append(String.format("Name: %s%n", harvester.getName()));
                    sb.append(String.format("Strength left: %d%n", harvester.getStrength()));
                    sb.append(String.format("Harvested crops: %d%n", harvester.getHarvest()));
                }
            }
        }
        return sb.toString().trim();
    }
}
