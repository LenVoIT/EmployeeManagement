package vn.edu.likelion.service;

import vn.edu.likelion.entity.PhongBan;

import java.util.List;

public interface NhanVienService {
    public void addNhanVien();
    public void updateNhanVien();
    public void deleteNhanVien();
    List<PhongBan> getNhanVien(int NVId);
}
