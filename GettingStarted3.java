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
        
        System.out.println("Welcome to True or False Recursion Game. The questions will be displayed on the doodlepad as well as the console");
        System.out.println("Press Green if you think the statement is true or Red if you think it true"); 
      

        //Use your Phidgets 
        while(true){
		
		  boolean ans = true;
			
			if (ans == true) {
				
		

            if( greenButton.getState() == true){
                greenLED.setState(true);
                System.out.println("Correct");
                Thread.sleep(150);
                greenLED.setState(false);
                redLED.setState(false);
                break;
            } else if (redButton.getState() == true) {
                redLED.setState(true);
                System.out.println("Incorrect");
                Thread.sleep(150);
                redLED.setState(false);
                greenLED.setState(false);
                break;
            }
		}
              if(ans == false){

            if(greenButton.getState() == true){
                redLED.setState(true);
                System.out.println("Incorrect");
                Thread.sleep(150);
                greenLED.setState(false);
                redLED.setState(false);
                break;
            } else if (redButton.getState() == true) {
                greenLED.setState(true);
                System.out.println("Correct");
                Thread.sleep(150);
                greenLED.setState(false);
                redLED.setState(false);
                break;
            }


        }
       }
       
         while(true){
		
		  boolean ans = false;
			
			if (ans == true) {
				
		

            if( greenButton.getState() == true){
                greenLED.setState(true);
                System.out.println("Correct");
                Thread.sleep(150);
                greenLED.setState(false);
                redLED.setState(false);
                break;
            } else if (redButton.getState() == true) {
                redLED.setState(true);
                System.out.println("Incorrect");
                Thread.sleep(150);
                redLED.setState(false);
                greenLED.setState(false);
                break;
            }
		}
              if(ans == false){

            if(greenButton.getState() == true){
                redLED.setState(true);
                System.out.println("Incorrect");
                Thread.sleep(150);
                greenLED.setState(false);
                redLED.setState(false);
                break;
            } else if (redButton.getState() == true) {
                greenLED.setState(true);
                System.out.println("Correct");
                Thread.sleep(150);
                greenLED.setState(false);
                redLED.setState(false);
                break;
            }


        }
       }
         while(true){
		
		  boolean ans = false;
			
			if (ans == true) {
				
		

            if( greenButton.getState() == true){
                greenLED.setState(true);
                System.out.println("Correct");
                Thread.sleep(150);
                greenLED.setState(false);
                redLED.setState(false);
                break;
            } else if (redButton.getState() == true) {
                redLED.setState(true);
                System.out.println("Incorrect");
                Thread.sleep(150);
                redLED.setState(false);
                greenLED.setState(false);
                break;
            }
		}
              if(ans == false){

            if(greenButton.getState() == true){
                redLED.setState(true);
                System.out.println("Incorrect");
                Thread.sleep(150);
                greenLED.setState(false);
                redLED.setState(false);
                break;
            } else if (redButton.getState() == true) {
                greenLED.setState(true);
                System.out.println("Correct");
                Thread.sleep(150);
                greenLED.setState(false);
                redLED.setState(false);
                break;
            }


        }
          while(true){
		
		  boolean ans = false;
			
			if (ans == true) {
				
		

            if( greenButton.getState() == true){
                greenLED.setState(true);
                System.out.println("Correct");
                Thread.sleep(150);
                greenLED.setState(false);
                redLED.setState(false);
                break;
            } else if (redButton.getState() == true) {
                redLED.setState(true);
                System.out.println("Incorrect");
                Thread.sleep(150);
                redLED.setState(false);
                greenLED.setState(false);
                break;
            }
		}
              if(ans == false){

            if(greenButton.getState() == true){
                redLED.setState(true);
                System.out.println("Incorrect");
                Thread.sleep(150);
                greenLED.setState(false);
                redLED.setState(false);
                break;
            } else if (redButton.getState() == true) {
                greenLED.setState(true);
                System.out.println("Correct");
                Thread.sleep(150);
                greenLED.setState(false);
                redLED.setState(false);
                break;
            }


        }
   }
}
        
    
