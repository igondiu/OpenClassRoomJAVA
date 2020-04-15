package com.animal.openclassroom;

abstract class Animal {
    public int poids;
    public String couleur;

    protected void manger(){
        System.out.println("Je mange de la viande.");
    }

    protected void boire(){
        System.out.println("Je bois de l'eau !");
    }

    abstract void deplacement();
    abstract void crier();
    public String toString(){
        return "Je suis un objet de la classe : "+ this.getClass()+ ", je suis "+ this.couleur+", je pèse "+ this.poids;
    }
}
