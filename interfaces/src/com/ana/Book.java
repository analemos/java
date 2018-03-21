public class Book implements Relatable, DoIt{
    
    int num_paginas;
    
    public Book(int num_paginas){
        this.num_paginas = num_paginas;
    }
    
    public int isLargerThan(Relatable  other){
        Book otherBook = (Book)other;
        if(this.num_paginas > otherBook.num_paginas){
            return 1;
        }    
        else if(this.num_paginas < otherBook.num_paginas){
            return -1;
        }
        return 0;
    }
    
    public String doSomethingElse(String x){
        return x.concat(" Paula");
    }
    
    public int doSomething(int x){
        return x*2;
    }
    
    public String didWork(String msg){
        return msg.concat(" implementado um metodo default com overriding!!!");   
    }
    
    public String novoMetodo(String msg){
        return "teste";
    }
    
    public static void main(String[] args){
        Book book1 = new Book(200);
        Book book2 = new Book(500);
        
        System.out.println(book1.isLargerThan(book2));
        
        System.out.println(book1.doSomethingElse("Ana"));
        System.out.println(book1.doSomething(2));
        System.out.println(book1.didWork("Funciona quando"));
    }
    
    
}