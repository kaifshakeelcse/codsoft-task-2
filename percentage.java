
import java.util.Scanner;

class Subject{
    int max = 100;
    int obtd;
}

public class percentage {
    public static void main(String[] args) {
       Subject s1 = new Subject();
       System.out.print("Enter Maths Marks:");
       Scanner scn = new Scanner(System.in);
       s1.obtd = scn.nextInt();
       Subject s2 = new Subject();
       System.out.print("Enter Science Marks:");
       s2.obtd = scn.nextInt();
       Subject s3 = new Subject();
       System.out.print("Enter English Marks:");
       s3.obtd = scn.nextInt();
       Subject s4 = new Subject();
       System.out.print("Enter social science marks ");
       s4.obtd = scn.nextInt();
       Subject s5 = new Subject();
       System.out.print("Enter Hindi Marks:");
       s5.obtd = scn.nextInt();
       int tobtd =    (s1.obtd)+(s2.obtd)+(s3.obtd)+(s4.obtd)+(s5.obtd);
       int per = (tobtd*100/500);
       System.out.println("Percentage obtained:" +per);
       scn.close();
    }       
}



    

