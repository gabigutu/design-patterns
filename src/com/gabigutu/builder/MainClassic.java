package com.gabigutu.builder;

public class MainClassic {

    public static void main(String[] args) {
        ChristmasTreeClassic christmasTree = new ChristmasTreeClassic();
        Object[] globuri = genereazaGloburi(30);

        for (int i = 0; i < globuri.length; i++) {
            christmasTree.addGlob(globuri[i]);
        }
        christmasTree.addBeteala(new Object());
        christmasTree.addBeteala(new Object());
        christmasTree.addBeteala(new Object());
        christmasTree.addBeteala(new Object());
        christmasTree.addBeteala(new Object());

        christmasTree.addInstalatie(new Object());
        christmasTree.addInstalatie(new Object());
        christmasTree.addInstalatie(new Object());

        christmasTree.addGlob(new Object());
        christmasTree.addGlob(new Object());
        christmasTree.addGlob(new Object());
        christmasTree.addGlob(new Object());

    }

    public static Object[] genereazaGloburi(int nr) {
        Object[] globuri = new Object[nr];
        for (int i = 0; i < globuri.length; i++) {
            globuri[i] = new Object();
        }
        return globuri;
    }

}
