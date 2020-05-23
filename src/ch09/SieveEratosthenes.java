package ch09;
public class SieveEratosthenes {
    public static void main(String[] args) {
        int m = 100;
        boolean[] prima = new boolean[m + 1];
        for(int i=0; i<=m; i++){
            prima[i]=true;
        }
        prima[0]=prima[1]=false;
        double akarN=Math.sqrt(m);
        
        for(int i=2; i<=akarN; i++){
            if(prima[i])
            {
                for(int j=i*i; j<=m; j++){
                    if((j%i)==0){
                        prima[j]=false;
                       }
                    }
                }
            }
        for(int i=0; i<=m; i++){
            if(prima[i])
                System.out.println(i+ "\n");
        }
    }
    
}

