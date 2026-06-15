import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Write your solution here
        int totalClasses = sc.nextInt();
        int attendedClasses = sc.nextInt();

        int attendancePercent = (attendedClasses/totalClasses)*100;
        if(attendancePercent >= 75){
            System.out.println("Eligible");
        }else{
            System.out.println("Not Eligible");
        }
    }
}