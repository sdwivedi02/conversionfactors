import java.util.Scanner;

public class conversion {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        conversion ps = new conversion();
      }

      public void conversion() {

      System.out.print("Enter an origin unit: ");
      String originUnit = in.nextString();

      System.out.print("Enter a destination unit: ");
      String destinationUnit = in.nextString();

      System.out.print("Enter a value: ");
      int value = in.nextInt();

      if (originUnit == "miles" && destinationUnit == "inches") {
        double milesToInches = value * 63360;
        String milesToInchesRounded = String.format("%,.2f", milesToInches);
        System.out.println("There are "+milesToInchesRounded+" inches in"+value+" miles.");
      } else if (originUnit == "miles" && destinationUnit == "feet") {
        double milesToFeet = value * 5280;
        String milesToFeetRounded = String.format("%,.2f", milesToFeet);
        System.out.println("There are "+milesToFeetRounded+" feet in"+value+" miles.");
      } else if (originUnit == "miles" && destinationUnit == "yards") {
        double milesToYards = value * 1760;
        String milesToYardsRounded = String.format("%,.2f", milesToYards);
        System.out.println("There are "+milesToYardsRounded+" yards in"+value+" miles.");
      } else {
        System.out.print("Enter an origin unit: ");
        String originUnit = in.nextString();

        System.out.print("Enter a destination unit: ");
        String destinationUnit = in.nextString();

        System.out.print("Enter a value: ");
        int value = in.nextInt();
      }

    }
  }
