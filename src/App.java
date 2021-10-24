
public class App {

  public static void main(String[] args) {
    
    String instanceTest = "Testing Logger Interface";
    String instanceTest2 = "Hello World";
    
    //Instance of AsteriskLogger class for log and error method
    AsteriskLogger instanceAsterisk = new AsteriskLogger();
    instanceAsterisk.log(instanceTest);
    instanceAsterisk.error(instanceTest);
    
    instanceAsterisk.error(instanceTest2);
    
    //Instance of SpacedLogger class for log and error method
    SpacedLogger instanceSpaced = new SpacedLogger();
    instanceSpaced.log(instanceTest);
    instanceSpaced.error(instanceTest);
  
  }
  //end of main method  
 }
