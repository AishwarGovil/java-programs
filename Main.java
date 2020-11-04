import java.util.Scanner;

class MethodOverloading{

    public static void main(String[] args) {

        System.out.println(add(55,33));
        System.out.println(add(55.858,898.656));
        System.out.println(add("Hello ","Stranger"));

        //System.out.print("Enter A=");

        //Scanner scan=new Scanner(System.in);
        //int a=scan.nextInt();

        //System.out.print("Enter B=");

        //int b=scan.nextInt();

        //System.out.println("The addition is "+add(a,b));

    }

    public static int add(int a, int b){

        return(a+b);

    }
    public static double add(double a, double b){

        return(a+b);

    }
    public static String add(String a, String b){

        return(a+b);

    }
}