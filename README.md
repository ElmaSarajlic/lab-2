package week2;

import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        String password = "amazing123";
        while (true) {
            System.out.print("Type the password: ");
            String enteredPassword = new Scanner(System.in).nextLine();
            if (password.equals(enteredPassword)) {
                System.out.println("Right!");
                break;
            } else {
                System.err.println("Wrong!");
            }
        }
    }
}



package week2;

import java.util.Scanner;

public class exercise2 {
    public static int requestNumber(String text){
        Scanner reader = new Scanner(System.in);
        System.out.print(text);
        return reader.nextInt();
    }
    public static int calculateSum(int[] arr){
        int sum = 0;
        for(int i : arr){
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] numbers = {requestNumber("Type the first number: "),
                         requestNumber("Type the second number: "),
                         requestNumber("Type the third number: ")};

        System.out.println("Sum: " + calculateSum(numbers) );
    }
}



package week2;

import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        int sum = 0;
        while(true){
            int number = new Scanner(System.in).nextInt();
            if (number == 0) break;
            sum += number;
            System.out.println("Sum now: " + sum);
        }
        System.out.println("Sum in the end: " + sum);
    }
}

package week2;

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

package week2;

import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) {
        System.out.print("Type a number: ");
        int n = new Scanner(System.in).nextInt();
        int result = 0;
        for (int i = 0; i <= n; i++){
            result += Math.pow(2, i);
        }
        System.out.println("The result is: " + result);
    }
}

package week2;

import java.util.Scanner;

public class exercise6 {
    public static void printText(int timesOfPrinting){
        for(int i = 0; i < timesOfPrinting; i++) System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }
    public static void main(String[] args) {
        System.out.print("Enter the number for the message to be printed: ");
        printText(new Scanner(System.in).nextInt());
    }
}


package week2;

public class exercise7 {
    public static void printStars(int amount){
        for(int i = 0; i < amount; i++) System.out.print("*");
        System.out.print("\n");
    }
    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);
    }
}


package week2;

import java.util.Scanner;

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
