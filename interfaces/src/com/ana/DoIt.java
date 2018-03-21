
public interface DoIt{
    
    public int doSomething(int x);
    public String doSomethingElse(String x);
    
    public default String didWork(String msg){
        return msg.concat(" implementado um metodo default");   
    }
}