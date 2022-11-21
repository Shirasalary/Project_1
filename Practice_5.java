import java.util.Scanner;

public class Practice_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int checkNum;
        int  firstNum=0;
        int secondNum=1;
        int saveFirstNun = firstNum;
        System.out.println("Enter a number");
        checkNum = scanner.nextInt();
        if(checkNum==0 || checkNum==1)
            System.out.println("true");
        while (firstNum+secondNum<checkNum){

            saveFirstNun=firstNum;
            firstNum=secondNum;
            secondNum+=saveFirstNun;
        }
        if (firstNum+secondNum > checkNum)
            System.out.println("false");
        if (firstNum+secondNum== checkNum)
            System.out.println("true");


    }}

