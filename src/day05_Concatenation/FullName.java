package day05_Concatenation;

public class FullName {

    public static void main(String[] args) {

        String firstName = "Mehmet Emre";
        String lastName = "Burkay";
        int age = 39;
        String jobTitle = "SDET";
        String companyName = "Apple Inc";
        double salary = 100000.58;

        String fullName = firstName + " " + lastName;

        System.out.println(fullName);


        //Full name of the person is ___________

        System.out.println("Full name of the person is " + fullName);

        //__________ is ______ years old

        System.out.println(fullName + " is " + age + " years old");

        //FullName is JobTitle +, works at + CompanyName, and fullName's salary is salary

        System.out.println(fullName + " is " + jobTitle + ", works at " + companyName +", and " + fullName + "'s salary is $" + salary);


    }

}
