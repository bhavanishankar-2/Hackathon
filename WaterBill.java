import java.util.Scanner;
public class WaterBill {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int consumption;
        consumption = sc.nextInt();
        int billAmount1 = 100;
        int billAmount2 = 200;

        if(consumption <= 500){
            System.out.println("Water Bill Amount is :"+billAmount1);
        }
        else if (consumption > 500){
            System.out.println("water Bill Amount is :"+billAmount2);
        }
    }
}
