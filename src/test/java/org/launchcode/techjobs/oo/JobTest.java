package org.launchcode.techjobs.oo;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class JobTest extends AbstractTest {
    //TODO: Create your unit tests here

    @Test
    public void emptyTest() {
        assertEquals(10,10,.001);
    }

    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();

        assertNotEquals(job1.getId(), job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(job3.getName() instanceof String && job3.getName().equals("Product tester"));

        assertTrue(job3.getEmployer() instanceof Employer && job3.getEmployer().getValue().equals("ACME"));

        assertTrue(job3.getLocation() instanceof Location && job3.getLocation().getValue().equals("Desert"));

        assertTrue(job3.getPositionType() instanceof PositionType
                && job3.getPositionType().getValue().equals("Quality control"));

        assertTrue(job3.getCoreCompetency() instanceof CoreCompetency
                && job3.getCoreCompetency().getValue().equals("Persistence"));
    }

    @Test
    public void testJobsForEquality() {
        Job job4 = new Job("Product tester", new Employer("SC"), new Location("Africa"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

        Job job5 = new Job("Product tester", new Employer("SC"), new Location("Africa"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals(job4.equals(job5), false);
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {

        Job job6 = new Job("Product tester", new Employer("SC"), new Location("Africa"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

        String toStr = job6.toString();
        String c = System.lineSeparator();
        System.out.println(toStr.substring(0, 1));
        assertEquals(toStr.substring(0, 1), c);
        assertEquals(toStr.substring(toStr.length() - 1), System.lineSeparator());
    }


    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job job7 = new Job("Product tester", new Employer("SC"), new Location("Africa"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

        ArrayList<String> labels = new ArrayList<String>();

        labels.add("ID");
        labels.add("Name");
        labels.add("Employer");
        labels.add("Location");
        labels.add("Position Type");
        labels.add("Core Competency");

        String labelsAndData = System.lineSeparator()
                + "ID: " + job7.getId() + System.lineSeparator()
                + "Name: " + job7.getName() + System.lineSeparator()
                + "Employer: " + job7.getEmployer() + System.lineSeparator()
                + "Location: " + job7.getLocation() + System.lineSeparator()
                + "Position Type: " + job7.getPositionType() + System.lineSeparator()
                + "Core Competency: " + job7.getCoreCompetency() + System.lineSeparator();

        assertEquals(job7.toString(), labelsAndData);
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job job8 = new Job();

        String emptyFields = System.lineSeparator()
                + "ID: " + job8.getId() + System.lineSeparator()
                + "Name: Data not available" + System.lineSeparator()
                + "Employer: Data not available" + System.lineSeparator()
                + "Location: Data not available" + System.lineSeparator()
                + "Position Type: Data not available" + System.lineSeparator()
                + "Core Competency: Data not available" + System.lineSeparator();

        String toStr = job8.toString();
        assertEquals(emptyFields, toStr);
    }
}
