import java.util.ArrayList;
import java.util.Scanner;

public class MangHH {
    ArrayList<HangHoa> mangHH;
    Scanner sc = new Scanner(System.in);

    public MangHH() {
        mangHH = new ArrayList<>();
    }

    void menu() {
        int chon;
        do {
            System.out.println("Nhap lua chon");
            System.out.println("1.");
            System.out.println("2.");
            System.out.println("3.");
            System.out.println("4.");
            System.out.println("5.");
            chon = sc.nextInt();
            if (chon == 0) {
                break;
            }
            switch (chon) {
                case 1:
                    Boolean flag;
                    String mahang_tam;
                    HangSanhSu s = new HangSanhSu();
                    sc.nextLine();
                    do {
                        flag = false;
                        System.out.println("nhap ma hang");
                        mahang_tam = sc.nextLine();
                        for (var i = 0; i < mangHH.size(); i++) {
                            if (mangHH.get(i).MaHang.equalsIgnoreCase(mahang_tam)) {
                                flag = true;
                                System.out.println("Ma hang 0 duoc trung");
                            }
                        }
                        try {
                            if (mahang_tam.length() == 0) {
                                flag = true;
                                throw new Exception();
                            }
                        } catch (Exception e) {
                            // TODO: handle exception
                            System.out.println("Ma hang ko duoc de trong");
                        }
                    } while (flag == true);
                    s.setMaHang(mahang_tam);
                    s.Nhap();
                    mangHH.add(s);
                    break;
                case 4:
                    for (int i = 0; i < mangHH.size(); i++) {
                        mangHH.get(i).Xuat();
                    }
                    break;
                case 5:
                    sc.nextLine();
                    flag = false;
                    System.out.println("Nhap ma hang can cap nhat");
                    String mhang_Tam = sc.nextLine();
                    System.out.println("Nhap ten hang can cap nhat");
                    String thang_Tam = sc.nextLine();
                    for (int i = 0; i < mangHH.size(); i++) {
                        if (mangHH.get(i).MaHang.equalsIgnoreCase(thang_Tam)) {
                            mangHH.get(i).TenHang = thang_Tam;
                            flag = true;
                        }
                    }
                    if (flag == false) {
                        System.out.println("ko co");
                    }
                    break;
                default:
                    System.out.println("Nhap sai");
                    break;
            }
        } while (chon != 0);
    }
}
