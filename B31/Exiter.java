import java.util.Scanner;

public class Exiter extends MyMotor {
    public int warranty;

    public Exiter() {

    }

    public void inputInfo() {
        super.inputInfo();
        Scanner scanner = new Scanner(System.in);
        boolean flag;
        do {
            flag = false;
            System.out.println("Enter warranty (in years): ");
            warranty = scanner.nextInt();
            try {
                this.warranty = scanner.nextInt();
                if (this.warranty < 1) {
                    throw new Exception("loi");
                }
            } catch (Exception e) {
                // TODO: handle exception
                flag = true;
                System.out.println("Warranty la so nguyen >=1");
                scanner.nextLine();
            }
        } while (flag == true);
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Warranty: " + warranty + " years");
    }
}
