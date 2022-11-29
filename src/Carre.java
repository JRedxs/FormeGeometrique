public class Carre extends FormeGeometrique{

    int size;
    public Carre(String nom, int size){
        super(nom);
        this.size = size;
    }

    public int getSize() {return size;}

    public void setSize(int size) {this.size = size;}
    @Override
    public double calculerPerimetre(){
        return size*4;
    }
}
