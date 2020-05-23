package ch05;
public class PBB {
    public static void main(String[] args){
        // step inisial
        int a = 160 , b = 24;
        int m = a;
        int n = b;
        // step 1
        int r =m%n;
        int q = (r-m)/-n;
        int pbb = (n*q)+r;
        // step 2
        int r2 =n%r;
        int q2 = (r2-n)/-r;
        int pbb2 = (r*q2)+r2;
        int pbb_bil = r2;
        System.out.println("jadi PBB"+a+" dan"+b+" = ");
        System.out.println(pbb_bil);
    }
}
