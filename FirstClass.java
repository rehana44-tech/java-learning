import java.util.*;
//salary divider and counter
class FirstClass{
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     int basic_salary=sc.nextInt();
     int House_rent_allowance_percent=sc.nextInt();
     int medical_allowance=sc.nextInt();
     int tax_percent=sc.nextInt();
     int HRA= (basic_salary*House_rent_allowance_percent)/100;
     int Gross_salary=basic_salary+HRA+medical_allowance;
     int tax=(Gross_salary*tax_percent)/100;
     int net_salary=Gross_salary-tax;
     System.out.println("gross salary : "+Gross_salary);
               System.out.println("tax: "+tax);

          System.out.println("net salary: "+net_salary);
    }
}
//currency converter
class SecondClass{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter USD: ");
        double USD=sc.nextDouble();
        System.out.println("enter exchange rate : ");

        double exchange_rate=sc.nextDouble();
        double Converted_amount=USD*exchange_rate;
        System.out.println("Converted amount: "+Converted_amount);
    }
}
