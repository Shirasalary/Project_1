import java.util.Random;
import java.util.Scanner;

public class Big_Num_From_3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        int number = getNumberInRange(1,1000);
        int count = 0;
        int gussParticipant1;
        int gussParticipant2;
       do {
           System.out.println("guss a number");
            gussParticipant1 = scanner.nextInt();
           count++;
           if (gussParticipant1 == number) {
               System.out.println("Participant1 is the winning! after " + count);
               break;
           }
           testGuss(gussParticipant1,number);
           System.out.println("guss a number");
           gussParticipant2 = scanner.nextInt();
           count++;
           testGuss(gussParticipant2,number);
       }while (gussParticipant2 != number);

       if (gussParticipant2==number)
        System.out.println("Participant2 is the winning! after " + count);


    }

    public static void testGuss (int number, int rightGuss)
    {

        if (number< rightGuss)
            System.out.println("wrong the number is bigger ");
        else System.out.println("wrong the number is smaller ");
    }

    public static int getNumberInRange(int min, int max) {
        Random random = new Random();
        int number = random.nextInt(max - min) + min;
        return number;
    }

    public static double calculateAverage(int num1, int num2, int num3) {
        return ((num1 + num2 + num3) / 3.0);

    }

    public static boolean isZugi(int num) {
        if (num % 2 == 0) return true;
        return false;

    }

    public static boolean isPrimeNum(int num) {
        int count = 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                count++;
        }
        if (count == 0) return true;
        return false;
    }

    public static boolean isPitagori(int num1,int num2,int num3) {
        boolean pitagori = false;
        if ((num1*num1 + num2*num2)== num3*num3)
            pitagori=true;
        if ((num1*num1 + num3*num3)== num2*num2)
         pitagori= true;
        if ((num2*num2 + num3*num3)== num1*num1)
            pitagori=true;
        return pitagori;
    }

}




