package Records;

import java.util.Random;
import java.util.Scanner;

public class EuclideanAlgorithm{

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("to execute algorithm randomly press \"r\" " + "\n" +
                "to execute algorithm manually press \"c\"");
        String choice = scan.nextLine();

        if(choice.equals("r")){
            random();
        }
        if(choice.equals("c")){
            controlled();
        }
    }

    /*method random() with random values*/
    public static void random() {

        int dividend;
        int divider;

        Random randomGenerator = new Random();

        dividend = randomGenerator.nextInt(1000000);

        System.out.println();
        System.out.println("dividend: " + dividend );
        System.out.println();

        divider = randomGenerator.nextInt(1000);
        System.out.println("divider: " + divider);
        System.out.println();

        algorithm(dividend,divider);

    }

    /*method controlled() with specified values*/
    public static void controlled(){
        Scanner scan = new Scanner(System.in);

        int dividend;
        int divider;

        System.out.println("please enter your name");
        String name = scan.nextLine();

        System.out.println(name+", " + "please enter dividend");
        dividend = scan.nextInt();

        System.out.println(name+", " + "please enter divider");
        divider = scan.nextInt();

        algorithm(dividend,divider);

    }

    public static void algorithm(int a, int b){

        int dividend =a;
        int divider =b;

        while (a!=b){
            if(a>b){
                a-=b;
                /*System.out.println("all dividends in algorithm :" + a);*/
            }else{
                b-=a;
                /*System.out.println(""all divisors in algorithm  :" + b);*/
            }
        }

        System.out.println("the greatest common divisor of numbers :" + "\n" +
                dividend + " and " + divider + "\n" + "is : " + a);
    }
}
