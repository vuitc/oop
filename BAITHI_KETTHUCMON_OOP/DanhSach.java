import java.util.ArrayList;
import java.util.Scanner;

public class DanhSach {
    Scanner sc = new Scanner(System.in);
    ArrayList<GiaoDich> gd = new ArrayList<GiaoDich>();

    void menu() {
        int chon;
        do {
            System.out.println("Nhap lua chon");
            System.out.println("1.Nhap thong tin nha đat");
            System.out.println("2.Nhap thong tin giao dich nha");
            System.out.println("cau 3. da lam cau 1 cau 2");
            System.out.println("3. Xuat tat ca giao dich dat va giao dich nha");
            System.out.println("4. Tong thanh tien giao dich lon hon 100");
            System.out.println("5. cap nhat lai giao dich dat khi biet ma giao dich");
            chon = sc.nextInt();
             Boolean flag1;
            if (chon == 0) {
                break;
            }
            switch (chon) {
                case 1:
                    // System.out.println("Thuc hien 1:");
                    // GiaoDichDat d = new GiaoDichDat();
                    // d.Nhap();
                    // gd.add(d);
                    //
                    System.out.println("Thuc hien 1:");
                   
                    String MAGD_tam;
                    GiaoDichDat dd = new GiaoDichDat();
                    // sự cố
                    sc.nextLine();
                    do {
                    flag1 = false;
                    // khong được trùng
                    // what ko được trùng
                    System.out.println("nhap MAGD");
                    // ten bien tam MAGD
                    MAGD_tam = sc.nextLine();
                    for (var i = 0; i < gd.size(); i++) {
                    if (gd.get(i).MAGD.equalsIgnoreCase(MAGD_tam)) {
                    flag1 = true;
                    System.out.println("MAGD 0 duoc trung");
                    }
                    }
                    try {
                    if (MAGD_tam.length() == 0) {
                    flag1 = true;
                    throw new Exception();
                    }
                    } catch (Exception e) {
                    // TODO: handle exception
                    System.out.println("MAGD ko duoc de trong");
                    }
                    } while (flag1 == true);
                    dd.setMaGD(MAGD_tam);
                    dd.Nhap();
                    gd.add(dd);

                    // GiaoDichDat d = new GiaoDichDat();
                    // d.Nhap();
                    // gd.add(d);

                    break;
                case 2:
                    // System.out.println("Thuc hien 2:");
                    // GiaoDichNha nn = new GiaoDichNha();
                    // nn.Nhap();
                    // gd.add(nn);
                    String MAGD_tam1;
                    GiaoDichNha dd1 = new GiaoDichNha();
                    // sự cố
                    sc.nextLine();
                    do {
                    flag1 = false;
                    // khong được trùng
                    // what ko được trùng
                    System.out.println("nhap MAGD");
                    // ten bien tam MAGD
                    MAGD_tam1 = sc.nextLine();
                    for (var i = 0; i < gd.size(); i++) {
                    if (gd.get(i).MAGD.equalsIgnoreCase(MAGD_tam1)) {
                    flag1 = true;
                    System.out.println("MAGD 0 duoc trung");
                    }
                    }
                    try {
                    if (MAGD_tam1.length() == 0) {
                    flag1 = true;
                    throw new Exception();
                    }
                    } catch (Exception e) {
                    // TODO: handle exception
                    System.out.println("MAGD ko duoc de trong");
                    }
                    } while (flag1 == true);
                    dd1.setMaGD(MAGD_tam1);
                    dd1.Nhap();
                    gd.add(dd1);
                    break;
                case 3:
                    System.out.println("Thuc hien 3:");
                    for (int i = 0; i < gd.size(); i++) {
                        gd.get(i).Xuat();
                    }
                    break;
                case 4:
                    System.out.println("Thuc hien 4:");
                    double sum = 0;
                    for (int i = 0; i < gd.size(); i++) {
                        if (gd.get(i) instanceof GiaoDichNha) {
                            GiaoDichNha nha = (GiaoDichNha) gd.get(i);
                            if (nha.Loai.equalsIgnoreCase("cao cap") && nha.DienTich > 100) {
                                sum += gd.get(i).ThanhTien;
                            }
                        }
                    }
                    System.out.println("Tong thanh tien giao dich nha cao cap >100:" + sum);
                    break;
                case 5:
                    sc.nextLine();
                    boolean flag = false;
                    System.out.println("Nhap MAGD can cap nhat");
                    String MAGD_Tam = sc.nextLine();
                    String Loai_Tam;
                    do {
                        System.out.println("Enter type loai Dat (A or B or C): ");
                        Loai_Tam = sc.nextLine();
                        if (Loai_Tam.equalsIgnoreCase("A") == false && Loai_Tam.equalsIgnoreCase("B") == false
                                && Loai_Tam.equalsIgnoreCase("C") == false) {
                            System.out.println("ko hop le");
                        }
                    } while (Loai_Tam.equalsIgnoreCase("A") && Loai_Tam.equalsIgnoreCase("B")
                            && Loai_Tam.equalsIgnoreCase("C"));

                    for (int i = 0; i < gd.size(); i++) {
                        if (gd.get(i).MAGD.equalsIgnoreCase(Loai_Tam)) {
                            gd.get(i).Loai = Loai_Tam;
                            flag = true;
                        }
                    }
                    if (flag == false) {
                        System.out.println("ko co");
                    }
                    break;
                case 6:

                    break;
                default:
                    System.out.println("Nhap sai");
                    break;
            }
        } while (chon != 0);

    }

}
