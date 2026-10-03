import java.util.Scanner;
 public class Household{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);

        int familyMembers;
        familyMembers = sc.nextInt();
        double waterInLiters;
           waterInLiters = sc.nextDouble();
           int houseNumber;
           houseNumber = sc.nextInt();
          char usageStatus;
          usageStatus = sc.next().charAt(0);
            
          System.out.println("Number of family Members:"+familyMembers);
          System.out.println("Water in Liters:"+ waterInLiters);
          System.out.println("House Number :"+houseNumber);
           if (usageStatus == 'A'){
            System.out.println("Water Usage status is Active");
           }
           else if (usageStatus == 'B'){
            System.out.println("water Usage Status is Blocked");
           }
       else {
        System.out.println("Water Usage Status is Inactive");
       }
       sc.close();
    }
    
 }
