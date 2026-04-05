package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testGrades() {
        App app = new App();

        assertEquals("Grade S", app.getGrade(95));
        assertEquals("Grade A", app.getGrade(85));
        assertEquals("Grade B", app.getGrade(72));
        assertEquals("Grade C", app.getGrade(60));
        assertEquals("Grade D", app.getGrade(55));
        assertEquals("Grade E", app.getGrade(45));
        assertEquals("Grade F", app.getGrade(30));
    }

    @Test
    public void testEdgeCases() {
        App app = new App();

        assertEquals("Grade S", app.getGrade(100));
        assertEquals("Grade F", app.getGrade(0));
    }
}
