package ch09;
public class AKS{
    static long a[] = new long[1000];
    static void coef(int n){
        a[0]=1;
        for(int i=0; i<n; a[0]= -a[0], i++){
            a[1+i]=1;
            for(int j= i; j>0; j--){
            }
        }
    }
    static boolean isPrime(int n){
        coef(n);
        a[0]++;
        a[n]--;
        int i=n;
        while ((i--) >0 && a[i] % n==0);
        return i<0;
    }
    public static void main(String[] args){
        int n=37;
        if(isPrime(n)){
            System.out.println("bilangan prima");
        }else{
            System.out.println("bukan bilangan prima");
        }
    }
}