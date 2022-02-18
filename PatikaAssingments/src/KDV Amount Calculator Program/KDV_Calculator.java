import java.util.Scanner;

public class KDV_Calculator {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        float amount,taxRate,priceWithTax,taxAmount;
        
        System.out.print("Please enter the amount of money:");
        amount = sc.nextFloat();
        
        if( 0<amount && amount<=1000){
        
            taxRate = 0.18f;
        }
        else{
        
            taxRate = 0.08f;
        }
        
        priceWithTax = amount*taxRate+amount;
        taxAmount = amount*taxRate;
        
        System.out.printf("Amount:%f\n",amount);
        System.out.printf("Tax Rate:%f\n",taxRate);
        System.out.printf("Tax Amount:%f\n",taxAmount);
        System.out.println("Total(Amount with tax):"+priceWithTax);
    }    
}
