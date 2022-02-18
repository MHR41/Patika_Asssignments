import java.util.ArrayList;
import java.util.Scanner;
public class Average{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int total=0;
        ArrayList<Integer> points = new ArrayList<>();
        int average;
                
        System.out.println("Please Enter your following subject's point:");
        String[] subjects ={"Physic","Chemistry","Math","Turkish","History","Music"};
        
        for(int i=0 ; i<subjects.length ; i++){
        
            System.out.print(subjects[i]+":");
            points.add(sc.nextInt()); 
            total += points.get(i);
        }
     
        average = total/subjects.length;
       
        boolean result = average>60;
        String outPut = result? "Passed" : "Failed";
        System.out.println("average:"+average+" '"+outPut+"'");
        
    }
}