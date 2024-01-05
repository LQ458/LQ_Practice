import java.util.Scanner;
public class first {
    private static void print(String s){
        System.out.println(s);
    }
    public static double cal(double a, double b){
        return a/b;
    }

    public static class Example {
        double a;
        double b;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Example example = new Example();

        System.out.println("Enter value for a:");
        example.a = scanner.nextDouble();

        System.out.println("Enter value for b:");
        example.b = scanner.nextDouble();

        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }
        print(Double.toString(cal(example.a,example.b)));

        scanner.close(); // Close the scanner to avoid resource leak
    }
}