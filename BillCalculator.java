import java.util.*;
class ElectricitybillCalculator{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
          System.out.println(   "enter units consumed: ");
          int units=sc.nextInt();
          double bill;
          if (units<=100){
             bill=units*5;
          }
          else if (units<=200){
            bill=(100*5)+(units-100)*7;
          }
          else if (units <= 300) {
            bill = (100 * 5) + (100 * 7) + (units - 200) * 10;
        } 
        else {
            bill = (100 * 5) + (100 * 7) + (100 * 10)
                    + (units - 300) * 15;
        }

        double surcharge = 0;

        if (bill > 2000) {
            surcharge = bill * 0.10;
        }

        double totalBill = bill + surcharge;

        System.out.println("Energy Charge: " + bill);
        System.out.println("Surcharge: " + surcharge);
        System.out.println("Total Bill: " + totalBill);
    }
}