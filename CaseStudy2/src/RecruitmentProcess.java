import java.util.Scanner;

public class RecruitmentProcess {
    static String RecruitmentProcess;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Recruitment Process"+"\n"+"1.ExternalRp"+"\n"+"2.EmployeeRp"); int Process = sc.nextInt();
        if (Process== 1) {
            Recruitment rp = new ExternalRp();
            RecruitmentProcess="External RecruitmentProcess ";
            rp.procedure();
        }
        else if (Process == 2) {
            Recruitment rp = new EmployeeRp();
            RecruitmentProcess="Employee Rreferal Process";
            rp.procedure();
        } }
}
