package org.example.company;


import com.fasterxml.jackson.annotation.JsonIgnore;
import org.example.company.employer.Employer;

import java.lang.reflect.Array;

public class EntityManager<T extends Employer> {
//    @JsonIgnore
    private T[] entities;
    int size;
    @SuppressWarnings("unchecked")
    public EntityManager(int maxSize, Class<T> clazz) {
        this.entities = (T[]) Array.newInstance(clazz, maxSize);
    }
    public void addEntity(T entity) {
        System.out.println(entity.getName() + " is added");
        entities[size] = entity;
        size++;
    }
    public T[] getEntities() {
        return entities;
    }

    public int getSize() {
        return size;
    }
}
