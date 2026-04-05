package com.example;

public class App {

    public String getGrade(int a) {

        if (a >= 90 && a <= 100) {
            return "Grade S";
        } else if (a >= 80 && a <= 89) {
            return "Grade A";
        } else if (a >= 70 && a <= 79) {
            return "Grade B";
        } else if (a >= 60 && a <= 69) {
            return "Grade C";
        } else if (a >= 50 && a <= 59) {
            return "Grade D";
        } else if (a >= 40 && a <= 49) {
            return "Grade E";
        } else {
            return "Grade F";
        }
    }
}
