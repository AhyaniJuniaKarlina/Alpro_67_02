package ch09;
public class SieveAtkin {
    public static void main(String[] args){
        int m=100;
        boolean prima[]=new boolean[m+1];
        prima[0]=prima[1]=prima[4]= false;
        prima[2]=prima[3]=true;
        for(int i=5; i<=m; i++){
            prima[i]=false;
        }
        double akarN=Math.sqrt(m);
        int n;
        for(int i=1; i<=akarN; i++){
            for(int j=1; j<=akarN; j++){
                n=(4*(i*i)+(j*j));
                if((n<=m)&& (((n%12)==1 || (n%12)==5))){
                    prima[n]=!prima[n];
                }
                n=(3*(i*i))+(j*j);
                if((n<=m)&& ((n%12)==7)){
                    prima[n]=!prima[n];
                }
                n=(3*(i*i))-(j*j);
                if((i>j)&&(n<=m)&&((n%12)==11)){
                    prima[n]=!prima[n];
                }
            }
        }
        for(int a=5; a<=akarN;a++){
            if(prima[a]){
                int j=a*a;
                int l=j;
                int i=1;
                while(l<=m){
                    prima[l]=false;
                    i++;
                    l=i*j;
                }
            }
        }
        for(int b=0; b<=m; b++){
            if(prima[b])
                System.out.println(b+" \n");
        }
    }
    
}
