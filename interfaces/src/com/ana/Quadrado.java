public class Quadrado extends FormaBase{
    
    double lado;
    
    public Quadrado(double lado){
        super("quadrado");
        this.lado = lado;
    }
    
    public double getArea(){
        return lado * lado;
    }
}