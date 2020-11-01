import java.util.Scanner;
class Main{
    
public static void main(String[] args){

    float answer;
    System.out.println("Please Enter the marks:- ");
    System.out.print("CAT 1-");
    
    Scanner scan=new Scanner(System.in);
    float x=scan.nextFloat();
    
    System.out.print("CAT 2-");
    Scanner scan1=new Scanner(System.in);
    float y=scan1.nextFloat();
    System.out.println(y);
    
    
    answer=x+y;
    System.out.println("The Answer is= "+answer);
    
    
    if ((x>=20)&&(y>=20)&&(answer>=40)){
        System.out.println("Ja kar le party");
    }
    else{
        System.out.println("Supplimentary dede hojayega");
    }
}
}