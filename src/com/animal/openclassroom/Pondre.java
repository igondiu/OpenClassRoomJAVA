package com.animal.openclassroom;

public interface Pondre extends Reproduction {
    public static void description() {
        Reproduction.description();
        System.out.println("Redéfinie dans Pondre.java");
    }
}
