
public class SpacedLogger implements Logger{

  public void log(String log) {
    //need 1st method from logger
    //Put spaces between each character in string
    //need while loop b/c length of log is not known
    //create a while loop to run through each character of string
  
    int lengthOfString = log.length();
    int index = 0;
    while (index < lengthOfString) {
      System.out.print(log.charAt(index) + " ");
      index++;    
      }
    
    System.out.println(); 
    //end of log method
    }

  public void error(String error) {
    //need 2nd method from logger
    //want to space out the letters but add Error to it
    int lengthOfString = error.length();
    int index = 0;
    System.out.print("Error: " ); 
    while (index < lengthOfString) {
      System.out.print(error.charAt(index) + " ");
      index++; 
      }
    
    System.out.println(); 
    //end or error method
    }
  
  
  
}
