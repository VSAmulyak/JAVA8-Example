package org.jesperdj.lambda;

import java.util.ArrayList;
import java.util.List;

public class Example01 {

    // Using a for-loop (external iteration)
    public Iterable<String> getBestStudentsOfYear(Iterable<Student> students, int year) {
        List<String> result = new ArrayList<>();

        for (Student s : students) {
            if (s.getGraduationYear() == year && s.getScore() >= 9) {
                result.add(s.getName());
            }
        }

        return result;
    }
}
