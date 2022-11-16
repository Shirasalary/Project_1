import java.util.Scanner;

public class Ex3
{
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner (System.in);
        int firstNum ;
        int secondNum ;
        System.out.println( "Enter first number:");
        firstNum = scanner.nextInt();
        System.out.println( "Enter second number:");
        secondNum = scanner.nextInt();
        int sum = firstNum;

        for(int i=1; i< secondNum; i++)
        {
            sum = sum * firstNum;
        }

        System.out.println( "the sum is: " + sum);
    }
}
