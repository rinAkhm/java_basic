package topic1.program_structure;
import java.util.Scanner;

public class CircleData {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите радус окружности:");
        float radius = scan.nextFloat();
        System.out.println("Площадь окружности ");
        double result1 = area(radius);
        System.out.println("Раняется: " + result1);
        System.out.println("Длина окружности: ");
        double result2 = circumference(radius);
        System.out.println("Раняется: "+result2);
    }
    static double area(float r){
        final double Pi = 3.14;
        return (Math.pow(r,2)*Pi);
    }
    static double circumference (float rad){
        final double Pi = 3.14;
        double a = 2*Pi*rad;
        return 2*Pi*rad;
    }
}
