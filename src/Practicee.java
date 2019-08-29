import java.util.Scanner;
public class Practicee {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the characters");

        char c1=scanner.nextLine().charAt(0);
        char c2=scanner.nextLine().charAt(0);
        if(c1>c2){
            System.out.println(c1+ ""+ c2);
        }
        else{
            System.out.println(c2+  ""  +c1);
        }


    }
}
