package vn.edu.likelion.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class PhongBan {
    private int id;
    private String departmentName;
    //    private int employeeAmount;
    static private ArrayList<PhongBan> lPBs;

    static Scanner s = new Scanner(System.in);

    public PhongBan(int id, String departmentName) {//, int employeeAmount) {
        this.id = id;
        this.departmentName = departmentName;
//        this.employeeAmount = employeeAmount;
    }

    public PhongBan() {
        lPBs = new ArrayList<PhongBan>();
    }


    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

//    public int getEmployeeAmount() {
//        return employeeAmount;
//    }
//
//    public void setEmployeeAmount(int employeeAmount) {
//        this.employeeAmount = employeeAmount;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void addPhongBan(PhongBan pb) {
        String pbName;
        checkIdPB(pb);
        System.out.println(pb.getId());

//        checkTenPB(pb);
        System.out.print("Nhập tên phòng ban");
        pbName = s.next();
        System.out.println(pb.getDepartmentName());

        lPBs.add(pb);
//        int emNum;
//        do {
//            System.out.print("Nhập số lượng nhân viên: ");
//            emNum = s.nextInt();
//            if (emNum > 3 || emNum < 1) {
//                System.out.println("Nhập sai số lượng, nhập lại");
//            }
//        } while (emNum > 3 || emNum < 1);

        System.out.println("Thêm thành công");
    }

    //kiểm tra trùng id
    public static int checkIdPB(PhongBan pb) {
        System.out.println("Nhập id phòng ban: ");
        int id = s.nextInt();
        if (pb.getId() == id) {
            System.out.println("Trùng id phòng ban. Nhập lại");
        } else {
            pb.setId(id);
        }
        return pb.getId();
    }
    //kiểm tra tên rỗng
    /*public static String checkTenPB(PhongBan pb) {
        System.out.println("Nhập tên phòng ban: ");
        String pbName = s.next();
        if (pb.getDepartmentName().isEmpty()) {
            System.out.println("Vui lòng nhập tên phòng ban");
        } else {
            pb.setDepartmentName(pbName);
        }
        return pb.getDepartmentName();
    }*/

    public void showlistPB() {
        HashMap<String, Integer> map = new HashMap<>();

        for (PhongBan pb : lPBs) {
            System.out.println("Id phòng ban:" + pb.getId());
            System.out.println("Tên phòng ban:" + pb.getDepartmentName());
            //int emA = pb.getEmployeeAmount();
//            System.out.println("Số lượng nhân viên phòng ban:" + );

        }
    }

//    public void updatePB(int id, ArrayList<PhongBan> phongBans, PhongBan pb) {
//        Scanner s = new Scanner(System.in);
//        boolean isExisted = false;
//        String pbName;
//        System.out.print("Nhập vào mã phòng ban cần cập nhật: ");
//        int idPB = s.nextInt();
//        for (PhongBan p : phongBans) {
//            if (p.getId() != id) {
//                p.setDepartmentName(pbName);
//            }
                /* //duyệt phần tử theo kích thước
                int size = lPBs.size();
                for (int i = 0; i < size; i++) {
                    //tìm phòng ban theo id
                    if (lPBs.get(i).getId() == i) {
//                    isExisted = true;
                        System.out.print("Nhập vào tên phòng ban: ");
                        pbName = s.nextLine();
                        System.out.print("Nhập vào số lượng nhân viên: ");
                        int emNum = s.nextInt();
                        lPBs.get(i).setDepartmentName(pbName);
//                        lPBs.get(i).setEmployeeAmount(emNum);
                        break;
                    }
                }
                if (!isExisted) {
                    System.out.println("Mã phòng ban không tồn tại!");
                } else {
                    System.out.println("Cập nhật phòng ban thành công!");
                }*/
//            }
//
//
//        }
//    }
//    public void showDetailPB() {
//        int id;
//        }
}





