package week9.library;

import week9.library.measurements.ConstantSensor;
import week9.library.measurements.Sensor;
import week9.library.measurements.Thermometer;

public class Ex20 {
    public static void main(String[] args) {
        Sensor kumpula = new Thermometer();
        kumpula.on();
        System.out.println("the temperature in Kumpula is "+kumpula.measure() + " degrees");
        kumpula.off();
        System.out.println("the temperature in Kumpula is "+kumpula.measure() + " degrees");
    }
}
