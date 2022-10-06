import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        String st = scn.nextLine();
        String ans = "";
        for(int i=st.length()-1;i>=0;i--){
            ans+=st.charAt(i);
        }
        System.out.println(ans);

    }
}