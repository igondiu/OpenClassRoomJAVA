package igondiu.openclassroom.test.com;

public class Main {

    public static void main(String[] args) {
        Ville v = new Ville();
        Ville paris  = new Ville( "Paris","France", 9000000);
        Ville v1 = new Ville("Marseille", "France", 123456);
        Ville v2 = new Ville("Rio", "Brésil", 321654);


        System.out.println("\n v = "+v.getNom()+" ville de  "+v.getNombreHabitants()+ " habitants se situant en "+v.getNomPays());
        System.out.println(" v1 = "+v1.getNom()+" ville de  "+v1.getNombreHabitants()+ " habitants se situant en "+v1.getNomPays());
        System.out.println(" v2 = "+v2.getNom()+" ville de  "+v2.getNombreHabitants()+ " habitants se situant en "+v2.getNomPays()+"\n\n");

/*
  Nous allons interchanger les Villes v1 et v2
  tout ça par l'intermédiaire d'un autre objet Ville.
*/
        Ville temp = new Ville();
        temp = v1;
        v1 = v2;
        v2 = temp;

        System.out.println(" v1 = "+v1.getNom()+" ville de  "+v1.getNombreHabitants()+ " habitants se situant en "+v1.getNomPays());
        System.out.println(" v2 = "+v2.getNom()+" ville de  "+v2.getNombreHabitants()+ " habitants se situant en "+v2.getNomPays()+"\n\n");

/*
  Nous allons maintenant interchanger leurs noms
  cette fois par le biais de leurs mutateurs.
*/
        v1.setNom("Hong Kong");
        v2.setNom("Djibouti");

        System.out.println(" v1 = "+v1.getNom()+" ville de  "+v1.getNombreHabitants()+ " habitants se situant en "+v1.getNomPays());
        System.out.println(" v2 = "+v2.getNom()+" ville de  "+v2.getNombreHabitants()+ " habitants se situant en "+v2.getNomPays()+"\n\n");

        Ville V = new Ville("Lyon", "France", 654);
        Ville V2 = new Ville("Lille", "France",123);

        System.out.println(V.comparer(V2));

        System.out.println(V.decrisToi());

        Capitale parisCapital = new Capitale("Paris", 11000000, "France","Arc de Triomphe");

        System.out.println(parisCapital.decrisToi());

    }

}
