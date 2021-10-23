
public class SpacedLogger {

  public void log(String log) {
    //need 1st method from logger
    //Put spaces between each character in string
    //need while loop b/c length of log is not known
    //create a while loop to run through each character of string
  
    int lengthOfString = log.length();
    int index = 0;
    //String spacedWord = "";
    while (index < lengthOfString) {
    //spacedWord = spacedWord + log.charAt(index) + " ";
      System.out.print(log.charAt(index) + " ");
      index++;
    
      }
    
    System.out.println(); 

    }

  public void error(String error) {
    //need 2nd method from logger
    //want to space out the letters but add Error to it
    int lengthOfString = error.length();
    int index = 0;
    //String spacedWord = "";
    System.out.print("Error: " ); 
    while (index < lengthOfString) {
      System.out.print(error.charAt(index) + " ");
      index++;
      //if (index == lengthOfString){
      //  System.out.println("/r/n");
      // }     
        
      }
    System.out.println(); 
  
    }
  
  
  
}
