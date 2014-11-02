package mta.airplane.airplanes;

/**
 * Created by Sorin on 11/2/2014.
 */
public abstract class general {

    private String airplaneName;

    public general(String Name)
    {
        airplaneName = Name;
    }

    public general()
    {
        airplaneName = null;
    }

    public String getName()
    {
        return airplaneName;
    }

    public abstract void printMessage();

}
