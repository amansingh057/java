import java.lang.reflect.Array;
import java.util.*;
public class Main{
    public static int sum(int a[]){
        if(a.length<=3){
            return 0;
        }
        
        ArrayList<Integer> odd = new ArrayList<Integer>();
        ArrayList<Integer> even = new ArrayList<Integer>();
        // int even []= new int [a.length/2];
        for(int i=0;i<a.length;i++){
            if(i%2==0){
                even.add(a[i]);
            }else{
                odd.add(a[i]);
            }
        }
        Collections.sort(even);
        Collections.sort(odd);
        int sum = even.get(even.size()-2)+odd.get(odd.size()-2);
        return sum;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]= scn.nextInt();
        }
        int ans = sum(a);
        System.out.println(ans);
    }
}