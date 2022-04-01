package cqs;

import java.util.ArrayList;
import java.util.List;

public class IceCream {
    List temperatureReadings;  
    private int currentTemperature = 0;
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public int setTemperature(int temperature){
        if (temperature > 10){
            temperature = 10;
        }
        
        temperatureReadings.add(currentTemperature);
        this.currentTemperature = temperature;
        
        return currentTemperature;
    }
    
    public List getTemperature(){
        temperatureReadings.add(currentTemperature);
        
        if(currentTemperature > 10){
            alert(currentTemperature);
        }
        return temperatureReadings; //just added return statement to stop error
    }
    
    public void alert(int temperature){
        System.out.println("Ice-cream machine too warm. Temperature: " + temperature);
    }
    
}
