
package recursive;


public class besBul {
    public static int bul(int [] a,int sayac ,int i){
    if(i>=a.length) return sayac;
        if (a[i]==5) sayac++;
            
            return bul(a,sayac,++i);
            
        
    
    }
    
    
    
    public static void main(String[] args) {
        int a [] = {1,2,3,5,5,6,7,8,5,3,42,213};
        System.out.println("Dizideki 5 lerin sayisi : " + bul(a,0,0));
        
    }
    
}
