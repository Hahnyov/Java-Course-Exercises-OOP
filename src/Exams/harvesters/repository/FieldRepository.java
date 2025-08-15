package Exams.harvesters.repository;

import Exams.harvesters.entity.field.Field;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FieldRepository implements Repository<Field>{
    private final Map<String, Field> fields;

    public FieldRepository() {
        this.fields = new LinkedHashMap<>();
    }

    public void add(Field field) {
        fields.putIfAbsent(field.getName(), field);
    }

    public Field byName(String name) {
        return fields.getOrDefault(name, null);
    }

    public Collection<Field> getCollection() {
        return Collections.unmodifiableCollection(fields.values());
    }
}