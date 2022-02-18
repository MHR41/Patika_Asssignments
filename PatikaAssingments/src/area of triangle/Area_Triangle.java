import java.util.Scanner;
public class Area_Triangle{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a,b,c;
        int u,area;
        System.out.print("Please enter the three sides of triangle:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        u = (a+b+c)/2;
        area = u*(u-a)*(u-b)*(u-c);
        
        System.out.println("Area: "+area);
    }
}