public class HangDienMay extends HangHoa {
    int ThoiGianBaoHanh;
    double CongSuat;

    void Nhap() {
        super.Nhap();
        boolean flag;
        do {
            flag = false;
            System.out.println("nhap thoi gian bao hanh");
            try {
                this.ThoiGianBaoHanh = sc.nextInt();
                if (this.ThoiGianBaoHanh < 0) {
                    flag = true;
                    throw new Exception();
                }
            } catch (Exception e) {
                // TODO: handle exception
                sc.nextLine();
                flag = true;
                System.out.println("thoi gian bao hanh la so nguyen >=0");
            }
        } while (flag == true);
        do {
            flag = false;
            System.out.println("nhap cong suat");
            try {
                this.CongSuat = sc.nextDouble();
                if (this.CongSuat < 0) {
                    flag = true;
                    throw new Exception();
                }
            } catch (Exception e) {
                // TODO: handle exception
                sc.nextLine();
                flag = true;
                System.out.println("thoi gian bao hanh la so nguyen >=0");
            }
        } while (flag == true);
    }

    void Xuat() {
        super.Xuat();
        System.out.print("-" + this.ThoiGianBaoHanh + "-" + this.CongSuat);
    }

    public double TinhGiaTriTonKho() {
        return super.SoLuongTon;
    };

    public void DanhGiaMucDoBuonBan() {
        if (super.SoLuongTon < 3) {
            System.out.println("Ban duoc");
        }
    };
}
