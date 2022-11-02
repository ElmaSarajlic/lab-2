import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
        System.out.print(" first: ");
        int first = new Scanner(System.in).nextInt();
        System.out.print("last: ");
        int last = new Scanner(System.in).nextInt();
        while(first <= last){
            System.out.println(first);
            first++;
        }
    }
}