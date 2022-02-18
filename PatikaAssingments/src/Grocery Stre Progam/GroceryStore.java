import java.util.Scanner;

public class GroceryStore{

    public static void main(String[] args){
     
        Scanner sc = new Scanner(System.in);

        
        String[] fruite = {"pear","apple","tomato","banana","eggplant"};
        float[] priceOfFruite = {2.14f,3.67f,1.11f,0.95f,5.00f};
        float amountOfFruite;
        float totalAmount = 0;
        
        for (int i = 0; i < fruite.length; i++) {
            
            System.out.printf("How much %s",fruite[i]+"? :");
            amountOfFruite = sc.nextInt();
            totalAmount += amountOfFruite*priceOfFruite[i];
        }
        System.out.println("Total Amount(TL): "+totalAmount);      
        
    }
}