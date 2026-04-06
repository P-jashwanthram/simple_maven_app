package com.example;

public class App {
    public double calculateNetSalary(double basic, double hra, double da, double pf, double tax) {
        // gross salary
        double grossSalary = basic + hra + da;
        double totalReductions = pf + tax;
        double netSalary = grossSalary - totalReductions;
        return netSalary;
    }
}
