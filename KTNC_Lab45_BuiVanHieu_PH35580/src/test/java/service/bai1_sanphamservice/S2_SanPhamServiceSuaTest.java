package service.bai1_sanphamservice;

import model.SanPham;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S2_SanPhamServiceSuaTest {

    S1_SanPhamServiceThem serviceThem = new S1_SanPhamServiceThem();
    S2_SanPhamServiceSua serviceSua = new S2_SanPhamServiceSua();

    @Test
    public void testSuaSanPham_MaSanPhamNull() {
        SanPham sp = new SanPham("1", "SP01", "San Pham 1", 100.0f, "Do", "L", 50);
        serviceThem.themSanPham(sp);

        SanPham spMoi = new SanPham("1", null, "San Pham Moi", 200.0f, "Xanh", "M", 30);
        assertEquals(-1, serviceSua.suaSanPham("1", spMoi));
    }

    @Test
    public void testSuaSanPham_IdKhongTonTai() {
        SanPham spMoi = new SanPham("999", "SP02", "San Pham Moi", 200.0f, "Xanh", "M", 30);
        assertEquals(-1, serviceSua.suaSanPham("999", spMoi));
    }

    @Test
    public void testSuaSanPham_MaSanPhamKhongHopLe() {
        SanPham sp = new SanPham("1", "SP01", "San Pham 2", 150.0f, "Den", "M", 40);
        serviceThem.themSanPham(sp);

        SanPham spMoi = new SanPham("1", null, "San Pham 2", 150.0f, "Den", "M", 40);
        assertEquals(-1, serviceSua.suaSanPham("1", spMoi));
    }


    @Test
    public void testSuaSanPham_MaSanPhamHopLeNhungThongTinKhacSai() {
        SanPham sp = new SanPham("3", "SP03", "San Pham 3", 300.0f, "Vang", "S", 20);
        serviceThem.themSanPham(sp);

        SanPham spMoi = new SanPham("3", "SP04", null, -50.0f, null, null, -10);
        assertEquals(-1, serviceSua.suaSanPham("3", spMoi));
    }

}