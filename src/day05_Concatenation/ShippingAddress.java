package day05_Concatenation;

public class ShippingAddress {

    public static void main(String[] args) {
        /*
        String name = "Emre";
        String buildingNumber = "11821B";
        */
        /*
        String name = "Emre",
                buildingNumber = "11821B",
                streetName = "Sanatoryum",
                city = "Ankara",
                state = "Keçiören",
                zipCode = "22031A";
         */

        String name = "Emre";
        String buildingNumber = "11821B";
        String streetName = "Sanatoryum";
        String city = "Ankara";
        String state = "Keçiören";
        String zipCode = "22031A";

        System.out.println(name + "\n" + buildingNumber + " " + streetName + "\n" + city + ", " + state + " " + zipCode );

        String address = name + "\n" + buildingNumber + " " + streetName + "\n" + city + ", " + state + " " + zipCode;

        System.out.println(address);



    }

}
/*
Declare the following variables:
    name
    buildingNumber
    streetName
    city
    state
    zipCode

Use concatenation to print the full shipping address
 */