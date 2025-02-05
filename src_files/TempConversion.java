import java.util.Scanner;

public class TempConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter temp in Farenheit :");
        float tempFarenheit = sc.nextFloat();

        float tempCelsius = (tempFarenheit - 32) * 5 / 9;
        System.out.println("Temperature in Celsius is : " + tempCelsius + " °C");
    }
}
