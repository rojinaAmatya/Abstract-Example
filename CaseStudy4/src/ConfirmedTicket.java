import java.util.Scanner;

public class ConfirmedTicket extends RequestedTicket{
    static int seatno;
    static double Phonenumber;
    static String name;

    void confirmed() {
        Scanner ct = new Scanner(System.in);
        ConfirmedTicket bc = new ConfirmedTicket();
        System.out.println("Check Available Tickets");
        int availability = ct.nextInt();

        if(availability ==1){
            System.out.println("Enter your Name");
            String pname = ct.next();
            name=pname;
            System.out.println("Enter your Phone Number");
            double pno = ct.nextDouble();
            Phonenumber=pno;
            System.out.println("Available seat numbers are 20" + "\n"
                    + "Enter your Desired Seat Number");

            int sno = ct.nextInt();
            if (sno >= 1 && sno <= 20) {
                seatno=sno;
                System.out.println("Your ticket is Conformed");

                System.out.println(KaveriTravels.sdestination+"\n"+KaveriTravels.stime+
                        "\n"+KaveriTravels.sdate+"\n"+ ConfirmedTicket.seatno);

                System.out.println(ConfirmedTicket.name+"\n"+ConfirmedTicket.Phonenumber);
            }
            else{
                System.out.println("Not applicable");
            }
        }
        else if(availability ==2){
            System.out.println("Tickets not Available"+"\n"+"Waiting list");
            bc.request();//calling request method
        }

    }// end of confirmed

}
