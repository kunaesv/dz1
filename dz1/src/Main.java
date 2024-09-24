import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.print("Напишите сколько яиц в холодильнике ");
        int num = in.nextInt();

        if (num>3){
            System.out.println("Рекомендую приготовить омлет");
        }
        else  {
            System.out.println("Рекомендую  позавтракать бутербродами");
        }
        System.out.println("Приятного аппетита!");


    }
}