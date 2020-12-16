package com.gabigutu.builder;

import java.util.ArrayList;
import java.util.List;

public class ChristmasTreeClassic {

    private List globuri;
    private List betele;
    private List instalatii;

    public ChristmasTreeClassic() {
        globuri = new ArrayList();
        betele = new ArrayList();
        instalatii = new ArrayList();
    }

    public void addGlob(Object glob) {
        globuri.add(glob);
    }

    public void addBeteala(Object beteala) {
        betele.add(beteala);
    }

    public void addInstalatie(Object instalatie) {
        instalatii.add(instalatie);
    }

}
