public class Triangle extends FormeGeometrique{

    int size1,size2,size3;

    public Triangle(String nom,int size1,int size2,int size3){
        super(nom);
        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;
    }

    public int getSize1() {return size1;}

    public void setSize1(int size1) {this.size1 = size1;}

    public int getSize2() {return size2;}

    public void setSize2(int size2) {this.size2 = size2;}

    public int getSize3() {return size3;}

    public void setSize3(int size3) {this.size3 = size3;}

    @Override
    public double calculerPerimetre(){return size1+size2+size3;}
}
