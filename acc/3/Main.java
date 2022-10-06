import java.util.*;
public class Main{
    public static int calculate(String st){
        int ans = st.charAt(0)-'0';
        for(int i=1;i<st.length();i+=2){
            int j =i+1;
            if(st.charAt(i)=='A'){
                ans = ans & (st.charAt(j)-'0');
            }else if(st.charAt(i)=='B'){
                ans = ans | (st.charAt(j)-'0');
            }else if(st.charAt(i)=='C'){
                ans = ans ^ (st.charAt(j)-'0');
            }
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        String st = scn.next();
        System.out.println(calculate(st));
    }
}