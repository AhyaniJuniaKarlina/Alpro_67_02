package ch07;
public class BlockSort {
     static void blocksort(int[]arr){
         int a = arr.length;
         int temp =0;
         for(int i=0; i<a; i++){
             for(int j=1; j<(a-1); j++){
                 if(arr[j-1] > arr[j]){
                     temp = arr[j-1];
                     arr[j-1]=arr[j];
                     arr[j] = temp;
                 }
             }
         }
     }
     public static void main(String[] args){
         int arr[]={82,12,41,38,19,26,9,48,20,55,8,32,3};
         System.out.println("array sebelum di sortir");
         for(int i=0; i<arr.length; i++){
             System.out.println(arr[i]+"");
         }
            System.out.println();
            blocksort(arr);
            System.out.println("array sesudah di sortir");
            for(int i=0; i<arr.length; i++){
                System.out.println(arr[i]+"");
            }
     }
}