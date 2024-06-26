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

    public void addPhongBan(PhongBan phongBan) {
        checkIdPB(phongBan);
//
        System.out.print("Nhập tên phòng ban: ");
        String pbName = s.next();
        lPBs.add(new PhongBan(id, pbName));

//
//        do {
//            System.out.print("Nhập số lượng nhân viên: ");
//            emNum = s.nextInt();
//            if (emNum > 3 || emNum < 1) {
//                System.out.println("Nhập sai số lượng, nhập lại");
//            }
//        } while (emNum > 3 || emNum < 1);
    }

    //kiểm tra trùng id
    public static int checkIdPB(PhongBan phongBan) {
        while (true) {
            System.out.print("Nhập id phòng ban: ");
            int id = s.nextInt();
            if(id < 1){
                System.out.println("Không nhập dưới 1");
            }else if (phongBan.getId() == id) {
                System.out.println("Trùng id phòng ban. Nhập lại");
            } else {
                phongBan.setId(id);
                break;
            }
        }
        return phongBan.getId();
    }

    //kiểm tra tên rỗng
    public static String checkTenPB(PhongBan phongBan) {
        while (true) {
            System.out.print("Nhập tên phòng ban: ");
            String pbName = s.next();
            if (pbName.isEmpty()) {
                System.out.println("Vui lòng nhập tên phòng ban");
            } else {
                phongBan.setDepartmentName(pbName);
                break;
            }
        }
        return phongBan.getDepartmentName();
    }

    public void showlistPB() {
        if (lPBs.isEmpty()) {
            System.out.println("Không có phòng ban nào để show");
        } else {
            System.out.println("Id\t\t Tên phòng ban");
            for (PhongBan phongBan : lPBs) {
                System.out.println(phongBan.getId() + "\t\t\t" + phongBan.getDepartmentName());

                //int emA = pb.getEmployeeAmount();
//            System.out.println("Số lượng nhân viên phòng ban:" + );
            }
        }
    }

    public void showDetailPB(int id, PhongBan phongBan) {
        if (phongBan.getId() == id) {
            for (PhongBan phongban : lPBs) {
                System.out.println("Id: " + phongban.getId());
                System.out.println("Tên phòng ban: " + phongban.getDepartmentName());
                System.out.println("Danh sách nhân viên");
            }
        }
    }


    //    public void updatePB(int id, ArrayList<PhongBan> phongBans, PhongBan pb) {
//
//        boolean isExisted = false;
//        System.out.print("Nhập vào mã phòng ban cần cập nhật: ");
//        int idPB = s.nextInt();
//        System.out.print("Nhập tên: ");
//        String pbName = s.nextLine();
//        for (PhongBan p : phongBans) {
//            if (p.getId() != id) {
//                p.setDepartmentName(pbName);
//            }
//            //duyệt phần tử theo kích thước
//            int size = lPBs.size();
//            for (int i = 0; i < size; i++) {
//                //tìm phòng ban theo id
//                if (lPBs.get(i).getId() == i) {
////                    isExisted = true;
//                    System.out.print("Nhập vào tên phòng ban: ");
//                    pbName = s.nextLine();
//                    System.out.print("Nhập vào số lượng nhân viên: ");
//                    int emNum = s.nextInt();
//                    lPBs.get(i).setDepartmentName(pbName);
////                        lPBs.get(i).setEmployeeAmount(emNum);
//                    break;
//                }
//            }
//            if (!isExisted) {
//                System.out.println("Mã phòng ban không tồn tại!");
//            } else {
//                System.out.println("Cập nhật phòng ban thành công!");
//            }
//        }
//
//
//    }
//}
    public void updatePhongBan(int id, ArrayList<PhongBan> phongBans, PhongBan phongBan) {
        System.out.print("Nhập tên: ");
        String name = s.nextLine();
        for (PhongBan p : phongBans) {
            if (p.getId() != id) {
                phongBan.setDepartmentName(name);
                phongBans.remove(p);
            }
        }
    }

    public void deletePhongBan(int id, PhongBan phongBan) {

    }
}





