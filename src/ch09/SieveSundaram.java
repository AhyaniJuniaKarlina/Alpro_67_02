package ch09;
import java.util.Scanner;


public class SieveSundaram {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("tes saringan algoritma unggulan sundaram\n");
        SieveSundaram sos = new SieveSundaram();
        System.out.println("masukan angka untuk menemukan bilangan prima kurang dari jumlah\n");
        int n = sc.nextInt();
        sos.calcPrimes(n);
    }
    public boolean calcPrimes(int limit){
        int n = limit/2;
        boolean[] prime = new boolean[limit];
        for(int i=1; i<n; i++){
            for(int j=i; j<=(n-i)/(2*i+1); j++){
                prime[i+j+2*i*j]=true;
            }
           
        }
        System.out.println("\n prime=2 3");
            for(int i=2; i<prime.length/2; i++){
                if(!prime[i]){
                    System.out.println((2*i+1)+"");
                    System.out.println();
                }
            }
      return false;
    }
}    

    
 



    
        
            
         
        
    
    
        

    
        
            
         
        
    
    
        
