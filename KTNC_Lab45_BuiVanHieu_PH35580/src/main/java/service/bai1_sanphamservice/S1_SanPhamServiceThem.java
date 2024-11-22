package service.bai1_sanphamservice;

import model.SanPham;

import java.util.ArrayList;
import java.util.List;

public class S1_SanPhamServiceThem {
    private List<SanPham> sanPhamList = new ArrayList<>();

    public int themSanPham(SanPham sanPham) {
        if (sanPham.getSoLuong() == (int) sanPham.getSoLuong()) {
            if (sanPham.getSoLuong() > 0 && sanPham.getSoLuong() < 100) {
                sanPhamList.add(sanPham);
                return 1;
            }
        }
        return 0;
    }

}
