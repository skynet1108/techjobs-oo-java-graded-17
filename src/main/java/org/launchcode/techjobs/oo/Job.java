package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        this.id = nextId;
        nextId++;
    }

    public Job(String aName, Employer anEmployer, Location aLocation, PositionType aPosType,
               CoreCompetency aCoreComp) {
        this();
        this.name = aName;
        this.employer = anEmployer;
        this.location = aLocation;
        this.positionType = aPosType;
        this.coreCompetency = aCoreComp;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {

        String toStr = System.lineSeparator() + "ID: " + this.getId() + System.lineSeparator();

        if (this.getName() == null || this.getName() == "") {
            toStr += "Name: Data not available" + System.lineSeparator();
        } else {
            toStr += "Name: " + this.getName() + System.lineSeparator();
        }

        if (this.getEmployer() == null || this.getEmployer().getValue().isEmpty()) {
            toStr += "Employer: Data not available" + System.lineSeparator();
        } else {
            toStr += "Employer: " + this.getEmployer() + System.lineSeparator();
        }

        if (this.getLocation() == null || this.getLocation().getValue().isEmpty()) {
            toStr += "Location: Data not available" + System.lineSeparator();
        } else {
            toStr += "Location: " + this.getLocation() + System.lineSeparator();
        }

        if (this.getPositionType() == null || this.getPositionType().getValue().isEmpty()) {
            toStr += "Position Type: Data not available" + System.lineSeparator();
        } else {
            toStr += "Position Type: " + this.getPositionType() + System.lineSeparator();
        }

        if (this.getCoreCompetency() == null || this.getCoreCompetency().getValue().isEmpty()) {
            toStr += "Core Competency: Data not available" + System.lineSeparator();
        } else {
            toStr += "Core Competency: " + this.getCoreCompetency() + System.lineSeparator();
        }

        return toStr;
    }

}
