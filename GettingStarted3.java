//Avi Mahajan If user gets question right the green button will light up If they get it wrong red button will light up.
package gettingstarted;

//Add Phidgets Library 
import com.phidget22.*;

public class GettingStarted3 {
    //Handle Exceptions 
    public static void main(String[] args) throws Exception{

        //Create 
        DigitalInput redButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();
        DigitalInput greenButton = new DigitalInput();
        DigitalOutput greenLED = new DigitalOutput();

        //Address 
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);

        //Open 
        redButton.open(1000);
        redLED.open(1000);
        greenButton.open(1000);
        greenLED.open(1000);
        boolean ans = true;

        //Use your Phidgets 
        while(true){
			
			if (ans == true) {

            if( greenButton.getState() == true){
                greenLED.setState(true);
            } else {
                redLED.setState(true);
            }
		}
              if(ans == false){

            if(greenButton.getState() == true){
                redLED.setState(true);
            } else {
                greenLED.setState(true);
            }

            Thread.sleep(150);
        }
       }
   }
}
        
    
