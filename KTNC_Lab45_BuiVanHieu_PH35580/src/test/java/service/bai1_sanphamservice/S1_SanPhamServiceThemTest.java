package service.bai1_sanphamservice;

import model.SanPham;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S1_SanPhamServiceThemTest {
    S1_SanPhamServiceThem sanPhamService = new S1_SanPhamServiceThem();

    @Test
    public void Test1_ThemSPDone() {
        SanPham sanPham = new SanPham("1", "SP01", "Matcha da xay", 60.0f, "Xanh la ma", "10XXXXL", 15);
        int them = sanPhamService.themSanPham(sanPham);
        assertEquals(1, them);
        System.out.println("Them thah cong san pham: " + sanPham.getTenSanPham());
    }

    @Test
    public void Test2_ThemSPFalse_SLLonHonBienTren() {
        SanPham sanPham = new SanPham("2", "SP02", "Tra atixoooo", 40.0f, "Do hong", "6XXXXL", 100);
        int them = sanPhamService.themSanPham(sanPham);
        assertEquals(0, them);
        System.out.println("Them that bai do so san pham lon hon bien tren - ten SP: " + sanPham.getTenSanPham());
    }

    @Test
    public void Test3_ThemSPFalse_SLLonHonBienDuoi() {
        SanPham sanPham = new SanPham("3", "SP03", "Tra xanh khong duong", 50.0f, "Xa lanh", "19XXXXL", 0);
        int them = sanPhamService.themSanPham(sanPham);
        assertEquals(0, them);
        System.out.println("Them that bai do so san pham lon hon bien duoi - ten SP: " + sanPham.getTenSanPham());
    }

    @Test
    public void Test4_ThemSPDone_SoLuongBangBienTren() {
        SanPham sanPham = new SanPham("4", "SP04", "Tra sua cot dua", 50.0f, "Trang nhat", "M", 99);
        int them = sanPhamService.themSanPham(sanPham);
        assertEquals(1, them);
        System.out.println("Them thanh cong SP: " + sanPham.getTenSanPham());
    }

    @Test
    public void Test5_ThemSPDone_SoLuongBangBienDuoi() {
        SanPham sanPham = new SanPham("5", "SP05", "Tra sua nuong", 45.0f, "Trang nhat", "M", 1);
        int them = sanPhamService.themSanPham(sanPham);
        assertEquals(1, them);
        System.out.println("Them thanh cong SP: " + sanPham.getTenSanPham());
    }

}