package Tests;


import org.junit.Before;
import org.launchcode.techjobs_oo.*;
import org.testng.annotations.Test;

import static org.junit.Assert.*;

public class JobTest {

    public Job EmptyConstructorJob1;
    public Job EmptyConstructorJob2;

//    @Before
//    public void setUp() {
//        EmptyConstructorJob1 = new Job();
//        EmptyConstructorJob2 = new Job();
//    }
    @Test
    public void testSettingJobId(){
        EmptyConstructorJob1 = new Job();
        EmptyConstructorJob2 = new Job();
        assertFalse(EmptyConstructorJob1.getId() == EmptyConstructorJob2.getId());
        assertEquals(1, EmptyConstructorJob2.getId() - EmptyConstructorJob1.getId());
    }
    @Test
    public void testJobConstructorSetsAllFields() {
        Job Tester = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(Tester instanceof Job);
        assertTrue(Tester.getName() instanceof String);
        assertTrue(Tester.getEmployer() instanceof Employer);
        assertTrue(Tester.getLocation() instanceof Location);
        assertTrue(Tester.getPositionType() instanceof PositionType);
        assertTrue(Tester.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Product tester", Tester.getName());
        assertEquals("ACME", Tester.getEmployer().getValue());
        assertEquals("Desert", Tester.getLocation().getValue());
        assertEquals("Quality control", Tester.getPositionType().getValue());
        assertEquals("Persistence", Tester.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality(){
        Job Job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job Job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(Job1.equals(Job2));
    }
    @Test
    public void testToString(){
        Job Job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String ExpectedString = "\nID: " + Job1.getId() +"\nName: Product tester\nEmployer: ACME\nLocation: Desert\nPosition Type: Quality control\nCore Competency: Persistence\n";
        assertEquals(ExpectedString, Job1.toString());
    }
    @Test
    public void testToStringWithEmpty(){
        Job Job1 = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        String ExpectedString = "\nID: " + Job1.getId() +"\nName: Data not available\nEmployer: Data not available\nLocation: Data not available\nPosition Type: Data not available\nCore Competency: Data not available\n";
        assertEquals(ExpectedString, Job1.toString());
    }
}
