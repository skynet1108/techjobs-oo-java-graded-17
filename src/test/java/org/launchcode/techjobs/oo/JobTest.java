package org.launchcode.techjobs.oo;

import org.junit.Test;

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
}
