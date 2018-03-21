public class App{
    
    public static void main(String[] args){
        FormaBase c = new Circulo(3);
        System.out.println(c.getNome());
        System.out.println(c.getArea());
        
        FormaBase q = new Quadrado(2);
        System.out.println(q.getNome());
        System.out.println(q.getArea());
    }
}