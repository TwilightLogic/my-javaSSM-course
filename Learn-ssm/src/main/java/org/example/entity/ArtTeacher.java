package org.example.entity;

import lombok.ToString;

public class ArtTeacher implements Teacher {
    @Override
    public void teach() {
        System.out.println("我教美术的！");
    }
}
