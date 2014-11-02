package mta.airplane.airplanes;
import mta.airplane.exceptions.airplaneException;
import mta.airplane.interfaces.airplane;
/**
 * Created by Sorin on 11/2/2014.
 */
public class Boeing extends general implements airplane {

    private int passengerNumber;

    public Boeing(int number, String Name)
    {
        super(Name);
        passengerNumber=number;
    }

    public Boeing(int number)
    {
        super(null);
        passengerNumber=number;
    }

    @Override
    public void printName() throws airplaneException
    {
        if (getName() == null)
        {
            throw new airplaneException("No name for airplane");
        }
        System.out.println(getName() + " " + passengerNumber);
    }

    @Override
    public void printMessage()
    {
        System.out.println("Custom Message");
    }

    public int getNumber()
    {
        return passengerNumber;
    }
}
