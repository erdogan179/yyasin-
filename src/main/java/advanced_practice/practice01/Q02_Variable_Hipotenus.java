package advanced_practice.practice01;

import java.util.Scanner;

public class Q02_Variable_Hipotenus {
    public static void main(String[] args) {
        //Hipotenüs hesaplayan bir kod yazınız.
        Scanner input = new Scanner(System.in);
        System.out.println("1. dik kenar uzunlugunu giriniz.");
       int a= input.nextInt();
        System.out.println("2. dik kenar uzunlugunu giriniz.");
       int b= input.nextInt();

       double hipotalamus = Math.sqrt(a*a+b*b);
        System.out.println("Hipotalamus:"+hipotalamus);

    }
}
