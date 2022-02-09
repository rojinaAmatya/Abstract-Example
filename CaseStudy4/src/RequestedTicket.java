import java.util.Scanner;

public class RequestedTicket {
    void request() {
        Scanner rt = new Scanner(System.in);
        System.out.println("Check Available Tickets");
        int availablility = rt.nextInt();
        if (availablility== 1) {
            System.out.println("First Class Available");
            System.out.println("Enter your Name");
            String pname = rt.next();
            System.out.println("Enter your Phone Number");
            double pno = rt.nextDouble();
            System.out.println("Your ticket is Requested");
        }
        else if (availablility == 2)
        {
            System.out.println("Not Available");
        }
    }
}
