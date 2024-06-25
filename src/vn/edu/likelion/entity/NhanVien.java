package vn.edu.likelion.entity;

import vn.edu.likelion.service.NhanVienService;

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
        if (slnv < 1 || slnv > 3){
            System.out.print("Nhập sai số lượng, nhập lại\n");
            addNhanVien(nhanVien);
        }else {
            for(int i = 0; i<slnv;i++) {
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
                String nvpb;
                System.out.print("Thuộc phòng ban: ");
                nvpb = s.next();
                nviens.add(new NhanVien(id, nvName, age, date, nvpb));
            }
        }
    }
    public void showNV() {
        HashMap<String, Integer> map = new HashMap<>();
        for (NhanVien nv : nviens) {
            int id = nv.getId();
            String nvName = nv.getEmployeeName();
            int age = nv.getAge();
            String date = nv.getJoinDate();
            String nvpb = nv.getDepartmentName();
            System.out.println("Id nhân viên:" + id);
            System.out.println("Tên nhân viên:" + nvName);
            System.out.println("Tuổi nhân viên:" + age);
            System.out.println("Ngày tham gia:" + date);
            System.out.println("Thuộc phòng ban:" + nvpb);
        }
    }
    public static int checkIdNV(NhanVien nhanVien) {
        while (true) {
            System.out.print("Nhập id nhân viên: ");
            int id = s.nextInt();
            if (nhanVien.getId() == id) {
                System.out.println("Trùng id nhân viên. Nhập lại");
            } else {
                nhanVien.setId(id);
                break;
            }
        }
        return nhanVien.getId();
    }
    public int showDetailNV(int id){
        return 0;
    }
    public void updateNhanVien(int id, ArrayList<NhanVien> nviens, NhanVien nhanVien)throws Exception{
    }
    public void deleteNhanVien(int id, NhanVien nhanVien){

    }
}
