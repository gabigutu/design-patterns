package com.gabigutu.builder;

import java.util.ArrayList;
import java.util.List;

public class ChristmasTree {

    private List globuri;
    private List betele;
    private List instalatii;

    public ChristmasTree() {
        globuri = new ArrayList();
        betele = new ArrayList();
        instalatii = new ArrayList();
    }

    public ChristmasTree addGlob(Object glob) {
        globuri.add(glob);
        return this;
    }

    public List getGloburi() {
        return globuri;
    }

    public ChristmasTree addBeteala(Object beteala) {
        betele.add(beteala);
        return this;
    }

    public List getBetele() {
        return betele;
    }

    public ChristmasTree addInstalatie(Object instalatie) {
        instalatii.add(instalatie);
        return this;
    }

    public List getInstalatii() {
        return instalatii;
    }
}
