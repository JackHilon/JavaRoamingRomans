package javaroamingromans;

import java.util.Scanner;

public class JavaRoamingRomans {

    // https://open.kattis.com/problems/romans
    // simple calcultion program
    // accepted in kattis
    // (1 roman mile = 1000 pace)(1 roman mile = 4854 feet) (1 english mile = 5280 feet)
    
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        
        double myValue= GetDouble(in);
        System.out.println(Round(EnglishMile2Pace(myValue)));
        
    }

    private static double GetDouble(Scanner input) {
        try {
            double res = Double.parseDouble(input.nextLine());
            return res;
        } catch (Exception e) {
            return GetDouble(input);
        }
    }
    private static double EnglishMile2Pace(double englishMile)
    {
        double pace = englishMile*1000.0*(5280.0/4854.0);
        return pace;
    }
    private static long Round(double value)
    {
        return Math.round(value);
    }
}
