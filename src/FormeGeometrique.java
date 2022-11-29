public class FormeGeometrique{
    String nom;


    public FormeGeometrique(String nom){
        this.nom = nom;

    }

    @Override
    public String toString() {

        String str = this.getClass().getSimpleName() + "\n";
        str += "La Forme " + nom + " a pour perimetre " + calculerPerimetre() +  "\n";

        return str;
    }






    public double calculerPerimetre(){
        return 0;
    }




}
