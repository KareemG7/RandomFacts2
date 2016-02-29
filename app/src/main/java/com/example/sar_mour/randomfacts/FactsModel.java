package com.example.sar_mour.randomfacts;

import java.util.Random;

/**
 * Created by sar_mour on 2/1/2016.
 */
public class FactsModel {

    public static String getCrazyFact(){
        String[] crazyfacts = {"The PlayStation was initially planned to be a Super" +
                " Nintendo optical drive.","Sonic the hedgehog initially had a girlfriend" +
                " called Madonna.","The total number of people that have ever lived: 107" +
                " Billion."};
        Random random = new Random();
        String Random = (crazyfacts[new Random().nextInt(crazyfacts.length)]);

        return Random;
    }

    public static String getSportsFact(){
        String[] sportfacts = {"The Montreal Canadiens have 10 more Cups than the next" +
                " team on the list.", "The first Olympic Games were held on the plains of" +
                " Olympia in 776BC until the Roman emperor Theodosius closed them," +
                " accusing them of being cult activities.", "Wrestling, swimming, and" +
                " archery are considered the first sport ever practiced with neolithic" +
                " rock art depicting them dating to 6000BC."};
        Random random = new Random();
        String Random = (sportfacts[new Random().nextInt(sportfacts.length)]);
        return Random;
    }

}
