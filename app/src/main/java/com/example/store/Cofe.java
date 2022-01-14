package com.example.store;

import androidx.annotation.NonNull;

public class Cofe {
    private String name;
    private String des;
    private Integer denalId;

    public Cofe(String name, String des, int denalId) {
        this.name = name;
        this.des = des;
        this.denalId = denalId;
    }

    public String getName() {
        return name;
    }

    public String getDes() {
        return des;
    }

    public int getDenalId() {
        return denalId;
    }

    @NonNull
    @Override
    public String toString() {
        return this.name;
    }
}
