import java.util.Objects;

public class FormeConteneur{

    public static FormeGeometrique[] tableauFormes;

    public FormeConteneur(FormeGeometrique[] tableauFormes){
        this.tableauFormes = new FormeGeometrique[10];

    }

    public static void addForme(FormeGeometrique f){
        for(int i = 0; i < tableauFormes.length; i++){
            if (Objects.isNull(tableauFormes[i])) {
                tableauFormes[i] = f;
                break;
            }

        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        for (FormeGeometrique f : this.tableauFormes) {
            if (!Objects.isNull(f)) {
                result.append(f.toString()).append("\n");
            }
        }
        return  result.toString();

    }



    public static void main(String[] args){

        Triangle TriangleCalcul = new Triangle("Triangle ", 2, 3,9);
        System.out.println("Valeur du triangle " + TriangleCalcul.calculerPerimetre());

        Carre CarreCalcul = new Carre("Carre", 4);
        System.out.println("Valeur du carre " + CarreCalcul.calculerPerimetre());

        Cercle CercleCalcul = new Cercle("Cercle", 3.4f);
        System.out.println("Valeur du cercle " + CercleCalcul.calculerPerimetre());


    }
}
