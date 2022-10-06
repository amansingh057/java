import java.util.*;
public class Main{
    public static int checkPassword(String st){
        if(st.length()<4){
            return 0;
        }
        boolean digit = false;
        boolean cap = false;
        boolean sp = false;
        for(int i=0;i<st.length();i++){
            char ch = st.charAt(i);
            if(ch>='0' && ch<='9'){
                digit =true;
            }else if(ch>='A' && ch<='Z'){
                cap = true;
            }else if(ch=='/' || ch ==' '){
                sp = true;
            }
        }
        boolean nstart = (st.charAt(0)>='0' && st.charAt(0)<='9');
        if(digit && cap && !sp && !nstart){
            return 1;
        }else{
            return 0;
        }
    }
    public static void main(String args[]){
        Scanner scn = new Scanner (System.in);
        String st = scn.nextLine();
        System.out.println(checkPassword(st));
    }
}