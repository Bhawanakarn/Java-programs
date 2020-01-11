package com.example.couldthisbelove;

import java.util.Random;

public class LoveCalculator {
    public static void main(String[] args) {
        System.out.println("Your Love core is " + ifyouhadmylove("philip ", " jenny from the block"));

    }

    public static int ifyouhadmylove(String yourname, String theirname) {
        Random randobject = new Random();
        int LoveScore = randobject.nextInt(101);

        if(LoveScore > 80){
            System.out.println(yourname + " and " + theirname + " love each other like Kanye and Kanye ");
        }
        else if(LoveScore > 40) {
            System.out.println(yourname + " and " + theirname + " you go together ike coke and mentos ");
        }
        else {
            System.out.println(yourname + " and " + theirname +" No love possible. you will be forever alone...");
        }


        return LoveScore;
    }
}
