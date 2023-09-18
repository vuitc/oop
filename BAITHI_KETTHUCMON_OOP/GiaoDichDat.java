import java.util.Scanner;

public class GiaoDichDat extends GiaoDich {
    Scanner sc = new Scanner(System.in);

    public void Nhap() {
        super.Nhap();
        do {
            System.out.println("Enter type loai Dat (A or B or C): ");
            super.Loai = sc.nextLine();
            if (super.Loai.equalsIgnoreCase("A") == false && super.Loai.equalsIgnoreCase("B") == false
                    && super.Loai.equalsIgnoreCase("C") == false) {
                System.out.println("ko hop le");
            }
        } while (super.Loai.equalsIgnoreCase("A") == false && super.Loai.equalsIgnoreCase("B") == false
                && super.Loai.equalsIgnoreCase("C") == false);
        // thanh tien
        super.ThanhTien = ThanhTien1();
    }

    double ThanhTien1() {
        if (super.Loai.equalsIgnoreCase("A")) {
            return super.DonGia * 1.5;
        } else {
            return super.DonGia * 1.2;
        }
    }

    public void Xuat() {
        super.Xuat();
        System.out.print("-" + super.ThanhTien + "-" + super.Loai);

    }

}
