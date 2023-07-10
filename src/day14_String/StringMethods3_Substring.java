package day14_String;

public class StringMethods3_Substring {

    public static void main(String[] args) {
        //substring(beginning index, ending index )

        String word = "Cydeo School";
        //             012345...

       String brand = word.substring(0, 4+1);

        System.out.println(brand);

        String str1 = word.substring(6);

        System.out.println(str1);

        System.out.println("-----------------------------------");
        String word2 = "Python C# Ruby";

        String s1 = word2.substring(0,  word2.indexOf(" ") ); //"Python"

        String s2 = word2.substring( word2.indexOf(" ")+1 ,   word2.lastIndexOf(" ") ); //"C#"

        String s3 = word2.substring( word2.lastIndexOf(" ")+1  ); //"Language"

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println("------------------------------------------");

        String word4 = " Java Programming Language ";

        String word3 = word4.trim();

        String w1 = word3.substring(0,word3.indexOf(" "));
        String w2 = word3.substring(word3.indexOf(" ")+1,word3.lastIndexOf(" "));
        String w3 = word3.substring(word3.lastIndexOf(" ")+1);

        System.out.println("word3 = " + word3);
        System.out.println("w1 = " + w1);
        System.out.println("w2 = " + w2);
        System.out.println("w3 = " + w3);




    }

}
