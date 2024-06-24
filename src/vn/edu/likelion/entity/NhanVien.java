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
    Scanner s = new Scanner(System.in);
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

    public void addNhanVien() {
        System.out.print("Nhập số lượng nhân viên muốn thêm: ");
        int slnv = s.nextInt();
        if (slnv < 1 || slnv > 4){
            System.out.print("Nhập sai số lượng, nhập lại\n");
        }else {
            for(int i = 0; i<slnv;i++) {
                System.out.print("Nhập id nhân viên:");
                int id = s.nextInt();
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
    public int showDetailNV(int id){
        return 0;
    }
    public void updateNhanVien(int id, ArrayList<NhanVien> nviens, NhanVien nhanVien)throws Exception{
        System.out.print("Nhập tên: ");
        String name = s.nextLine();
        System.out.print("Nhập tuổi");
        int age = s.nextInt();
        System.out.print("Nhập phòng ban: ");
        String department = s.nextLine();
        boolean isExist = false;

        for(NhanVien nv : nviens) {
            if (nv.getId() != id) {
                nhanVien.setEmployeeName(name);
                nhanVien.setAge(age);
                nhanVien.setDepartmentName(department);
                isExist = true;
                nviens.remove(nv);
                break;
            }
            if(!isExist) {
                throw new NullPointerException("Id not null");
            }
        }

    }

}
