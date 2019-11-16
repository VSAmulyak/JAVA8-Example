package org.jesperdj.lambda;

import com.google.common.collect.Iterables;

public class Example04 {

    // Using Google Guava with lambda expressions and a method reference
    public Iterable<String> getBestStudentsOfYear(Iterable<Student> students, int year) {
        Iterable<Student> bestStudents = Iterables.filter(students,
                s -> s.getGraduationYear() == year && s.getScore() >= 9);

        Iterable<String> names = Iterables.transform(bestStudents, Student::getName);

        return names;
    }
}
