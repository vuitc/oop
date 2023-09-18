import java.util.Scanner;

public class VatTuDa extends VatTu {
    Scanner sc = new Scanner(System.in);
    double VAT;
    String Loai;

    public VatTuDa() {

    }

    public void Nhap() {
        super.Nhap();
        boolean flag;
        do {
            flag = false;
            System.out.println("Nhap VAT:");
            try {
                this.VAT = sc.nextInt();
                if (this.VAT < 0) {
                    flag = true;
                    throw new Exception();
                }

            } catch (Exception e) {
                System.out.println("VAT >=0");
                // TODO: handle exception
            }
        } while (flag == true);
        do {
            System.out.println("Enter type (ngoc bich or ruby or garnet): ");
            this.Loai = sc.nextLine();
            if (this.Loai.equalsIgnoreCase("ngoc bich") == false && this.Loai.equalsIgnoreCase("ruby") == false
                    && this.Loai.equalsIgnoreCase("garnet") == false) {
                System.out.println("ko hop le");
            }
        } while (this.Loai.equalsIgnoreCase("ngoc bich") == false && this.Loai.equalsIgnoreCase("ruby") == false
                && this.Loai.equalsIgnoreCase("garnet") == false);
    }

    public void Xuat() {
        super.Xuat();
        System.out.print("-" + this.VAT + "-" + this.Loai + "-");
    }

    double Total() {
        if (this.Loai == "ngoc bich" || this.Loai == "garnet") {
            return super.SoLuong * super.DonGia + this.VAT;
        } else {
            return super.SoLuong * super.DonGia + this.VAT * 2.1;
        }
    };
}
