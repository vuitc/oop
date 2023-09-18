import java.util.Scanner;

public class VatTu {
    String MAVT, NgayBan;
    double DonGia, ThanhTien;
    int SoLuong;
    Scanner sc = new Scanner(System.in);

    public VatTu() {

    }

    void Nhap() {
        System.out.print("Nhap ma vat tu: ");
        this.MAVT = sc.nextLine();
        sc.nextLine();
        System.out.print("Nhap Ngay Ban: ");
        this.NgayBan = sc.nextLine();
        //
        Boolean flag;
        int NgayNK = 0, ThangNK = 0, NamNK = 0;
        do {
            flag = false;
            System.out.println("nhap NgayNK:");
            this.NgayBan = sc.nextLine();
            String[] mangNgayNK = NgayBan.split("/");
            if (mangNgayNK.length != 3 && this.NgayBan.length() != 10) {
                flag = true;
            } else {
                NgayNK = Integer.parseInt(mangNgayNK[0]);
                ThangNK = Integer.parseInt(mangNgayNK[1]);
                NamNK = Integer.parseInt(mangNgayNK[2]);
                if (KiemTraNgayHopLe(NgayNK, ThangNK, NamNK) == false) {
                    flag = true;
                    System.out.println("Nhap ngay thang nam hop le");
                }
            }
        } while (flag == true);

        //
        do {
            flag = false;
            System.out.println("Nhap DonGia:");
            try {
                this.DonGia = sc.nextDouble();
                if (this.DonGia < 0) {
                    flag = true;
                    throw new Exception();
                }

            } catch (Exception e) {
                System.out.println("DonGia >=0");
                // TODO: handle exception
            }
        } while (flag == true);
        do {
            flag = false;
            System.out.println("Nhap SoLuong:");
            try {
                this.SoLuong = sc.nextInt();
                if (this.SoLuong < 0) {
                    flag = true;
                    throw new Exception();
                }

            } catch (Exception e) {
                System.out.println("SoLuong >=0");
                // TODO: handle exception
            }
        } while (flag == true);
    }

    void Xuat() {
        System.out.print("\nXuat:" + this.MAVT + "-" + this.DonGia + "-" + this.SoLuong + "-" + this.NgayBan + "-"
                + this.ThanhTien);
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
