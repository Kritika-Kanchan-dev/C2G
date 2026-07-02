import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Write your solution here
        String light = sc.nextLine();
        if(light == "Red"){
            System.out.println("Stop");
        }else if(light == "Yellow"){
            System.out.println("Wait");
        }else{
            System.out.println("Go");
        }
    }
}