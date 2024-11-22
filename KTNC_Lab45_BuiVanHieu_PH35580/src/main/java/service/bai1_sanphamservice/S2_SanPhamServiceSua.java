package service.bai1_sanphamservice;

import model.SanPham;

import java.util.ArrayList;
import java.util.List;

public class S2_SanPhamServiceSua {
    private List<SanPham> sanPhamList = new ArrayList<>();

    public int suaSanPham(String id, SanPham sanPhamSauSua) {
        for (SanPham sanPham : sanPhamList) {
            if (sanPham.getId().equals(id)) {
                if (sanPhamSauSua.getMaSanPham() == null || !sanPhamSauSua.getMaSanPham().startsWith("SP")) {
                    return 0;
                }
                sanPham.setMaSanPham(sanPhamSauSua.getMaSanPham());
                sanPham.setTenSanPham(sanPhamSauSua.getTenSanPham());
                sanPham.setGia(sanPhamSauSua.getGia());
                sanPham.setMauSac(sanPhamSauSua.getMauSac());
                sanPham.setKichThuoc(sanPhamSauSua.getKichThuoc());
                sanPham.setSoLuong(sanPhamSauSua.getSoLuong());
                return 1;
            }
        }
        return -1;
    }

}
