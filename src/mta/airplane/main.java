package mta.airplane;

import mta.airplane.airplanes.Boeing;
import mta.airplane.interfaces.airplane;
import mta.airplane.exceptions.airplaneException;

/**
 * Created by Sorin on 11/2/2014.
 */
public class main {

    public static void main (String[] args)
    {
        airplane plane1 = new Boeing(23);
        Boeing plane2 = new Boeing(250,"757");

        try{
            plane1.printName();
        }
        catch (Exception e)
        {
            e.getMessage();
        }

        try{
            plane2.printName();
        }
        catch (Exception e)
        {
            e.getMessage();
        }
    }
}
