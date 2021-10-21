package recursive;

public class Recursive {
  public static String kelime = "";
   public static String enuzun_bul(String [] a,int enuzun,int i){
       if (i>=a.length) return kelime;
           
       if(enuzun<a[i].length()){
       kelime = a[i]; return enuzun_bul(a,enuzun,++i);
       }
       else {kelime=a[0];
           return enuzun_bul(a,enuzun,++i);
   
   
       }}
    

    public static void main(String[] args) {
        String [] a = {"fgşljhdflhjdfhljdfghljdfşghl","osman","memduh","mahmut","osmanmemduhmahmut","umut","dlsfkjdfklşgjdfslgjsdfgljasdfasdfsadf"};
       String deger = enuzun_bul(a,a[0].length(),0);
        System.out.println(deger);
        
        
    }

}
