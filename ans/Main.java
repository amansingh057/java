import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<Integer>();
        int num = 0;
        System.out.println("Start entering the numbers in array :");
        while (scanner.hasNextInt()) {
            System.out.println("Insert + and press enter to exit");
            num = scanner.nextInt();
            numbers.add(num);
        }
        System.out.println(numbers);

    }
}
