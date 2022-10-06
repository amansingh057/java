import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int t = scn.nextInt();
        scn.nextLine();
        String genders = scn.nextLine();
        char[] s = genders.toCharArray();

       for(int j = 0 ; j <t; j++){
            
        }
        while(t>0){
            for(int i = 1; i<n ;i++) {
                if(s[i]=='G' && s[i-1]=='B'){
                    s[i]='B';
                    s[i-1]='G';
                    i++;
                }
            }
            t--;
        }
        System.out.println(String.copyValueOf(s));


    }
}