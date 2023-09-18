import java.util.Scanner;

public class VatTuGo extends VatTu {
    Scanner sc = new Scanner(System.in);

    public VatTuGo() {

    }

    public void Nhap() {
        super.Nhap();
        super.ThanhTien = super.SoLuong * super.DonGia;
    }

    public void Xuat() {
        super.Xuat();
    }

}
