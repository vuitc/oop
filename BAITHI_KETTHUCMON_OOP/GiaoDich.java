import java.util.Scanner;

public class GiaoDich extends GD {
    String MAGD, NgayGD, Loai;
    double DonGia, ThanhTien;
    Scanner sc = new Scanner(System.in);

    public void Nhap() {
        System.out.print("Nhap MAGD: ");
        this.MAGD = sc.nextLine();

        System.out.print("Nhap NgayGD: ");
        this.NgayGD = sc.nextLine();
        Boolean flag;
        int NgayNK = 0, ThangNK = 0, NamNK = 0;
        do {
            flag = false;
            System.out.println("nhap NgayNK:");
            this.NgayGD = sc.nextLine();
            String[] mangNgayNK = NgayGD.split("/");
            if (mangNgayNK.length != 3 && this.NgayGD.length() != 10) {
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
        do {
            flag = false;
            System.out.println("Nhap DonGia:");
            try {
                this.DonGia = sc.nextInt();
                if (this.DonGia < 0) {
                    flag = true;
                    throw new Exception();
                }

            } catch (Exception e) {
                System.out.println("DonGia >=0");
                // TODO: handle exception
            }
        } while (flag == true);

    };

    public void Xuat() {
        System.out.print("Xuat:" + this.MAGD + "-" + this.NgayGD + "-" + this.DonGia);
    };

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

    public void setMaGD(String MAGD) {
        this.MAGD = MAGD;
    }

}
//

//