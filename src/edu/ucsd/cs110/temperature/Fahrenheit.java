package edu.ucsd.cs110.temperature;

public class Fahrenheit extends Temperature {
        public Fahrenheit (float t)
        {
            super(t);
        }


    @Override
    public Temperature toCelsius() {
            float x = (((this.getValue()) - 32) *5)/9;
            return new Celsius(x);
    }

    @Override
    public Temperature toFahrenheit() {
        return this;
    }

    public String toString()
        {
            // TODO: Complete this method
            float t = this.getValue();
            return ""+ t +" F";
        }

}
