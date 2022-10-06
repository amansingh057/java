import java.util.*;
public class Main{
    public static void max(int a[],int n){
        int maxn = Integer.MIN_VALUE,maxi=1;
        for(int i=0;i<n;i++){
            if(a[i]>=maxn){
                maxn = a[i];
                maxi = i;
            }
        }
        System.out.println(maxn);
        System.out.println(maxi);
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[]= new int[n];
        for(int i=0;i<n;i++){
            a[i]=scn.nextInt();
        }
        max(a,n);
    }
}