package org.example.entity;

import lombok.ToString;

import java.util.Map;

@ToString
public class StudentMap {
    private Map<Integer, String> map;

    public void setMap(Map<Integer, String> map) {
        this.map = map;
    }
}
