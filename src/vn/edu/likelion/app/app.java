package vn.edu.likelion.app;


import vn.edu.likelion.entity.NhanVien;
import vn.edu.likelion.entity.PhongBan;
import vn.edu.likelion.service.PhongBanServiceImpl;

import java.util.Scanner;

public class app {
    public static PhongBan pb = new PhongBan();
    public static NhanVien nv = new NhanVien();
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("\t\tPHẦN MỀM QUẢN LÝ NHÂN VIÊN");

        boolean cont = true;
        do {
            System.out.println("--------Chọn chức năng-------- ");
            System.out.println("1.Xem danh sách phòng ban");
            System.out.println("2.Thêm phòng ban");
            System.out.println("3.Sửa phòng ban");
            System.out.println("4.Xóa phòng ban");
            System.out.println("5.Xem chi tiết phòng ban");
            System.out.println("6.Thêm nhân viên");
            System.out.println("7.Sửa nhân viên");
            System.out.println("8.Xóa nhân viên");
            System.out.println("9.Xem danh sách nhân viên");
            System.out.println("10.Xem chi tiết nhân viên");
            System.out.print("Lựa chọn: ");
            int choose = s.nextInt();
            switch (choose) {
                case 1:
                    pb.showlistPB();
                    break;
                case 2:
                    pb.addPhongBan(pb);
                    break;
                case 3:
//                    pb.updatePB();
                    break;
                case 4:

                    break;
                case 5:
                    System.out.println("Nhập mã phòng ban muốn xem chi tiết: ");
                    break;
                case 6:
                    nv.addNhanVien();
                    break;
                case 7:

                    break;
                case 8:


                    break;
                case 9:
                    nv.showNV();
                    break;
                case 10:
                    System.out.print("Nhập mã nhân viên muốn xem chi tiết: ");
                    int idnv = s.nextInt();
                    s.nextLine();
//                    nv.showDetailNV(idnv);
                    break;
                default:
                    System.out.println("Tạm biệt");
                    cont = false;
                    break;
            }
        } while (cont);


    }

}

