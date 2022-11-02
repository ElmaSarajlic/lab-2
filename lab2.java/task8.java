impost java.util.Scanner;
public class exercise8 {
    public static int drawNumber() {
        return (int) (Math.random() * 100);
    }

    public static void main(String[] args) {
        int number = drawNumber();
        int guess;
        int count=0;

        while (true) {
            count++;
            System.out.print("Guess the number: ");
            guess = new Scanner(System.in).nextInt();
            if (guess > number) System.out.println("The number is lesser! guess made: "+count);
            else if (guess < number) System.out.println("The number is greater! guess made"+count);
            else {
                System.out.println("Congratulations, your number is correct! guess made: "+count);
                break;
            }
        }
    }
}


