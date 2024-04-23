
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double taxa = 0;
        System.out.println("Value of the gift?");
        int valueGift = Integer.valueOf(scan.nextLine());
        
        if (valueGift < 5000) {
            System.out.println("No tax!");
        }else if ((valueGift >= 5000) && (valueGift < 25000)) {
            taxa = (100 + (valueGift - 5000) * 0.08);
            System.out.println("Tax: " + taxa);
        }else if((valueGift >= 25000) && (valueGift < 55000)) {
            taxa = (1700 + (valueGift - 25000) * 0.1);
            System.out.println("Tax: " + taxa);
        }else if((valueGift >= 55000) && (valueGift < 200000)) {
            taxa = (4700 + (valueGift - 55000) * 0.12);
            System.out.println("Tax: " + taxa);
        }else if((valueGift >= 200000) && (valueGift < 1000000)) {
            taxa = (22100 + (valueGift - 200000) * 0.15);
            System.out.println("Tax: " + taxa);
        }else {
            taxa = (142100 +(valueGift - 1000000) * 0.17);
            System.out.println("Tax: " + taxa);
        }
        
        
    }
}
