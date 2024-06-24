package vn.edu.likelion.service;

import vn.edu.likelion.entity.PhongBan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhongBanServiceImpl implements PhongBanService {
    ArrayList<PhongBan> phongBans = new ArrayList<>();
    Scanner s = new Scanner(System.in);
    @Override
    public void addPhongBan() {
        String pbName;
        System.out.print("Nhập id phòng ban:");
        int id = s.nextInt();
        System.out.print("Nhập tên phòng ban:");
        pbName = s.nextLine();
        int emNum;
        do{
            System.out.println("\nNhập số lượng nhân viên: ");
            emNum = s.nextInt();
        }while (emNum > 3 || emNum < 0);
    }

    @Override
    public void updatePhongBan() {
        System.out.println("Chọn phòng ban cần chỉnh sửa: ");

    }

    @Override
    public void deletePhongBan() {

    }

//    @Override
//    public List<PhongBan> getPhongBan(int PBId) {
//        return List.of();
//    }

    public boolean checkIdPB(){
//        for(PhongBan pb:){
//
//        }
        return true;
    }
}
