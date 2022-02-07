import java.util.Scanner;

class Refrigerator extends Mprocess {
    Scanner rf = new Scanner(System.in);

    @Override
    void door() {
        System.out.println("Available Refrigerators with particular Door");
        System.out.println("1.Single Door" + "\n" + "2.Double Door" + "\n" + "Enter your Door Choice");
        int choice = rf.nextInt();
    }

    @Override
    void colour() {
        System.out.println("Available Colours");
        System.out.println("1.White" + "\n" + "2.Red" + "\n"
                + "Enter your Colour Choice");
        int colour = rf.nextInt();
    }

    @Override
    void size() {
        System.out.println("Available Capacity for Refrigerator");
        System.out.println("1.500Liters" + "\n" + "2.250Liters" + "\n"
                + "Enter your Capacity Choice");
        int size = rf.nextInt();

    }

    @Override
    void temperature() {
        System.out.println("Temperature");
        System.out.println("1.High" + "\n" + "2.Medium" +
                "\n " + "3.Low" + "\n" + "Enter your Temperature Choice");
        int temp = rf.nextInt();
        System.out.println("You can change the temperature by adjusting temperature button");
    }
}
