package ch07;
public class MargeSort {
    public static void main(String[] args){
        int n[]={82,12,41,38,19,26,9,48,20,55,8,32,3};
        System.out.println("sebelum di urutkan");
        for(int i=0; i<n.length; i++){
            System.out.println(n[i]+"");
        }
        System.out.println();
        System.out.println("setelah diurutkan merge sort");
        for(int i=1;i<n.length;i++){
            System.out.println(i+"");
        }
    }
    public static void initializemergeSort(int n[], int l,int h){
         int low = l;
         int high = h;
         if(low>=high){
             return;
         }
         int middle=(low+high)/2;
         initializemergeSort(n,low,middle);
         initializemergeSort(n,middle+1,high);
         int end_low=middle;
         int start_high=middle+1;
         while((l<=end_low)&&(start_high<=high)){
         if(n[low]<n[start_high]){
            low++; 
         }    
         else{
             int temp=n[start_high];
             for(int k=start_high-1;k>=low; k++){
                n[k+1]=n[k];
                }
                n[low]=temp;
                low++;
                end_low++;
                start_high++;
            }
        }
    }
}
