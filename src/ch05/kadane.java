package ch05;
import java.util.Scanner;
public class kadane {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("kadane\n");
        kadane l = new kadane();
        System.out.println("masukan ukuran array");
        int N = sc.nextInt();
        System.out.println(" masukan nilai" +N+"elemen");
        int[] arr= new int[N];
        for(int i = 0; i<N; i++)
            arr[i]=sc.nextInt();
        int jumlah = l.hashCode();
        System.out.println("\n urutkan jumlah maksimum=" + jumlah);
        int maxSoFar = arr[0],maxEndingHere = arr[0];
        for(int i=1; i<arr.length; i++){
            if(maxEndingHere<0){
                maxEndingHere = arr[i];
            }else{
                maxEndingHere+= arr[i];
            }
            if(maxEndingHere>=maxSoFar){
                maxSoFar=maxEndingHere;
            }
        }
    }
    
}
