import java.util.Scanner;

public class Serius extends MyMotor {
    public String color;

    public Serius() {
    }

    public void inputInfo() {
        super.inputInfo();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter color (xanh, vàng, trắng): ");
        color = scanner.nextLine();
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Color: " + color);
    }
}
