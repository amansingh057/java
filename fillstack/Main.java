// import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception{
        Stack <Integer>st = new Stack<>();
        for(int i=0;;i++){
            st.push(i);
            System.out.println(st.peek());
        }
    }
}
