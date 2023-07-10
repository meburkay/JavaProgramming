package day03_EscapeSequences;
/*
Escape Squences: Must be given with double quote
                    \n: starts a new line
                    \t: (tab) paragraph space
                    \\: one backslash
                    \": double quote
 */
public class EscapeSquences {

    public static void main(String[] args) {

        System.out.println("Java \nPython C#");

        System.out.println("----------------------------------------");

        System.out.println("Hello Cydeo \nHow are you all today? \nIt's nice to see you all! \nWhat class do we have next week?");

        System.out.println("----------------------------------------------");
        System.out.println("\tJava is cool programming.");

        System.out.println("-------------------------------");

        System.out.println("/ \\"); //in order to print one backward slash we need to give two backward slashes

        System.out.println("-------------------------------------");

        System.out.println("My favorite TV show is \"Game of Thrones\"");

    }

}
