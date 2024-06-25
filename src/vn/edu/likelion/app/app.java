package vn.edu.likelion.app;


import vn.edu.likelion.entity.NhanVien;
import vn.edu.likelion.entity.PhongBan;
import vn.edu.likelion.service.PhongBanServiceImpl;

import java.util.ArrayList;
import java.util.Scanner;

public class app {
    public static PhongBan phongBan = new PhongBan();
    public static NhanVien nhanVien = new NhanVien();
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        ArrayList<PhongBan> phongBans = new ArrayList<>();
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
                    phongBan.showlistPB();
                    break;
                case 2:
                    phongBan.addPhongBan(phongBan);
                    break;
                case 3:
                    System.out.print("Nhập mã phòng ban muốn chỉnh sửa: ");
                    int editId = s.nextInt();
                    phongBan.updatePhongBan(editId,phongBans,phongBan);
                    break;
                case 4:
                    System.out.print("Nhập mã phòng ban muốn xóa: ");
                    int delId = s.nextInt();

                    break;
                case 5:
                    System.out.print("Nhập mã phòng ban muốn xem chi tiết: ");
                    int searchId = s.nextInt();
                    phongBan.showDetailPB(searchId, phongBan);
                    break;
                case 6:
                    nhanVien.addNhanVien(nhanVien);
                    break;
                case 7:
                    System.out.print("Nhập mã nhân viên muốn chỉnh sửa: ");
                    int editNVId = s.nextInt();
                    break;
                case 8:
                    System.out.print("Nhập mã nhân viên muốn xóa: ");
                    int deleteNVId = s.nextInt();
                    break;
                case 9:
                    nhanVien.showNV();
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

