package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {

    private int id;

    private static int nextId = 1;

    private String value;

    public JobField() {
        this.id = nextId;
        nextId++;
    }

    public JobField(String aValue) {
        this();
        this.value = aValue;
    }

    public String toString() {
        return value;
    }

    public int hashCode() {
        return Objects.hash(getId());
    }

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JobField)) return false;
        JobField jobfield = (JobField) o;
        return getId() == jobfield.getId();
    }
}
