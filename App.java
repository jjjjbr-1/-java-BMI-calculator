import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
         System.out.println("enter your wight");
        double wight = n.nextDouble();
        System.out.println("enter you hight");
        double hight = n.nextDouble();
        double BMI = wight / (hight * hight);
        int Status;
        if (BMI <= 18.9) {
            Status=1;
            System.out.println("your under the normal");
        }
        else if (BMI >= 18.5 && BMI <= 24.9) {
            Status=2;
            System.out.println("you are normal");
        }
        else if (BMI >= 30) {
            Status=3;
            System.out.println("you are fat");
        }
            else{
                System.out.println(" not corect informion");
                Status=4;
            }
           switch(Status){
               case 1:
                System.out.println("u should go to the firt hostpital");
                break;
               case 2:
                    System.out.println("hou have to eat more");
                break;
               case 3:
                    System.out.println("you ahve to make wight down");
                break;
               case 4:
                    System.out.println("date not coreat");
                break;
               default:
                   System.out.println("weellsom");



           }

        }
    }



