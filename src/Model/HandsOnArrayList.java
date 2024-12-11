package Model;

import java.util.ArrayList;
import java.util.Collections;

public class HandsOnArrayList {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        System.out.println("Adding students to the list");

        students.add("John");
        students.add("Mary");
        students.add("Bob");
        students.add("Jack");
        students.add("Jane");
        System.out.println(students);
        System.out.println();

        System.out.println("Removing students from the list");
        students.remove("John");
        System.out.println(students);
        System.out.println();

        System.out.println("Sorting students list");
        Collections.sort(students);
        System.out.println(students);

    }
   }

