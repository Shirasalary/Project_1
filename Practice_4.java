import java.util.Scanner;

public class Practice_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many prime number you want to print");
        int howManyPrime = scanner.nextInt();
        int countOfDivides = 0;

        for(int i =2; howManyPrime > 0 ; i++)
        {
            for(int j= 2; j<i; j++)
            {
                if (i%j==0)
                    countOfDivides++;
            }
            if (countOfDivides == 0)
            {
                System.out.print(i +", ");
                howManyPrime --;
            }

            countOfDivides =0;
        }
    }
}
