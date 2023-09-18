import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    ArrayList<VatTu> VT = new ArrayList<VatTu>();

    void menu() {
        int chon;
        do {
            System.out.println("Nhap lua chon");
            System.out.println("1.Nhap thong tin go");
            System.out.println("2.Nhap thong tin da");
            System.out.println("3Xuat tat ca vat tu");
            System.out.println("4. Tinh trung binh thanh tien vat tu Ruby");
            System.out.println("5. Sap xep tang dan vat tu go va giam dan theo so luong da");
            System.out.println("6. Tim vat tu da Ruby có thành tiền nhỏ thứ nhì và xóa nó");
            System.out.println("7. Cho biết loại đá ruby nào có thành tiền lớn thứ nhì");
            chon = sc.nextInt();
            if (chon == 0) {
                break;
            }
            switch (chon) {
                case 1:
                    System.out.println("Thuc hien cau 1:");
                    VatTuGo g = new VatTuGo();
                    g.Nhap();
                    VT.add(g);
                    break;
                case 2:
                    System.out.println("Thuc hien cau 2:");
                    VatTuDa d = new VatTuDa();
                    d.Nhap();
                    VT.add(d);
                    break;
                case 3:
                    System.out.println("Thuc hien cau 3:");
                    for (int i = 0; i < VT.size(); i++) {
                        VT.get(i).Xuat();
                    }
                    break;
                case 4:
                    System.out.println("Thuc hien cau 4:");
                    int count = 0;
                    double sum = 0;
                    for (int i = 0; i < VT.size(); i++) {
                        if (VT.get(i) instanceof VatTuDa) {
                            VatTuDa dd = (VatTuDa) VT.get(i);
                            if (dd.Loai.equalsIgnoreCase("ruby")) {
                                sum += VT.get(i).ThanhTien;
                                count++;
                            }
                        }
                    }
                    if (count == 0) {
                        System.out.println("ko có");
                    } else {
                        sum = sum / count;
                        System.out.println("Trung binh thanh tien vat tu da Ruby");
                    }
                    break;
                case 5:

                    break;

                default:
                    System.out.println("Nhap sai");
                    break;
            }
        } while (chon != 0);
    }

}
