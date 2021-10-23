
public class AsteriskLogger {


public void log(String log) {
  //need 1st method from logger
  //Add 3 * before/after each string passed through it
  System.out.println("***" + log + "***");
}



public void error(String error) {
//need 2nd method from logger
// Error to print with 3 * if a string is passed through it
  System.out.println("***Error: " + error + "***");
}


}
