package vn.edu.likelion.entity;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class NhanVien {
    private int id;
    private String employeeName;
    private int age;
    private String joinDate;
    private String departmentName;
    private ArrayList<NhanVien> nviens;
    static Scanner s = new Scanner(System.in);

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public NhanVien() {
        nviens = new ArrayList<NhanVien>();
    }

    public NhanVien(int id, String employeeName, int age, String joinDate, String departmentName) {
        this.id = id;
        this.employeeName = employeeName;
        this.age = age;
        this.joinDate = joinDate;
        this.departmentName = departmentName;
    }

    public void addNhanVien(NhanVien nhanVien) {
        System.out.print("Nhập số lượng nhân viên muốn thêm: ");
        int slnv = s.nextInt();
        if (slnv < 1 || slnv > 3) {
            System.out.print("Nhập sai số lượng, nhập lại\n");
            addNhanVien(nhanVien);
        } else {
            for (int i = 0; i < slnv; i++) {
//                System.out.print("Nhập id nhân viên:");
//                int id = s.nextInt();
                checkIdNV(nhanVien);
                System.out.print("Nhập tên nhân viên:");
                String nvName = s.next();
                System.out.print("Nhập tuổi nhân viên:");
                int age = s.nextInt();
                System.out.print("Nhập ngày tham gia(dd/MM/yyyy): ");
                SimpleDateFormat sdf_ddMMyyyy = new SimpleDateFormat("dd/MM/yyyy");
                String date = s.next();
                System.out.print("Thuộc phòng ban: ");
                String nvpb = s.next();
                nviens.add(new NhanVien(id, nvName, age, date, nvpb));
            }
        }
    }

    public static int checkIdNV(NhanVien nhanVien) {
        while (true) {
            System.out.print("Nhập id nhân viên: ");
            int id = s.nextInt();
            if (id < 1) {
                System.out.println("Không nhập dưới 1");
            } else if (nhanVien.getId() == id) {
                System.out.println("Trùng id nhân viên. Nhập lại");
            } else {
                nhanVien.setId(id);
                break;
            }
        }
        return nhanVien.getId();
    }

    public void showlistNV() {
        if (nviens.isEmpty()) {
            System.out.println("Không có nhân viên để show");
        } else {
            System.out.println("Id\t Tên nhân viên\t Tuổi nhân viên \t Ngày tham gia \t Phòng ban");
            for (NhanVien nv : nviens) {
//                    int id = nv.getId();
                System.out.println(nv.getId() + "\t\t" + nv.getEmployeeName() + "\t\t\t\t" + nv.getAge()
                        + "\t\t\t\t\t" + nv.getJoinDate() + "\t\t" + nv.getDepartmentName());
            }
        }
    }

    public int showDetailNV(int id) {
        return 0;
    }

    public void updateNhanVien(int id, ArrayList<NhanVien> nviens, NhanVien nhanVien) throws Exception {
    }

    public void deleteNhanVien(int id, NhanVien nhanVien) {

    }
}
