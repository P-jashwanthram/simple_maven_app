package com.example;

import org.junit.Test;
import static org.junit.Assert.*;
import com.example.App.Student;

public class AppTest {

    private static final int ELIGIBILITY_THRESHOLD = 15;

    @Test
    public void testRegistrationAndEligibility_exactThreshold() {
        Student s = new Student("Alice", "S001");
        s.registerSubject("Mathematics", 5);
        s.registerSubject("Physics", 5);
        s.registerSubject("Chemistry", 5);

        assertEquals(3, s.getRegisteredSubjects().size());
        assertEquals(15, s.getTotalCredits());
        assertTrue(s.isEligible(ELIGIBILITY_THRESHOLD));
    }

    @Test
    public void testNotEligible_whenBelowThreshold() {
        Student s = new Student("Bob", "S002");
        s.registerSubject("History", 3);
        s.registerSubject("English", 4);

        assertEquals(2, s.getRegisteredSubjects().size());
        assertEquals(7, s.getTotalCredits());
        assertFalse(s.isEligible(ELIGIBILITY_THRESHOLD));
    }

    @Test
    public void testEmptyRegistration() {
        Student s = new Student("Carol", "S003");

        assertEquals(0, s.getRegisteredSubjects().size());
        assertEquals(0, s.getTotalCredits());
        assertFalse(s.isEligible(ELIGIBILITY_THRESHOLD));
    }

    @Test
    public void testLargeCreditsAndEdgeCases() {
        Student s = new Student("Dave", "S004");
        s.registerSubject("Project", 20);

        assertEquals(1, s.getRegisteredSubjects().size());
        assertEquals(20, s.getTotalCredits());
        assertTrue(s.isEligible(ELIGIBILITY_THRESHOLD));
    }
}