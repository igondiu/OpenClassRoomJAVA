package igondiu.openclassroom.test.com;
import com.animal.openclassroom.*;
public class Main {

    public static void main(String[] args) {
        Ville v = new Ville();
        try {
            Ville paris  = new Ville( "Paris","France", 9000000);
        } catch (NombreHabitantsException e) {
            e.printStackTrace();
        } catch (NomVilleException e) {
            e.printStackTrace();
        }
        Ville v1 = null;
        try {
            v1 = new Ville("Marseille", "France", 123456);
        } catch (NombreHabitantsException e) {
            e.printStackTrace();
        } catch (NomVilleException e) {
            e.printStackTrace();
        }
        Ville v2 = null;
        try {
            v2 = new Ville("Rio", "Brésil", 321654);
        }catch (NomVilleException | NombreHabitantsException e) {
            e.printStackTrace();
        }finally {
            v2 = new Ville();
        }


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

        Ville V = null;
        try {
            V = new Ville("Lyon", "France", 654);
        } catch (NombreHabitantsException e) {
            e.printStackTrace();
        } catch (NomVilleException e) {
            e.printStackTrace();
        }
        Ville V2 = null;
        try {
            V2 = new Ville("Lille", "France",123);
        } catch (NombreHabitantsException e) {
            e.printStackTrace();
        } catch (NomVilleException e) {
            e.printStackTrace();
        }

        System.out.println(V.comparer(V2));

        System.out.println(V.decrisToi());

        Capitale parisCapital = null;
        try {
            parisCapital = new Capitale("Paris", 11000000, "France","Arc de Triomphe");
        } catch (NombreHabitantsException e) {
            e.printStackTrace();
        } catch (NomVilleException e) {
            e.printStackTrace();
        }

        System.out.println(parisCapital.decrisToi());

        Ville rennes = null;

        try{
            rennes = new Ville("Rennes", "France", -1);
        }catch (Exception e){
            System.out.println(e.getCause());
        }finally {
            rennes = new Ville();
        }
        //System.out.println(rennes.toString());

        Ville nantes = null;
        try{
            nantes = new Ville("Nan", "France", -1);
        }catch (Exception e){
            System.out.println(e.getCause());
        }finally {
            nantes = new Ville();
        }
        System.out.println(nantes.decrisToi());

        for(Langage lang : Langage.values()){
            if(Langage.JAVA.equals(lang))
                System.out.println("J'aime le : " + lang);
            else
                System.out.println(lang);
        }


    }

}
