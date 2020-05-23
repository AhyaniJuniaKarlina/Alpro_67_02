package ch06;
public class SelectionSort {
   public static void main(String[] args) {
       int c[] = {82,12,41,38,19,26,9,48,20,55,8,32,3};
       for(int i = 0; i < c.length-1; i++){
           int max = i;
           for(int j = i; j < c.length; j++){
               if(c[j] < c[max]){
                   max = j;
               }
           }
           int temp = c[i];
           c[i] = c[max];
           c[max] = temp;
       }
       for(int i = 0; i < c.length; i++){
           System.out.println(c[i]+ " ");
       }
   }
}
