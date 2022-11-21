
import java.util.Scanner;
public class Practice_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstMember;
        int difference;
        int countOfMember=0;

        do{
            System.out.println(" Enter the count of member in invoice series" );
            countOfMember= scanner.nextInt();
        }while(countOfMember<=0);

        System.out.println( "Enter the first num in invoice series");
        firstMember= scanner.nextInt();
        System.out.println("Enter the difference num in invoice series");
        difference = scanner.nextInt();

       for (int i = firstMember; countOfMember>0; i+=difference)
       {
           System.out.print(i + " ,");
           countOfMember--;
       }
    }
}
