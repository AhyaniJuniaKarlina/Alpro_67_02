package ch06;
public class BubbleSort {
    public static void main(String[] args) {
        int a[] = {82,12,41,38,19,26,9,48,20,55,8,32,3};
        for(int i=0 ; i<a.length;i++){  
            for(int j = i+1; j < a.length;j++){
            if (a[i] > a[j]){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                }    
            }
        }
        for(int i = 0; i<a.length;i++){
            System.out.println(a[i]+" ");
        }
    }
    
}
