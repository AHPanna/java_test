import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*System.out.println("Hello World!");
        int a=12;
        System.out.println(a);
        Panna();
        Count();
        Nom();*/
        tab();
    }
    /*
    private static void Panna(){
        System.out.println("Je m\'appelle Panna!");
    }

    private static void Count(){
        for(int i=0;i<10;i++){
            System.out.println(i);
        }
    }
    private static void Nom(){
        Scanner scanner = new Scanner( System.in );
        System.out.print( "Type some data for the program: " );
        String input = scanner.nextLine();
        System.out.println( "input = " + input );
    }
    */
    private static void tab(){
        int[] nums = new int[5];
        for (int i = 0; i < nums.length; i++){
            nums[i] = i + 10;
        }
        for(int n=0; n<nums.length;n++){
        System.out.println(nums[n]);
        }
        }
}
