import java.util.Scanner;

public class Main {
    public static void main(String[] args ){
        int num, answer;
        System.out.println("Please enter an integer");
        Scanner keyboard = new Scanner(System.in);
        num=keyboard.nextInt();
        answer = (num+5)*2-7;
        System.out.println(answer);

    }
}
