package com.ironyard;

import java.util.List;

/**
 * Created by Raul on 10/20/16.
 */
public class Logickata {
    public static int caughtSpeeding(int speed, boolean birthday)

    {
        if(birthday)
            speed -= 5;
        if(speed <= 60)
            return 0;
        else if(speed <= 80)
            return 1;
        else
            return 2;
    }
    public static int sortaSum(int a, int b){

        int sum = a + b;
        if(sum >= 10 && sum <= 19)
            return 20;
        return sum;
    }

    public static boolean love6(int a, int b){

        if(a == 6 || b == 6)
            return true;
        return ((a + b) == 6|| Math.abs(a - b) == 6);
    }

    public static String blackJack(List<Integer> dealer, List<Integer> player){
        String result = null;
        int x = 0;
        int y = 0;

        for (int i = 0; i < dealer.size(); i++) {
            x = x + dealer.get(i);
        }

        for ( int a = 0; a < player.size(); a++){
            y = y + player.get(a);
        }

          if (x>y && x<=21||y>=21){
             result = "Dealer";
          }
           else{
            result ="Player";
        }
        if (x==21||y==21){
            result =result +"BlackJack";
        }

       return result;
    }
}
