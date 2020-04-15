package com.animal.openclassroom;


public interface Mitose extends Reproduction {
    public static void description() {
        Reproduction.description();
        System.out.println("Redéfinie dans Mitose.java");
    }
}