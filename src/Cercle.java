public class Cercle extends FormeGeometrique{

    float rayon;
    double Pi = Math.PI;

    public Cercle(String nom, float rayon){
        super(nom);
        this.rayon = rayon;
    }

    public float getRayon() {return rayon;}

    public void setRayon(float rayon) {this.rayon = rayon;}
    @Override
    public double calculerPerimetre(){
        return 2*Pi*rayon;
    }
}
