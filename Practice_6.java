import java.util.Scanner;

public class Practice_6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num;
        int sumOfDigits=0;
        System.out.println("Enter a number");
        num = scanner.nextInt();
        while (num>0)
        {
            sumOfDigits+=num%10;
            num=num/10;
        }
        System.out.println(sumOfDigits);

    }}

