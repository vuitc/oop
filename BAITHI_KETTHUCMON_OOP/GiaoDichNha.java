import java.util.Scanner;

public class GiaoDichNha extends GiaoDich {
    Scanner sc = new Scanner(System.in);
    String DiaChi;
    double DienTich;

    public void Nhap() {
        super.Nhap();
        // nhap loai nha
        do {
            System.out.println("Enter type Loai nha (cao cap or thuong): ");
            super.Loai = sc.nextLine();
            if (super.Loai.equalsIgnoreCase("cao cap") == false && super.Loai.equalsIgnoreCase("thuong") == false) {
                System.out.println("ko hop le");
            }
        } while (super.Loai.equalsIgnoreCase("cao cap") == false && super.Loai.equalsIgnoreCase("thuong") == false);
        //
        System.out.println("Nhap DiaChi: ");
        this.DiaChi = sc.nextLine();
        boolean flag;
        // nhap dien tich
        do {
            flag = false;
            System.out.println("Nhap DienTich:");
            try {
                this.DienTich = sc.nextInt();
                if (this.DienTich < 0) {
                    flag = true;
                    throw new Exception();
                }

            } catch (Exception e) {
                System.out.println("DienTich >=0");
                // TODO: handle exception
            }
        } while (flag == true);
        // thanh tien
        super.ThanhTien = ThanhTien1();
    }

    public void Xuat() {
        super.Xuat();
        System.out.print("-" + super.ThanhTien + "-" + this.DienTich + "-" + this.DiaChi + "-" + super.Loai);
    }

    double ThanhTien1() {
        if (super.Loai.equalsIgnoreCase("cao cap")) {
            return this.DienTich * super.DonGia;
        } else {
            return this.DienTich * super.DonGia * 0.9;
        }
    }

}
