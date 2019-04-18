package com.example.model;

import java.io.Serializable;

public class So implements Serializable {
    private String soA;
    private String soB;
    private String kq;

    public So() {
    }

    public So(String soA, String soB, String kq) {
        this.soA = soA;
        this.soB = soB;
        this.kq = kq;
    }

    public String getSoA() {
        return soA;
    }

    public void setSoA(String soA) {
        this.soA = soA;
    }

    public String getSoB() {
        return soB;
    }

    public void setSoB(String soB) {
        this.soB = soB;
    }

    public String getKq() {
        return kq;
    }

    public void setKq(String kq) {
        this.kq = kq;
    }
}
