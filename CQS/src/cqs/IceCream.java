package cqs;
import java.util.List;

public class IceCream {
    List temperatureReadings;  
    private int currentTemperature = 0;
    
    public static void main(String[] args) {
      
    }
    
    public void setTemperature(int temperature){    //we have changed this method
        if (temperature > 10){                      //to a void return type, i.e.
            temperature = 10;                       //it doesn't return anything
        }
        temperatureReadings.add(currentTemperature);//because it is now void, we 
        this.currentTemperature = temperature;      //have had to remove the return
                                                    //statement
    }
    
    public int getTemperature(){                    //the getTemperature method,
        return currentTemperature;                  //ONLY returns the current temp
    }
    
    public void startMonitor(){                     //We have implemented a new 
        if(currentTemperature > 10){                //method which monitors the temp
            alert(currentTemperature);              //and calls the alert method
        }                                           //if needed
    }
    
    public List getTemperatureReadings(){           //the list only returns the 
        return temperatureReadings;                 //returns the temperatureReadings
        }                                           //List 
    
    public void alert(int temperature){
        System.out.println("Ice-cream machine too warm. Temperature: " + temperature);
    }   
}
