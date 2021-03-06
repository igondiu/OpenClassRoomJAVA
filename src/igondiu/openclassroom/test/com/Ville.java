package igondiu.openclassroom.test.com;

public class Ville {
    protected static int nbreInstancesBis = 0;
    protected String nomVille;
    protected String nomPays;
    protected int nbHabitants;
    protected char categorie;
    //Variables publiques qui comptent les instances
    public static int nbreInstances = 0;
    //Variable privée qui comptera aussi les instances

    public Ville(){
        System.out.println("Création d'une ville vide...");
        this.nomVille = "inconnu";
        this.nomPays = "inconnu";
        this.nbHabitants = 0;
        this.setCategorie();
    }

    public Ville(String nomVille, String nomPays, int nbHabitants) throws NombreHabitantsException, NomVilleException {
        if(nbHabitants<0){
            throw new NombreHabitantsException(nbHabitants);
        }
        if(nomVille.length() < 4){
            throw new NomVilleException("le nom de la ville est inférieur à 3 caractères ! nom = " +nomVille);
        }
        System.out.println("Création de la ville "+nomVille+ " est en cours...");
        this.nbHabitants = nbHabitants;
        this.nomPays = nomPays;
        this.nomVille = nomVille;
        this.setCategorie();
    }

    //Retourne la description de la ville
    public String decrisToi(){
        return "\t"+this.nomVille+" est une ville de "+this.nomPays+ ", elle comporte : "+this.nbHabitants+" habitant(s) => elle est donc de catégorie : "+this.categorie;
    }


    //Retourne une chaîne de caractères selon le résultat de la comparaison
    public String comparer(Ville v1){
        String str;

        if (v1.getNombreHabitants() > this.nbHabitants)
            str = v1.getNom()+" est une ville plus peuplée que "+this.nomVille;

        else
            str = this.nomVille+" est une ville plus peuplée que "+v1.getNom();

        return str;
    }

    private void setCategorie(){
        if(this.nbHabitants < 1000000){
            this.categorie = 'A';
        }else if(this.nbHabitants > 1000000 && this.nbHabitants < 6000000){
            this.categorie = 'B';
        }else{
            this.categorie = 'C';
        }
    }


    public static int getNbreInstancesBis() {
        return nbreInstancesBis;
    }

    public static void setNbreInstances(int nbreInstances) {
        Ville.nbreInstances = nbreInstances;
    }

    public String getNom() {
        return nomVille;
    }

    public void setNom(String nomVille) {
        this.nomVille = nomVille;
    }

    public String getNomPays() {
        return nomPays;
    }

    public void setNomPays(String nomPays) {
        this.nomPays = nomPays;
    }

    public int getNombreHabitants() {
        return nbHabitants;
    }

    public void setNbHabitants(int nbHabitants) {
        this.nbHabitants = nbHabitants;
    }
}
