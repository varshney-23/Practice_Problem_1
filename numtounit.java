import java.util.Scanner;

public class numtounit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (1, 10, 100, 1000, etc.): ");
        int num = sc.nextInt();
        int place = 1;
        while (num != 1) {
            num /= 10;
            place *= 10;
        }
        switch (place) {
            case 1:
                System.out.println("Unit");
                break;
            case 10:
                System.out.println("Ten");
                break;
            case 100:
                System.out.println("Hundred");
                break;
            case 1000:
                System.out.println("Thousand");
                break;
            default:
                System.out.println("Invalid number");
        }
    }
}

