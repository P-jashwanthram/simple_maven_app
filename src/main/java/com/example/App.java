package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;

/**
 * Course Registration System.
 * Provides a Student model that can register subjects, calculate total credits,
 * and determine eligibility given a credit threshold.
 */
public class App {

    public static class Subject {
        private final String name;
        private final int credits;

        public Subject(String name, int credits) {
            if (name == null) {
                throw new IllegalArgumentException("Subject name cannot be null");
            }
            if (credits < 0) {
                throw new IllegalArgumentException("Credits cannot be negative");
            }
            this.name = name;
            this.credits = credits;
        }

        public String getName() {
            return name;
        }

        public int getCredits() {
            return credits;
        }

        @Override
        public String toString() {
            return name + " (" + credits + "cr)";
        }
    }

    public static class Student {
        private final String name;
        private final String studentId;
        private final List<Subject> subjects = new ArrayList<>();

        public Student(String name, String studentId) {
            if (name == null || studentId == null) {
                throw new IllegalArgumentException("Name and studentId cannot be null");
            }
            this.name = name;
            this.studentId = studentId;
        }

        public void registerSubject(String subjectName, int credits) {
            subjects.add(new Subject(subjectName, credits));
        }

        public List<Subject> getRegisteredSubjects() {
            return Collections.unmodifiableList(subjects);
        }

        public int getTotalCredits() {
            int sum = 0;
            for (Subject s : subjects) {
                sum += s.getCredits();
            }
            return sum;
        }

        /**
         * Checks eligibility using the provided threshold.
         * @param threshold minimum credits required to be eligible
         * @return true if total credits >= threshold
         */
        public boolean isEligible(int threshold) {
            return getTotalCredits() >= threshold;
        }

        public String getName() {
            return name;
        }

        public String getStudentId() {
            return studentId;
        }

        @Override
        public String toString() {
            StringJoiner sj = new StringJoiner(", ");
            for (Subject s : subjects) {
                sj.add(s.toString());
            }
            return "Student{name='" + name + "', id='" + studentId + "', totalCredits=" + getTotalCredits()
                    + ", subjects=[" + sj.toString() + "]}";
        }
    }
}