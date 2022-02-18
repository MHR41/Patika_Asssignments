import java.util.Scanner;
public class Taximeter{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int initalStartAmount = 10;
        float amountToPay = 0;
        float amountOfWay = 0;
        
        System.out.print("Please enter the amount of way in KM:");
        amountOfWay = sc.nextFloat();
        float pricePerKm = 2.20f;
        amountToPay = initalStartAmount+amountOfWay*pricePerKm;
        
        if(amountToPay<20){
        
            amountToPay = 20;
            System.out.println("Total amount to pay: "+amountToPay);
        }
        else{
        
            System.out.println("Total amount to pay: "+amountToPay);
        }
    }
}