package org.example.entity;

public class ProgramTeacher implements Teacher {
    @Override
    public void teach() {
        System.out.println("我教编程的！");
    }
}
