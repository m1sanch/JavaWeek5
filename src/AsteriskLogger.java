
public class AsteriskLogger implements Logger{


public void log(String log) {
  //need 1st method from logger
  //Add 3 * before/after each string passed through it
  System.out.println("***" + log + "***");
}



public void error(String error) {
//need 2nd method from logger
// Error to print with 3 * if a string is passed through it
  System.out.print("**********");
  for(int index = 0; index < error.length(); index++) {
    System.out.print("*");
    if (index == (error.length() -1)) {
      System.out.print("***\r\n");
    }
  }
  System.out.println("***Error: " + error + "***");
  System.out.print("**********");
  for(int index = 0; index < error.length(); index++) {
    System.out.print("*");
    if (index == (error.length() -1)) {
      System.out.print("***\r\n");
    }
  }
}


}
