package ch06;
public class InsertionSort {
    public static void main(String[] args) {
        int b[] = {82,12,41,38,19,26,9,48,20,55,8,32,3};
        for(int i = 1; i < b.length; i++)  {
            for (int j = i; j >= 1; j--){
                if(b[j] > b[j-1]){
                    break;
                }
                int min = b[j];
                b[j] = b[j-1];
                b[j-1] = min;
                 }
            }
        for(int i = 0; i < b.length; i++){
            System.out.println(b[i]+" ");
        }  
    }
    
}
