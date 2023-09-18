import java.util.ArrayList;
import java.util.Scanner;

public class MyMotor implements IMotor {
    public String code;
    public String name;
    public int capacity;
    public String type;
    Scanner sc = new Scanner(System.in);
    public ArrayList<String> list;

    public MyMotor() {
        list=new ArrayList<>();
    }

    public void inputInfo() {
        do {
            System.out.println("Enter code: ");
            this.code = sc.nextLine();

            if (this.code.length() < 4) {
                System.out.println("nhap sai");
            }
            
        } while (this.code.length() < 4);
        list.add(this.code);
        do {
            System.out.println("Enter name: ");
            this.name = sc.nextLine();
            if (this.name.length() < 6) {
                System.out.println("nhap sai");
            }
        } while (this.name.length() < 6);
        do {
            System.out.println("Enter capacity: ");
            this.capacity = sc.nextInt();
            if (this.capacity < 50) {
                System.out.println("nhap sai");
            }
        } while (this.capacity < 50);
        do {
            System.out.println("Enter type (xe số or xe ga): ");
            this.type = sc.nextLine();
            if (this.type.equalsIgnoreCase("xe so") == false && this.type.equalsIgnoreCase("xe tay ga") == false) {
                System.out.println("ko hop le");
            }
        } while (this.type.equalsIgnoreCase("xe so") == false && this.type.equalsIgnoreCase("xe tay ga") == false);
    }

    public void displayInfo() {
        System.out.println("Code: " + this.code);
        System.out.println("Name: " + this.name);
        System.out.println("Capacity: " + this.capacity);
        System.out.println("Type: " + this.type);
    }
}
