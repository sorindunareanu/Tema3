package mta.airplane.exceptions;

/**
 * Created by Sorin on 11/2/2014.
 */
public class airplaneException extends Exception {

    public airplaneException(String msg)
    {
        super(msg);
        System.out.println("This is from airplane Exception");
    }
}
