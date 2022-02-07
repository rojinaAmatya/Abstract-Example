import java.util.Scanner;

public class MoonRefrigerator {
    public static void main(String[] args) {
        Scanner mr = new Scanner(System.in);
        System.out.println("Welcome to Moon Refrigerators");
        System.out.println("------------------------------");
        Mprocess mrf = new Refrigerator();
        Wiring mm = new Wiring();
        mm.setWiringType(mm.getWiringType());
        mrf.door();
        mrf.size();
        mrf.temperature();
    }
}
