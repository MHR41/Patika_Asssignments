import java.util.Scanner;
public class BodyMassIndex{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the height(m) and weight(km) of yourself:");
        float height = sc.nextFloat();
        float weight = sc.nextFloat();
        float bodyMassIndex = weight/(height*height);
        
        System.out.println("Body Mass Index: "+bodyMassIndex);
        
    }
}