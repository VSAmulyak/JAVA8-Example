package org.jesperdj.lambda;

import com.google.common.collect.Iterables;

public class Example03 {

    // Using Google Guava with lambda expressions
    public Iterable<String> getBestStudentsOfYear(Iterable<Student> students, int year) {
        Iterable<Student> bestStudents = Iterables.filter(students,
                (Student s) -> s.getGraduationYear() == year && s.getScore() >= 9);

        Iterable<String> names = Iterables.transform(bestStudents, s -> s.getName());

        return names;
    }
}
