package ch08;
public class LCSP {
    public String lcs(String a,String b){
        int u = a.length();
        int s = b.length();
        int[][] arr = new int [u+1][s+1];
        int len =0,pos=-1;
        for(int i=1; i<u+1; i++){
            for(int j=1; j<s+1; j++){
                if(a.charAt(i-1)== b.charAt(j-1)){
                    arr[i][j]=arr[i-1][j-1]+1;
                    if(arr[i][j]>len){
                        len=arr[i][j];
                        pos=i;
                    }
                }else{
                    arr[i][j]=0;
                }
            }
        }
        return a.substring(pos-len,pos);
    }
        
    public static void main(String[] args){
        String a="OldSite:Geeksforgeeks.org";
        System.out.println("masukan string a");
        String b="newSite:Geeksquiz.com";
        System.out.println("masukan string b");
        System.out.println("\n terpanjang");
    }
}