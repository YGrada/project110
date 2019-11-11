package edu.ucsd.cs110.temperature;

public class Celsius extends Temperature
{

    public Celsius (float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return this;
    }

    @Override
    public Temperature toFahrenheit() {
        float t = (9 *( this.getValue() )/5) + 32;
        return new Fahrenheit(t);
       }


    public String toString ()
    {
        // TODO: Complete this method
        float t = this.getValue();
        return ""+ t +" C";
    }
}
