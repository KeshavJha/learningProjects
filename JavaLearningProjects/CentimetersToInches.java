public class CentimetersToInches {
  public static void main(String[] args) {
    double centimeters ;
    System.out.println("Enter the value to convert");
    //@TODO How to read input entered here ??? Need to really understand the input and output stream and buffers this time
    centimeters = System.in.read( /* How to read input entered here ??? */);
    System.out.println("Value in inches would be : " + centimeters / 2.54 );
  }
}

//@TODO Write a test class for this class ...
// Will need to test boundary conversions ... should negative numbers be coverted , what is the max value conversion possible .
// What other tests should I try ???
