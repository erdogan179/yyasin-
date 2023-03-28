package advanced_practice.practice01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q01_Variable_Fahrenheit {
    public static void main(String[] args) {
        // Fahrenheit değeri, Celsius değere çeviren kod yazınız.
        // formül: c = (f-32)*5/9

        Scanner input = new Scanner(System.in);
        System.out.println("Fahrenheit degeri giriniz.");
        double f = input.nextDouble();

       double c = (f-32) *5/9;
        System.out.println("Celcius:"+c);

        DecimalFormat format= new DecimalFormat("0,00");
        String formattedCelsius = format.format(c);
        System.out.println("formattedCelsius="+formattedCelsius);
        System.out.printf("Formatli:  " + "%.2f",c);

    }
}
