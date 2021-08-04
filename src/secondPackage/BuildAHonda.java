package secondPackage;

import java.sql.SQLOutput;

public class BuildAHonda {

    public static void main(String[] args) {

        Honda Civic = new Honda();
        Honda Accord = new Honda();
        Honda CRV = new Honda();

        Civic.model = "Civic";
        Accord.model = "Accord";
        CRV.model = "CRV";

        Civic.color = "Black";
        Accord.color = "White";
        CRV.color = "Silver";

        Civic.isHybrid = true;
        Accord.isHybrid = true;
        CRV.isHybrid = true;

        Civic.size = "Sedan";
        Accord.size = "Sedan";
        CRV.size = "SUV";

        Civic.doors = 4;
        Accord.doors = 4;
        CRV.doors = 5;

        Civic.seatsMaterial = "Leather";
        Accord.seatsMaterial = "Cloth";
        CRV.seatsMaterial = "Leather";

//        System.out.println(Accord.model + " is a car manufactured by " + Accord.manufacturer);
//        System.out.println(Accord.model + " is a " + Accord.color + " car and it's a " + Accord.size + " and it has " +
//                Accord.doors + " doors and " + Accord.seatsMaterial + " seats.");
//
//        if (Accord.isHybrid) {
//            System.out.println("This Vehicle is a hybrid");
//        }
//
//        else {
//            System.out.println("This Vehicle is not a hybrid");
        }

//        System.out.println(Civic.model + " is a car manufactured by " + Civic.manufacturer);
//        System.out.println(Civic.model + " is a " + Civic.color + " car and it's a " +
//                Civic.size + " and it has " + Civic.doors + " doors and " + Civic.seatsMaterial + " seats."
//                );
//
//        if (Civic.isHybrid) {
//            System.out.println("This Vehicle is a hybrid");
//        }
//
//        else {
//            System.out.println("This vehicle is not a hybrid");
//
//        }

       // System.out.println("The vehicle is Hybrid: " + Civic.isHybrid);



    }






}
