package igondiu.openclassroom.test.com;

class NombreHabitantsException extends Exception{
    public NombreHabitantsException(){
        System.out.println("Vous essayez de créer une Ville avec un nombre d'habitants négatif !");
    }

    public NombreHabitantsException(int nbre)
    {
        System.out.println("Instanciation avec un nombre d'habitants négatif.");
        System.out.println("\t => " + nbre);
    }
}
