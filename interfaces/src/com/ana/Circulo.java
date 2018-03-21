public class Circulo extends FormaBase{

    int area;
    double raio;
    
    public Circulo(double raio){
        super("circulo");
        this.raio = raio;
    }
    
    public double getArea(){
        return 3.14 * (raio * raio);
    }
    
}