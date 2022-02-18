import java.util.Scanner;

public class Circumference_Area_Circle{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        float pi  = 3.14f;
        int radius;
        float areaOfCircle = 1f;
        float circumferenceOfCircle = 1f;
       
        System.out.print("Please enter the radius of circle: ");
        radius = sc.nextInt();
        areaOfCircle = pi*radius*radius;
        circumferenceOfCircle = 2*pi*radius;
        
        System.out.println("Area:"+areaOfCircle);
        System.out.println("Circumference:"+circumferenceOfCircle);
        
        
    }

}