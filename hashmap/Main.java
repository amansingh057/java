import java.util.*;
public class Main {
    public static void main(String [] args){
        HashMap<Integer,Integer> hm = new HashMap<>();

        //put
        hm.put(1, 5);
        hm.put(3, 10);
        hm.put(2, 4);
        hm.put(7, 14);
        hm.put(3, 7);

        int val = hm.get(7);
        // int val2 = hm.get(9);
        if(hm.containsKey(9) == true){
            System.out.println(hm.get(9));
        }
        System.out.println(val);

        //Size
        int sz = hm.size();
        System.out.println(sz);

        //containsKey(key) -- T/F
        boolean isPresent = hm.containsKey(9);
        System.out.println(isPresent);


        //keySet()
        Set<Integer> al = hm.keySet();
        System.out.println(al);

        //remove(key);
        System.out.println(hm);
        hm.remove(3);
        System.out.println(hm);
}
}
