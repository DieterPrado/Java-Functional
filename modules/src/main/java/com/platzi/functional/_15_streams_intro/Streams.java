package com.platzi.functional._15_streams_intro;

import com.platzi.functional._06_reference_operator.NameUtils;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        List<String> courseList = NameUtils.getList(
                "Java",
                "front end",
                "back end",
                "FullStack");
        for (String course:courseList) {
            System.out.println("Platzi: " + course);

        }

        Stream<String> coursesStream = Stream.of("Java",
                "front end",
                "back end",
                "FullStack");
        //Stream<Integer> courseLenghtStream = coursesStream.map(course -> course.length());
        //Optional<Integer> longest = courseLenghtStream.max((x, y) -> y-x);
        Stream<String> emphasisCourses = coursesStream.map(course -> course + "!");
        emphasisCourses.forEach(System.out::println);
        //Stream<String> justJavaCourses = coursesStream.filter(course -> course.contains("Java"));

        Stream<String> coursesStream2 = courseList.stream();
        coursesStream2.map(course -> course + "!!!!").filter(course -> course.contains("Java"))
        .forEach(System.out::println);

    }
}
