public abstract class FormaBase{
    
    String nome;
    
    public FormaBase(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public abstract double getArea();
}