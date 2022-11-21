import java.util.Scanner;

public class Practice_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        float x1;
        float x2;
        System.out.println("Enter A variable");
        float a = scanner.nextInt();
        System.out.println("Enter B variable");
        float b = scanner.nextInt();
        System.out.println("Enter C variable");
        float c = scanner.nextInt();
        float discriminanta =  (b*b-4*a*c);
        if (discriminanta >0)
        {
            x1 = (float) (-b + Math.sqrt(discriminanta)) / (2 * a);
            x2 = (float) (-b - Math.sqrt(discriminanta)) / (2 * a);
            System.out.println("we have two solutions: x1:" +x1 +" x2:" +x2);
        } else if (discriminanta== 0)
        {
            x1 = (float) (-b + Math.sqrt(discriminanta)) / (2 * a);
            System.out.println("we have one solution x= " +x1);
        } else {
            System.out.println("we don't have solution");
        }
    }

    }






