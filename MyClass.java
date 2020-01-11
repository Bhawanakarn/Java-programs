package com.example.javapractice;

public class MyClass {
    public static void main(String[] args) {


        /* //From lecture 59 i.e. Section 6: Java Programming for Beginners
        System.out.println("Hello World!!");

        double myCash;
        myCash=100;
        int monthlySalary = 20;
        final double UK_VAT_RATE = 0.20;

        String maincourse = "Fish";
        String side = "chips";

        double COST_OF_FISH = 5.60;
        double COST_OF_CHIPS = 2.65;

        System.out.println("My favorite food is: " + maincourse + "" + side);
        System.out.println("Initial funds are " + myCash);

        myCash = 150;
        System.out.println("Now I have got " + myCash);
        System.out.println("Payday. Got " + (myCash + monthlySalary));

        myCash = myCash - (COST_OF_FISH + COST_OF_CHIPS)*(1 + UK_VAT_RATE);

        System.out.println("Had my pub lunch. Funds depleted to "+ myCash);
*/

        //getMilk(); // lecture 61

//        getMilk(2);//lecture 62
//        getMilk(15);//lecture 62

//        int change = getMilk(6,50); //lecture 63
//        System.out.println("HELLO master, your change is " + change + " pounds!"); //lecture 63


    }

//    //From lecture 61 i.e. Section 6: Java Programming for Beginners
   public static void getMilk() {
       System.out.println("Open Door!");
       System.out.println("Walk to Store.");
       System.out.println("Buy Milk on the ground floor");
       System.out.println("Return home with Milk galon");
   }


        // From Lecture 62 i.e. Section 6: Java Programming for Beginners
       public static void getMilk( int numofCartonsToBuy) {

       int priceToPay = numofCartonsToBuy * 2;

       System.out.println("Open Door!");
       System.out.println("Walk to Store.");
       System.out.println("Buy " + numofCartonsToBuy + " Milk on the ground floor");
       System.out.println("Pay "+ priceToPay + " pounds! but no more");
       System.out.println("Return home with Milk galon");
   }

     // From Lecture 63 i.e. Section 6: Java Programming for Beginners
           public static int getMilk( int numofCartonsToBuy, int startingAmount) {

           int priceToPay = numofCartonsToBuy * 2;

           System.out.println("Open Door!");
           System.out.println("Walk to Store.");
           System.out.println("Buy " + numofCartonsToBuy + " Milk on the ground floor");
           System.out.println("Pay "+ priceToPay + " pounds! but no more");
           System.out.println("Return home with Milk galon");

           return startingAmount - priceToPay;
       }

}
