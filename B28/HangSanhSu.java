import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HangSanhSu extends HangHoa {
    String NhaSanXuat, NgayNhapKho;

    void Nhap() {
        super.Nhap();
        sc.nextLine();
        System.out.println("Nhap nha SX:");
        this.NhaSanXuat = sc.nextLine();
        Boolean flag;
        int NgayNK = 0, ThangNK = 0, NamNK = 0;
        do {
            flag = false;
            System.out.println("nhap NgayNK:");
            this.NgayNhapKho = sc.nextLine();
            String[] mangNgayNK = NgayNhapKho.split("/");
            if (mangNgayNK.length != 3 && this.NgayNhapKho.length() != 10) {
                flag = true;
            } else {
                NgayNK = Integer.parseInt(mangNgayNK[0]);
                ThangNK = Integer.parseInt(mangNgayNK[1]);
                NamNK = Integer.parseInt(mangNgayNK[2]);
                if (super.KiemTraNgayHopLe(NgayNK, ThangNK, NamNK) == false) {
                    flag = true;
                    System.out.println("Nhap ngay thang nam hop le");
                }
            }
        } while (flag == true);

    }

    void Xuat() {
        super.Xuat();
        System.out.println("-" + this.NgayNhapKho + "-" + this.NhaSanXuat);
    }

    public double TinhGiaTriTonKho() {
        return 1;
    };

    public void DanhGiaMucDoBuonBan() {
        Date NgayHienHanh = new Date();
        Date NgayNK_Tam;

        try {
            NgayNK_Tam = new SimpleDateFormat("dd/mm/yyyy").parse(this.NgayNhapKho);
            if (super.SoLuongTon > 50 && (NgayHienHanh.getTime() - NgayNK_Tam.getTime()) > 10) {
                System.out.println("Ban cham");
            }
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    };
}
