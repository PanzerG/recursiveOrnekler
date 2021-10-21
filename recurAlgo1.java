
package recursive;


public class recurAlgo1 {
    public static void yaz(int t){
        if (t<=0) System.exit(1);
        else{System.out.println("osman");
        yaz(--t);
        }    
        
    
    }
   
    
    
    public static void main(String[] args) {
        yaz(10);
    }
    
}
