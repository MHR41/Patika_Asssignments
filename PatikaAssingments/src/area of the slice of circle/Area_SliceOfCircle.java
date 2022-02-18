import java.util.Scanner;
public class Area_SliceOfCircle{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the radius and center angle of circle:");
        float pi = 3.14f;
        float radius = sc.nextFloat();
        float angle = sc.nextFloat();
        float areaOfSliceOfCircle = (pi*radius*radius*angle)/360;
        
        System.out.println("Area: "+areaOfSliceOfCircle);
            

    }
}
