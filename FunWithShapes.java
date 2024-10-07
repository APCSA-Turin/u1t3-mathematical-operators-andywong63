public class FunWithShapes {
    public static void main(String[] args) {

        // prism variables
        String shapeName = "rectangular prism";
        int length = 9;
        int width = 10;
        int height = 15;

        // print prism info
        System.out.println("***********");
        System.out.println("My " + shapeName + " has these dimensions:");
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);

        // calculate and print volume
        int volume = length * width * height;
        System.out.println("Volume: " + volume);

        // calculate and print average side length
        // NOTE: we intentionally divide by 3.0 here instead of 3 so that
        // Java performs division with an int and a double, rather
        // than two ints -- this allows for proper decimal results to be printed
        double averageSide = (length + width + height) / 3.0;

        System.out.println("Average side length: " + averageSide);
        System.out.println("***********");

        // circle variables
        String shapeName2 = "circle";
        double radius = 4.5;
        final double PI = 3.14159; // approximate
        System.out.println("My " + shapeName2 + " has radius: " + radius);

        // calculate and print area
        double area = PI * radius * radius; // area must be a double because PI and radius are doubles

        System.out.println("Area: " + area);
        System.out.println("***********");
    }
}