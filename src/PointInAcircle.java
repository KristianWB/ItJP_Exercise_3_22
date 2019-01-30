import java.util.Scanner;

public class PointInAcircle {
    public static void main(String[] args)   {
        Scanner input = new Scanner(System.in);

        System.out.print(
                "Enter the x coordinate in (x,y): "
        );
        double x = input.nextDouble();

        System.out.print(
                "Enter the y coordinate in (x,y): "
        );
        double y = input.nextDouble();

        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        System.out.print(
                "The distance is: " + distance
        );

        if (distance <= 10)
            System.out.print(
                    "The point is within the circle"
            );
        else
            System.out.print(
                    "The point is not within the circle"
            );

    }

}
