import java.util.Scanner;

public abstract class HangHoa {
    String MaHang, TenHang;
    int SoLuongTon;
    double DonGia, VAT;
    Scanner sc = new Scanner(System.in);

    public abstract double TinhGiaTriTonKho();

    public abstract void DanhGiaMucDoBuonBan();

    public void setMaHang(String MaHang) {
        this.MaHang = MaHang;
    }

    void Nhap() {
        Boolean flag;
        do {
            flag = false;
            System.out.println("Nhap ten hang:");
            try {
                this.TenHang = sc.nextLine();
                if (this.TenHang.length() == 0) {
                    flag = true;
                    throw new Exception();
                }

            } catch (Exception e) {
                System.out.println("Ten hang ko duoc de trong");
                // TODO: handle exception
            }
        } while (flag == true);
        do {
            flag = false;
            System.out.println("Nhap so luong hang ton:");
            try {
                this.SoLuongTon = sc.nextInt();
                if (this.SoLuongTon < 0) {
                    flag = true;
                    throw new Exception();
                }

            } catch (Exception e) {
                System.out.println("So luong ton >=0");
                // TODO: handle exception
            }
        } while (flag == true);
        do {
            flag = false;
            System.out.println("Nhap don gia:");
            try {
                this.DonGia = sc.nextDouble();
                if (this.DonGia <= 0) {
                    flag = true;
                    throw new Exception();
                }

            } catch (Exception e) {
                System.out.println("Don gia phai >0");
                // TODO: handle exception
            }
        } while (flag == true);
    }

    void Xuat() {
        System.out.println("Xuat:" + this.MaHang + "-" + this.TenHang + "-" + this.SoLuongTon + "-" + this.DonGia);
    }

    public Boolean KiemTraNgayHopLe(int ngay, int thang, int nam) {
        if (!(nam % 4 == 0 && nam % 100 != 0) || nam % 400 == 0) {
            if (thang == 2) {
                if (ngay > 28) {
                    return false;
                }
            } else {
                if (thang == 4 || thang == 6 || thang == 9 || thang == 11) {
                    if (ngay > 30) {
                        return false;
                    }
                } else {
                    if (ngay > 31) {
                        return false;
                    }
                }
            }
        } else {
            if (thang == 2) {
                if (ngay > 29) {
                    return false;
                }
            } else {
                if (thang == 4 || thang == 6 || thang == 9 || thang == 11) {
                    if (ngay > 30) {
                        return false;
                    }
                } else {
                    if (ngay > 31) {
                        return false;
                    }
                }
            }
        }
        return true;
    };
}
