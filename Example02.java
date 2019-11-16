package org.jesperdj.lambda;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;

public class Example02 {

    // Using Google Guava with anonymous inner classes
    public Iterable<String> getBestStudentsOfYear(Iterable<Student> students, int year) {
        Iterable<Student> bestStudents = Iterables.filter(students, new Predicate<Student>() {
            @Override
            public boolean apply(Student s) {
                return s.getGraduationYear() == year && s.getScore() >= 9;
            }
        });

        Iterable<String> names = Iterables.transform(bestStudents, new Function<Student, String>() {
            @Override
            public String apply(Student s) {
                return s.getName();
            }
        });

        return names;
    }
}
