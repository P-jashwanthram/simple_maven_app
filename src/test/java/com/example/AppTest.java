package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testNetSalaryCalculations() {
        App app = new App();
        assertEquals(34000.0, app.calculateNetSalary(30000, 5000, 2000, 1800, 1200), 0.001);
        assertEquals(90000.0, app.calculateNetSalary(80000, 20000, 10000, 5000, 15000), 0.001);
        assertEquals(11500.0, app.calculateNetSalary(10000, 1000, 500, 0, 0), 0.001);
        assertEquals(0.0, app.calculateNetSalary(5000, 0, 0, 2500, 2500), 0.001);
    }

    @Test
    public void testEdgeCases() {
        App app = new App();
        assertEquals(0.0, app.calculateNetSalary(0, 0, 0, 0, 0), 0.001);
        assertEquals(1000000.0, app.calculateNetSalary(1000000, 100000, 100000, 100000, 100000), 0.001);
    }
}
