import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
      double startLat;
      double endLat;
      double startLong;
      double endLong;
    Scanner scanner = new Scanner(System.in);

      System.out.print("Enter the latitude of the starting location: ");
      startLat = scanner.nextDouble();
      System.out.print("Enter the longitude of the starting location: ");
      startLong = scanner.nextDouble();
      System.out.print("Enter the latitude of the ending location: ");
      endLat = scanner.nextDouble();
      System.out.print("Enter the longitude of the ending location: ");
      endLong = scanner.nextDouble();

        GeoLocation myGeoLocation1 = new GeoLocation(startLat,startLong);
        GeoLocation myGeoLocation2 = new GeoLocation(endLat,endLong);
      
      System.out.print("The distance is " + myGeoLocation1.distanceFrom(myGeoLocation2)+ " miles");
    }
}