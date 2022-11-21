import java.util.Scanner;

public class Practice_3 {
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int oodNum;
        int symetryNum = 0;

        do{
            System.out.println("Please enter a ood number, bigger than number three");
            oodNum = scanner.nextInt();
        }while (oodNum<=3 || oodNum % 2 == 0);

        for (int i=1; i<= oodNum-symetryNum; i++)
        {
            for (int j = 1;j<=(oodNum-i)-1;j++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j< (2*i)-1; j++)
            {
                System.out.print("*");
            }
            symetryNum++;
            System.out.println();
        }

        for (int i=oodNum-symetryNum;i>=1;i--)
        {
            for (int j = 1;j<= (oodNum-i)-1;j++)
            {
                System.out.print(" ");
            }

            for (int j= 0; j< (2*i)-1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
