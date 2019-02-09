package com.praka.servlet.assignment3;

import java.util.ArrayList;

public class StudentDB {
    private static ArrayList<Student> studentList;
    
    static {
        studentList = new ArrayList<>();
        studentList.add(new Student("100", "John", "Doe"));
        studentList.add(new Student("200", "Jane", "Doe"));
        studentList.add(new Student("300", "Jack", "Doe"));
        studentList.add(new Student("400", "Jim", "Doe"));
    }
    
    public static Student getStudentById(String id){
        for(Student s : studentList){
            if(s.getId().equals(id)){
                return s;
            }
        }
        return null;
    }
}
