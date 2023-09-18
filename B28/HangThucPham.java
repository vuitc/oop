import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class HangThucPham extends HangHoa {
    String NgaySanXuat, NgayHetHan, NhaCungCap;
    Scanner sc = new Scanner(System.in);

    public HangThucPham() {
        super.VAT = 0.05;
    }

    void Nhap() {
        super.Nhap();
        Boolean flag;
        int NgaySX = 0, ThangSX = 0, NamSX = 0;
        do {
            flag = false;
            System.out.println("nhap NgaySX:");
            this.NgaySanXuat = sc.nextLine();
            String[] mangNgaySX = NgaySanXuat.split("/");
            if (mangNgaySX.length != 3 && this.NgaySanXuat.length() != 10) {
                flag = true;
            } else {
                NgaySX = Integer.parseInt(mangNgaySX[0]);
                ThangSX = Integer.parseInt(mangNgaySX[1]);
                NamSX = Integer.parseInt(mangNgaySX[2]);
                if (super.KiemTraNgayHopLe(NgaySX, ThangSX, NamSX) == false) {
                    flag = true;
                    System.out.println("Nhap ngay thang nam hop le");
                }
            }
        } while (flag == true);
        int NgayHH = 0, ThangHH = 0, NamHH = 0;
        do {
            flag = false;
            System.out.println("nhap NgayHH:");
            this.NgayHetHan = sc.nextLine();
            String[] mangNgayHH = NgayHetHan.split("/");
            if (mangNgayHH.length != 3 && this.NgayHetHan.length() != 10) {
                flag = true;
            } else {
                NgayHH = Integer.parseInt(mangNgayHH[0]);
                ThangHH = Integer.parseInt(mangNgayHH[1]);
                NamHH = Integer.parseInt(mangNgayHH[2]);
                if (super.KiemTraNgayHopLe(NgayHH, ThangHH, NamHH) == false) {
                    flag = true;
                    System.out.println("Nhap ngay thang nam hop le");
                }
            }
            if (NamSX > NamHH) {
                flag = true;
            } else {
                if (NamSX == NamHH) {
                    if (ThangSX > ThangHH) {
                        flag = true;
                    } else {
                        if (ThangSX == ThangHH) {
                            if (NgaySX > NgayHH) {
                                flag = true;
                            }
                        }
                    }
                }
            }
        } while (flag == true);
        System.out.println("NhaCC:");
        this.NhaCungCap = sc.nextLine();
    }

    void Xuat() {
        super.Xuat();
        System.out.print("-" + super.VAT + this.NgayHetHan + "-" + this.NgaySanXuat + "-" + this.NhaCungCap);
    }

    public double TinhGiaTriTonKho() {
        return super.SoLuongTon;
    };

    public void DanhGiaMucDoBuonBan() {
        Date NgayHienHanh = new Date();
        Date NgayHH_Tam = null;
        try {
            NgayHH_Tam = new SimpleDateFormat("dd/mm/yyyy").parse(this.NgayHetHan);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            System.out.println("loi");
        }
        if (super.SoLuongTon > 0 && NgayHienHanh.getTime() > NgayHH_Tam.getTime()) {
            System.out.println("kho ban");
        }
    };
}