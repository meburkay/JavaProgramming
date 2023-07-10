package day04_Variables;

public class PrimitivesIntro {

    public static void main(String[] args) {

        // age: 38 years old
        byte age = 38;

        //weight: 160 pounds
        //byte weight = 160; // is out of byte's range
        short weight = 160; // 160 is within the range of short

        //salary: 100000 $
        //short salary = 100000; // 100000 is out of short' range
        int salary = 100_000; // int is preferred data type for integer numbers.

        long asset = 3_333_333_333L; //upper or lower case L at the end of the number.


        //tax: 0.26
        float tax = 0.26F;

        double PI = 3.14; //double is the preferred type for all the decimals

        char ch1 = '#';
        System.out.println("chi = " + ch1);

        char ch2 = 35;
        System.out.println("chi2 = " + ch2);

        char ch3 = 45000;
        System.out.println("ch3 = " + ch3);

        char gender = 'F';

        char grade = 'B';

        char yesNo = 'Y';

        boolean isEmployeed = true;

        boolean isMarried = false;

        boolean result = 100 > 300;

        System.out.println("result = " + result);
        System.out.println("isMarried = " + isMarried);
        System.out.println("isEmployeed = " + isEmployeed);

        String name = "Wooden Spoon";
        String city = "Ankara";
        String state = "Virginia";
        String country = "Turkiye";
        System.out.println("name = " + name);

        String _$first = "emre";








    }

}
