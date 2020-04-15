package igondiu.openclassroom.test.com;

public enum Langage {
    //Objets directement construits
    JAVA ("Langage JAVA"),
    C ("Langage C"),
    CPlus ("Langage C++"),
    PHP ("Langage PHP");

    private String name = "";

    //Constructeur
    Langage(String name){
        this.name = name;
    }

    public String toString(){
        return name;
    }
}
