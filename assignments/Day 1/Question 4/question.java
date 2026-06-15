import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Write your solution here
        String username = sc.nextLine();
        boolean valid = true;
        if(username.length>= 8 && !username.contains(" ") && username.matches(".*\\d.*") && username.matches(".*[a-zA-Z].*")){
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }
    }
}