public abstract class House implements Relatable{
    
    int area;
    
    
    public int getArea(){
        return area;
    }
    public void setArea(int area){
       this.area = area;
    }
    
    public int isLargerThan(Relatable other){
        House otherHouse = (House)other;
        if(this.area > otherHouse.area){
            return 1;
        }
        else{
            return -1;
        }
    }
    
    public String novoMetodo(String msg){
        return msg;
    }   
    
    
    public String doSomethingElse(String x){
        return "blabla";
    }
    
    public int doSomething(int x){
        return 0;
    }
    
    public static void main(String[] args){
        
        CasaAlvenaria h1 = new CasaAlvenaria();
        h1.setArea(10);
        
        CasaAlvenaria h2 = new CasaAlvenaria();
        h2.setArea(20);
        
        System.out.println(h1.isLargerThan(h2));
        
    } 
}