package com.gabigutu.builder;

public class Main {

    public static void main(String[] args) {
        ChristmasTree christmasTree = new ChristmasTree();
        christmasTree.addInstalatie(new Object()).addInstalatie(new Object()).addGlob(new Object()).addBeteala(new Object());

        Object[] globuri = genereazaGloburi(30);
        for (int i = 0; i < globuri.length; i++) {
            christmasTree.addGlob(globuri[i]);
        }
        christmasTree.addBeteala(new Object()).addBeteala(new Object()).addBeteala(new Object());
        christmasTree.addInstalatie(new Object()).addInstalatie(new Object());
        christmasTree.addGlob(new Object()).addGlob(new Object());
    }

    public static Object[] genereazaGloburi(int nr) {
        Object[] globuri = new Object[nr];
        for (int i = 0; i < globuri.length; i++) {
            globuri[i] = new Object();
        }
        return globuri;
    }

}
