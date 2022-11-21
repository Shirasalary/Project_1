

public class Practice_7 {
    public static void main(String[] args) {


        for (int num=1; num< 1000; num++)
        {
            int units = num%10;
            int dozens= num/10%10;
            int  hundreds = num/100%10;

            int unitsExponentDigits = 1;
            int hundredsExponentDigits =1;
            int dozensExponentDigits = 1;

            int countOfDigits=0;
            int sameNumForCheck = num;

            while (sameNumForCheck> 0)
            {
                sameNumForCheck =sameNumForCheck/10;
                countOfDigits ++;
            }

            for (int j = 1; j<=countOfDigits;j++)
            {
                unitsExponentDigits*=units;
            }

            for (int j = 1; j<=countOfDigits;j++)
            {
                dozensExponentDigits*=dozens;
            }

            for (int j = 1; j<=countOfDigits;j++)
            {
                hundredsExponentDigits*=hundreds;
            }

            if (unitsExponentDigits+dozensExponentDigits+hundredsExponentDigits == num)
                System.out.print(num +", ");

        }

    }
}
