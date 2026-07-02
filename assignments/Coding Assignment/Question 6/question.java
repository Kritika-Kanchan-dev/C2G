import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Write your solution here
        int currentData = sc.nextInt();
        int newPackData = sc.nextInt();
        int finalData;

        if(currentData <= 2){
            finalData = currentData + newPackData;
        }else{
            finalData = 2 + newPackData;
        }

        System.out.println(finalData);
    }
}